package com.ykkoo.pet.service.impl;

import com.google.common.collect.Lists;
import com.ykkoo.pet.common.http.KVResult;
import com.ykkoo.pet.common.token.TokenManage;
import com.ykkoo.pet.common.token.TokenModel;
import com.ykkoo.pet.pojo.PetHospitalAccount;
import com.ykkoo.pet.pojo.PetPromoter;
import com.ykkoo.pet.pojo.PetSalesman;
import com.ykkoo.pet.repository.PetHospitalAccountRepository;
import com.ykkoo.pet.repository.PetPromoterRepository;
import com.ykkoo.pet.repository.PetSalesmanRepository;
import com.ykkoo.pet.service.SalesmanService;
import com.ykkoo.pet.vo.PromoterVO;
import com.ykkoo.pet.vo.SalesmanAccountInfoVO;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 销售人员
 *
 * @author J.Tang
 * @version V1.0
 * @email seven_tjb@163.com
 * @date 2019-06-23
 */

@Service
@AllArgsConstructor
public class SalesmanServiceImpl implements SalesmanService {

    private PetSalesmanRepository salesmanRepository;
    private TokenManage tokenManage;
    private PetHospitalAccountRepository hospitalAccountRepository;
    private PetPromoterRepository promoterRepository;

    @Override
    public KVResult signIn(String name, String password) {

        if (StringUtils.isEmpty(name) || StringUtils.isEmpty(password)) {
            return KVResult.put(411, "用户名或密码错误");
        }

        PetSalesman salesman = salesmanRepository.findByNameAndPassword(name, password);

        if (salesman == null) {
            return KVResult.put(411, "用户名或密码错误");
        }
        TokenModel salesmanToken = tokenManage.createSalesmanToken(salesman);
        salesman.setToken(salesmanToken.getToken());
        salesman = salesmanRepository.save(salesman);

        return KVResult.put(salesman);
    }

    @Override
    public KVResult getAccountInfo(Date startDate, Date endDate, Integer salesmanId) {

        List<PetPromoter> promoterList = promoterRepository.findAllBySalesmanId(salesmanId);

        List<Integer> promoterIdList = Lists.newArrayList();
        for (PetPromoter promoter : promoterList) {
            promoterIdList.add(promoter.getPromoterId());
        }

        List<PetHospitalAccount> hospitalAccountList = hospitalAccountRepository.findAllByPromoterIdInAndDateBetween(promoterIdList, startDate, endDate);

        SalesmanAccountInfoVO accountInfoVO;
        List<PetHospitalAccount> accountList;
        List<SalesmanAccountInfoVO> salesmanAccountInfoVOList = new ArrayList<>();
        for (PetPromoter promoter : promoterList) {
            accountInfoVO = new SalesmanAccountInfoVO();
            accountInfoVO.setPromoter(promoter);

            accountList = new ArrayList<>();
            for (PetHospitalAccount hospitalAccount : hospitalAccountList) {
                if (promoter.getPromoterId().equals(hospitalAccount.getPromoterId())) {
                    accountList.add(hospitalAccount);
                }
            }

            accountInfoVO.setHospitalAccountList(accountList);
            salesmanAccountInfoVOList.add(accountInfoVO);
        }

        return KVResult.put(salesmanAccountInfoVOList);
    }


}
