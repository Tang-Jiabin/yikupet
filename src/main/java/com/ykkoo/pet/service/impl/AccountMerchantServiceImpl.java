package com.ykkoo.pet.service.impl;

import com.ykkoo.pet.common.http.KVResult;
import com.ykkoo.pet.service.AccountMerchantService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : J.Tang
 * @version : v1.0
 * @date : 2019/6/4
 * @email : seven_tjb@163.com
 **/
@Service
public class AccountMerchantServiceImpl implements AccountMerchantService {
    @Override
    public KVResult getAccountInfo(Integer paramInteger1, Integer paramInteger2) {
        return null;
    }

    @Override
    public KVResult cashWithdrawal(Double paramDouble, String paramString1, String paramString2, String paramString3, List<Integer> paramList, Integer paramInteger) {
        return null;
    }

    @Override
    public KVResult getWithdrawalInfo(Integer paramInteger1, Integer paramInteger2) {
        return null;
    }

    @Override
    public KVResult getWithdrawalPage(Integer paramInteger1, Integer paramInteger2, String paramString, Integer paramInteger3, Integer paramInteger4) {
        return null;
    }

    @Override
    public KVResult updateWithdrawal(Integer paramInteger1, Integer paramInteger2, Integer paramInteger3) {
        return null;
    }
}
