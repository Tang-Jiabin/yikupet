package com.ykkoo.pet.service.impl;

import java.util.*;

import com.ykkoo.pet.common.http.KVResult;
import com.ykkoo.pet.pojo.*;
import com.ykkoo.pet.repository.PetHospitalAccountRepository;
import com.ykkoo.pet.repository.PetHospitalInfoRepository;
import com.ykkoo.pet.repository.PetHospitalRepository;
import com.ykkoo.pet.repository.PetHospitalWithdrawalRepository;
import com.ykkoo.pet.service.AccountMerchantService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.Predicate;

/**
 * @author : J.Tang
 * @version : v1.0
 * @date : 2019/6/4
 * @email : seven_tjb@163.com
 **/
@AllArgsConstructor
@Service
public class AccountMerchantServiceImpl implements AccountMerchantService {

    private PetHospitalAccountRepository hospitalAccountRepository;
    private PetHospitalInfoRepository hospitalInfoRepository;
    private PetHospitalRepository hospitalRepository;
    private PetHospitalWithdrawalRepository hospitalWithdrawalRepository;

    @Override
    public KVResult getAccountInfo(Integer paramInteger1, Integer paramInteger2) {
        List<PetHospitalAccount> hospitalAccountList;
        if (paramInteger1 == 0) {
            hospitalAccountList = hospitalAccountRepository.findAllByHospitalId(paramInteger2);
        } else {
            hospitalAccountList = hospitalAccountRepository.findAllByHospitalIdAndState(paramInteger2, paramInteger1);
        }

        PetHospitalInfo hospitalInfo1 = hospitalInfoRepository.findByHospitalInfoId(paramInteger2);
        PetHospital hospitalInfo = hospitalRepository.findByHospitalId(hospitalInfo1.getHospitalId());
        Map<String, Object> map = new HashMap<>();
        map.put("hospitalAccountList", hospitalAccountList);
        map.put("hospitalInfo", hospitalInfo);

        return KVResult.put(map);
    }

    @Override
    public KVResult cashWithdrawal(Double amount, String cardNumber, String cardBank, String name, List<Integer> accountIdList, Integer hospitalInfoId) {

        PetHospitalInfo hospitalInfo = hospitalInfoRepository.findByHospitalInfoId(hospitalInfoId);
        PetHospital hospital = hospitalRepository.findByHospitalId(hospitalInfo.getHospitalId());

        PetHospitalWithdrawal hospitalWithdrawal = new PetHospitalWithdrawal();
        hospitalWithdrawal.setHospitalId(hospital.getHospitalId());
        hospitalWithdrawal.setAmount(amount);
        hospitalWithdrawal.setCardNumber(cardNumber);
        hospitalWithdrawal.setCardBank(cardBank);
        hospitalWithdrawal.setName(name);
        hospitalWithdrawal.setApplyDate(new Date());
        hospitalWithdrawal.setState(1);
        hospitalWithdrawal.setType(1);

        hospitalWithdrawalRepository.save(hospitalWithdrawal);

        List<PetHospitalAccount> hospitalAccountList = hospitalAccountRepository.findAllByAccountIdIn(accountIdList);
        for (PetHospitalAccount hospitalAccount : hospitalAccountList) {
            hospitalAccount.setState(2);
        }
        hospitalAccountRepository.saveAll(hospitalAccountList);

        return KVResult.put(HttpStatus.OK);
    }

    @Override
    public KVResult getWithdrawalInfo(Integer paramInteger1, Integer paramInteger2) {

        PetHospitalInfo hospitalInfo = hospitalInfoRepository.findByHospitalInfoId(paramInteger2);
        PetHospital hospital = hospitalRepository.findByHospitalId(hospitalInfo.getHospitalId());

        List<PetHospitalWithdrawal> hospitalWithdrawalList = new ArrayList<>();

        if (paramInteger1 == 0) {
            hospitalWithdrawalList = hospitalWithdrawalRepository.findAllByHospitalId(hospital.getHospitalId());

        } else {
            hospitalWithdrawalList = hospitalWithdrawalRepository.findAllByHospitalIdAndState(hospital.getHospitalId(),paramInteger1);

        }

        return KVResult.put(hospitalWithdrawalList);

    }

    @Override
    public KVResult getWithdrawalPage(Integer page, Integer size,String  name, Integer type,Integer state,Integer adminId) {

        Pageable pageable = PageRequest.of(page, 10, Sort.Direction.DESC, "withdrawalId");
        Page<PetHospitalWithdrawal> hospitalWithdrawalPage = hospitalWithdrawalRepository.findAll((root, query, criteriaBuilder) -> {
            List<Predicate> list = new ArrayList<>();


            if (state != null && state != 0) {
                list.add(criteriaBuilder.equal(root.get("state").as(Integer.class), state));
            }
            if (type != null && type != 0) {
                list.add(criteriaBuilder.equal(root.get("type").as(Integer.class), type));
            }


            Predicate[] p = new Predicate[list.size()];
            return criteriaBuilder.and(list.toArray(p));
        }, pageable);



        return KVResult.put(hospitalWithdrawalPage);
    }

    @Override
    public KVResult updateWithdrawal(Integer paramInteger1, Integer paramInteger2, Integer paramInteger3) {

        PetHospitalWithdrawal hospitalWithdrawal = hospitalWithdrawalRepository.findByWithdrawalId(paramInteger1);
        hospitalWithdrawal.setState(paramInteger2);

        hospitalWithdrawalRepository.save(hospitalWithdrawal);
        return KVResult.put(HttpStatus.OK);
    }
}
