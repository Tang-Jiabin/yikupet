package com.ykkoo.pet.repository;

import com.ykkoo.pet.pojo.PetPromoter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * 推广员
 *
 * @author : J.Tang
 * @version : v1.0
 * @date : 2019/6/12
 * @email : seven_tjb@163.com
 **/
@Repository
public interface PetPromoterRepository extends JpaRepository<PetPromoter,Integer>, JpaSpecificationExecutor<PetPromoter> {
    PetPromoter findByPromoterId(Integer promoterId);
}
