package com.ykkoo.pet.service;

import com.ykkoo.pet.common.http.KVResult;
import com.ykkoo.pet.dto.AdminDTO;
import com.ykkoo.pet.pojo.PetAdmin;
import javax.servlet.http.HttpServletRequest;

public abstract interface AdminService
{
  public abstract KVResult signIn(String paramString1, String paramString2, HttpServletRequest paramHttpServletRequest);
  
  public abstract KVResult addAdmin(AdminDTO paramAdminDTO, Integer paramInteger);
  
  public abstract PetAdmin findByAdminId(Integer paramInteger);
  
  public abstract PetAdmin save(PetAdmin paramPetAdmin);
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/service/AdminService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */