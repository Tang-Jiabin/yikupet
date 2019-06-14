package com.ykkoo.pet.service.impl;

import com.ykkoo.pet.common.http.KVResult;
import com.ykkoo.pet.common.token.TokenManage;
import com.ykkoo.pet.common.token.TokenModel;
import com.ykkoo.pet.pojo.*;
import com.ykkoo.pet.repository.PetHospitalAccountRepository;
import com.ykkoo.pet.repository.PetHospitalWithdrawalRepository;
import com.ykkoo.pet.repository.PetPromoterRepository;
import com.ykkoo.pet.service.PromoterService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 推广员
 *
 * @author : J.Tang
 * @version : v1.0
 * @date : 2019/6/13
 * @email : seven_tjb@163.com
 **/
@Data
@AllArgsConstructor
@Service
public class PromoterServiceImpl implements PromoterService {


    private PetPromoterRepository promoterRepository;
    private TokenManage tokenManage;
    private PetHospitalAccountRepository hospitalAccountRepository;
    private PetHospitalWithdrawalRepository hospitalWithdrawalRepository;


    @Override
    public KVResult signIn(String name, String password) {

        if (StringUtils.isEmpty(name) || StringUtils.isEmpty(password)) {
            return KVResult.put(411, "用户名或密码错误");
        }

        PetPromoter promoter = promoterRepository.findByAccountNumberAndPassword(name, password);

        if (promoter == null) {
            return KVResult.put(411, "用户名或密码错误");
        }
        if (promoter.getState()!=1) {
            return KVResult.put(412,"账号未激活");
        }

        TokenModel userToken = tokenManage.createPromoterToken(promoter.getPromoterId());

        promoter.setToken(userToken.getToken());
        promoter = promoterRepository.save(promoter);

        return KVResult.put(promoter);
    }

    @Override
    public KVResult getAccountInfo(Integer state, Integer promoterId) {
        List<PetHospitalAccount> hospitalAccountList = new ArrayList<>();
        if(state == 0){
            hospitalAccountList = hospitalAccountRepository.findAllByPromoterId(promoterId);
        }else {
            hospitalAccountList = hospitalAccountRepository.findAllByPromoterIdAndState(promoterId,state);
        }

        return KVResult.put(hospitalAccountList);
    }

    @Override
    public KVResult cashWithdrawal(Double amount, String cardNumber, String cardBank, String name, List<Integer> accountIdList, Integer promoterId) {

        PetPromoter promoter = promoterRepository.findByPromoterId(promoterId);

        PetHospitalWithdrawal hospitalWithdrawal = new PetHospitalWithdrawal();
        hospitalWithdrawal.setHospitalId(0);
        hospitalWithdrawal.setPromoterId(promoter.getPromoterId());
        hospitalWithdrawal.setAmount(amount);
        hospitalWithdrawal.setCardNumber(cardNumber);
        hospitalWithdrawal.setCardBank(cardBank);
        hospitalWithdrawal.setName(name);
        hospitalWithdrawal.setApplyDate(new Date());
        hospitalWithdrawal.setState(1);
        hospitalWithdrawal.setType(2);

        hospitalWithdrawalRepository.save(hospitalWithdrawal);

        List<PetHospitalAccount> hospitalAccountList = hospitalAccountRepository.findAllByAccountIdIn(accountIdList);
        for (PetHospitalAccount hospitalAccount : hospitalAccountList) {
            hospitalAccount.setState(2);
        }
        hospitalAccountRepository.saveAll(hospitalAccountList);

        return KVResult.put(HttpStatus.OK);
    }

    @Override
    public KVResult getWithdrawalInfo(Integer state, Integer promoterId) {


        List<PetHospitalWithdrawal> hospitalWithdrawalList = new ArrayList<>();

        if (state == 0) {
            hospitalWithdrawalList = hospitalWithdrawalRepository.findAllByPromoterId(promoterId);

        } else {
            hospitalWithdrawalList = hospitalWithdrawalRepository.findAllByPromoterIdAndState(promoterId,state);

        }

        return KVResult.put(hospitalWithdrawalList);

    }
}
