package com.ykkoo.pet.service.impl;

import com.ykkoo.pet.common.http.KVResult;
import com.ykkoo.pet.service.SalesmanService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

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
    @Override
    public KVResult signIn(String name, String password) {
        return null;
    }
}
