package com.ykkoo.pet.vo;

import com.ykkoo.pet.pojo.PetHospitalAccount;
import com.ykkoo.pet.pojo.PetPromoter;
import lombok.Data;

import java.util.List;

/**
 * 销售员账户
 *
 * @author : J.Tang
 * @version : v1.0
 * @date : 2019/6/24
 * @email : seven_tjb@163.com
 **/
@Data
public class SalesmanAccountInfoVO {

    private PetPromoter promoter;

    private List<PetHospitalAccount> hospitalAccountList;

}
