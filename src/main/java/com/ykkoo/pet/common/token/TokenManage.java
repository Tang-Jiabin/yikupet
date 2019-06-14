package com.ykkoo.pet.common.token;

import com.ykkoo.pet.pojo.PetHospitalInfo;


public  interface TokenManage {
    TokenModel createAdminToken(Integer paramInteger);

    boolean checkAdminToken(String paramString);

    TokenModel getAdminToken(String paramString) ;

    TokenModel createUserToken(Integer paramInteger);

    boolean checkUserToken(String paramString);

    TokenModel getUserToken(String paramString) ;

    TokenModel createHospitalToken(PetHospitalInfo paramPetHospitalInfo);

    boolean checkHospitalToken(String paramString);

    TokenModel getHospitalToken(String paramString) ;

    TokenModel createPromoterToken(Integer promoterId);

    boolean checkPromoterToken(String token);

    TokenModel getPromoterToken(String token);
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/common/token/TokenManage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */