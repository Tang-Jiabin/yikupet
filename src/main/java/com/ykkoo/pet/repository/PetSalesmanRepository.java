package com.ykkoo.pet.repository;

import com.ykkoo.pet.pojo.PetSalesman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * 销售员
 *
 * @author : J.Tang
 * @version : v1.0
 * @date : 2019/6/24
 * @email : seven_tjb@163.com
 **/
@Repository
public interface PetSalesmanRepository extends JpaRepository<PetSalesman,Integer>, JpaSpecificationExecutor<PetSalesman> {
    PetSalesman findBySalesmanId(Integer salesmanId);

    PetSalesman findByNameAndPassword(String name, String password);

}
