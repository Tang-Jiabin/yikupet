package com.ykkoo.pet.service;

import com.ykkoo.pet.common.http.KVResult;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 推广员
 *
 * @author : J.Tang
 * @version : v1.0
 * @date : 2019/6/13
 * @email : seven_tjb@163.com
 **/
public interface PromoterService {
    KVResult signIn(String name, String password);

    KVResult getAccountInfo(Integer state, Integer promoterId);

    KVResult cashWithdrawal(Double amount, String cardNumber, String cardBank, String name, List<Integer> accountIdList, Integer promoterId);

    KVResult getWithdrawalInfo(Integer state, Integer promoterId);
}
