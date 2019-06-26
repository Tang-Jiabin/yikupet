package com.ykkoo.pet.service;

import com.ykkoo.pet.common.http.KVResult;

import java.util.Date;

public interface SalesmanService {
    KVResult signIn(String name, String password);

    KVResult getAccountInfo(Date startDate, Date endDate, Integer salesmanId);

}
