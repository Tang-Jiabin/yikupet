package com.ykkoo.pet.service.impl;

import com.ykkoo.pet.common.http.KVResult;
import com.ykkoo.pet.common.token.TokenManage;
import com.ykkoo.pet.common.token.TokenModel;
import com.ykkoo.pet.pojo.PetHospital;
import com.ykkoo.pet.pojo.PetHospitalInfo;
import com.ykkoo.pet.repository.PetHospitalInfoRepository;
import com.ykkoo.pet.repository.PetHospitalRepository;
import com.ykkoo.pet.service.UserMerchantService;
import com.ykkoo.pet.vo.UserVO;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;


@Service
public class UserMerchantServiceImpl implements UserMerchantService {
      private static final Logger log = LoggerFactory.getLogger(UserMerchantServiceImpl.class);

    public UserMerchantServiceImpl(PetHospitalInfoRepository hospitalInfoRepository, PetHospitalRepository hospitalRepository, TokenManage tokenManage) {
        this.hospitalInfoRepository = hospitalInfoRepository;
        this.hospitalRepository = hospitalRepository;
        this.tokenManage = tokenManage;
    }


    private PetHospitalInfoRepository hospitalInfoRepository;

    private PetHospitalRepository hospitalRepository;
    private TokenManage tokenManage;

    public KVResult signIn(String name, String password) {
        if ((StringUtils.isEmpty(name)) || (StringUtils.isEmpty(password))) {
            return KVResult.put(Integer.valueOf(411), "账号密码错误");
        }
        PetHospitalInfo hospitalInfo = this.hospitalInfoRepository.findByHospitalAccountAndHospitalPassword(name, password);
        if (hospitalInfo == null) {
            return KVResult.put(Integer.valueOf(411), "账号密码错误");
        }
        PetHospital hospital = this.hospitalRepository.findByHospitalId(hospitalInfo.getHospitalId());

        if (hospital.getCooperationState()!=1) {
            return KVResult.put(412,"尚未通过审核");
        }

        TokenModel userToken = this.tokenManage.createHospitalToken(hospitalInfo);
        UserVO userVO = new UserVO();
        userVO.setNickName(hospital.getHospitalName());
        userVO.setHeadPortrait(hospital.getHospitalHeadPortrait());
        userVO.setToken(hospitalInfo.getToken());

        userVO.setCreateDate(hospitalInfo.getCreateDate());
        userVO.setLoginDate(new Date());
        userVO.setUpdateDate(new Date());



        return KVResult.put(userVO);
    }
}


