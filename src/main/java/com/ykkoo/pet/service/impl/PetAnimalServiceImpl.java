package com.ykkoo.pet.service.impl;

import com.google.common.collect.Lists;
import com.ykkoo.pet.common.http.KVResult;
import com.ykkoo.pet.dto.InsurancePolicyDTO;
import com.ykkoo.pet.pojo.PetAnimal;
import com.ykkoo.pet.pojo.PetHospital;
import com.ykkoo.pet.pojo.PetInsurancePolicy;
import com.ykkoo.pet.repository.PetAnimalRepository;
import com.ykkoo.pet.repository.PetInsurancePolicyRepository;
import com.ykkoo.pet.service.InsurancePolicyService;
import com.ykkoo.pet.service.PetAnimalService;
import com.ykkoo.pet.vo.InsurancePolicyVO;
import com.ykkoo.pet.vo.PageVo;
import com.ykkoo.pet.vo.PetAnimalVO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

/**
 * 宠物
 *
 * @author : J.Tang
 * @version : v1.0
 * @date : 2019/5/14
 * @email : seven_tjb@163.com
 **/
@Slf4j
@Service
@AllArgsConstructor
public class PetAnimalServiceImpl implements PetAnimalService {


    private PetAnimalRepository animalRepository;
    private PetInsurancePolicyRepository insurancePolicyRepository;

    @Override
    public PetAnimal save(PetAnimal animal) {
        return animalRepository.save(animal);
    }

    @Override
    public PetAnimal createPetAnimal(Integer userId, int species, int animalSex, int insuranceStatus, int claimsNumber, String animalName, String animalAge, String animalBreeds, String photo) {
        PetAnimal animal = new PetAnimal();

        String unknown = "Unknown";

        if (StringUtils.isEmpty(animalName)) {
            animalName = unknown;
        }
        animal.setAnimalName(animalName);

        if (StringUtils.isEmpty(animalAge)) {
            animalAge = unknown;
        }
        animal.setAnimalAge(animalAge);

        if (StringUtils.isEmpty(photo)) {
            photo = unknown;
        }
        animal.setAnimalPhoto(photo);

        if (StringUtils.isEmpty(species)) {
            species = 0;
        }
        animal.setAnimalSpecies(species);

        if (StringUtils.isEmpty(animalSex)) {
            animalSex = 0;
        }
        animal.setAnimalSex(animalSex);

        if (StringUtils.isEmpty(animalBreeds)) {
            animalBreeds = unknown;
        }
        animal.setAnimalBreeds(animalBreeds);
        animal.setCertificatesType("未知");
        animal.setCertificatesNo("未知");
        animal.setElectronicCard("未知");
        animal.setSource("未知");
        animal.setUserId(userId);
        animal.setInsuranceStatus(insuranceStatus);
        animal.setClaimsNumber(claimsNumber);

        return animal;
    }

    @Override
    public KVResult getAnimalPage(Integer page, Integer animalSpecies, Integer userId) {

        Pageable pageable = PageRequest.of(page, 10, Sort.Direction.DESC, "animalId");
        Page<PetAnimal> animalPage = animalRepository.findAll((root, query, criteriaBuilder) -> {
            List<Predicate> list = new ArrayList<>();

            if (animalSpecies != null && animalSpecies != 0) {
                list.add(criteriaBuilder.equal(root.get("animalSpecies").as(Integer.class), animalSpecies));
            }

            Predicate[] p = new Predicate[list.size()];
            return criteriaBuilder.and(list.toArray(p));
        }, pageable);

        PageVo<PetAnimalVO> animalPageVo = new PageVo<>();
        BeanUtils.copyProperties(animalPage, animalPageVo);
        List<PetAnimal> animalList = animalPage.getContent();
        List<PetAnimalVO> animalVOList = Lists.newArrayList();
        PetAnimalVO animalVO;
        List<InsurancePolicyVO> insurancePolicyVOList;
        InsurancePolicyVO insurancePolicyVO;
        List<PetInsurancePolicy> insurancePolicyList = insurancePolicyRepository.findByUserId(userId);
        for (PetAnimal animal : animalList) {
            animalVO = new PetAnimalVO();
            BeanUtils.copyProperties(animal, animalVO);
            insurancePolicyVOList = Lists.newArrayList();
            for (PetInsurancePolicy insurancePolicy : insurancePolicyList) {
                if (insurancePolicy.getAnimalId().equals(animal.getAnimalId())) {
                    insurancePolicyVO = new InsurancePolicyVO();
                    BeanUtils.copyProperties(insurancePolicy,insurancePolicyVO);
                    insurancePolicyVOList.add(insurancePolicyVO);
                }
            }
            animalVO.setInsurancePolicyList(insurancePolicyVOList);
            animalVOList.add(animalVO);
        }
        animalPageVo.setContent(animalVOList);

        return KVResult.put(animalPageVo);
    }

    @Override
    public List<PetAnimal> findAllByAnimalIdIn(List<Integer> animalIdList) {
        return animalRepository.findAllByAnimalIdIn(animalIdList);
    }

    @Override
    public PetAnimal findByAnimalId(Integer animalId) {
        return animalRepository.findByAnimalId(animalId);
    }

    @Override
    public PetAnimal findByElectronicCard(String paramString) {
        return null;
    }

    @Override
    public KVResult getAnimalInfo(Integer paramInteger) {
        return null;
    }
}
