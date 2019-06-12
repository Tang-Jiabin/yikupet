package com.ykkoo.pet.repository;

import com.ykkoo.pet.pojo.PetDiseaseTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 疾病种类
 *
 * @author : J.Tang
 * @version : v1.0
 * @date : 2019/6/11
 * @email : seven_tjb@163.com
 **/
@Repository
public interface PetDiseaseTypesRepository extends JpaRepository<PetDiseaseTypes,Integer> {
    PetDiseaseTypes findByTypeId(Integer typeId);
}
