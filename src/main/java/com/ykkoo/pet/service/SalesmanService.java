package com.ykkoo.pet.service;

import com.ykkoo.pet.common.http.KVResult;

public interface SalesmanService {
    KVResult signIn(String name, String password);
}
