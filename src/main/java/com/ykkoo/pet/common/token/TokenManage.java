package com.ykkoo.pet.common.token;

import com.auth0.jwt.exceptions.JWTVerificationException;
import com.ykkoo.pet.pojo.PetHospitalInfo;
import java.io.UnsupportedEncodingException;

public abstract interface TokenManage
{
  public abstract TokenModel createAdminToken(Integer paramInteger);
  
  public abstract boolean checkAdminToken(String paramString)
    throws UnsupportedEncodingException, JWTVerificationException;
  
  public abstract TokenModel getAdminToken(String paramString)
    throws UnsupportedEncodingException, JWTVerificationException;
  
  public abstract TokenModel createUserToken(Integer paramInteger);
  
  public abstract boolean checkUserToken(String paramString);
  
  public abstract TokenModel getUserToken(String paramString)
    throws UnsupportedEncodingException;
  
  public abstract TokenModel createHospitalToken(PetHospitalInfo paramPetHospitalInfo);
  
  public abstract boolean checkHospitalToken(String paramString);
  
  public abstract TokenModel getHospitalToken(String paramString)
    throws UnsupportedEncodingException;
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/common/token/TokenManage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */