package com.ykkoo.pet.service;

import com.ykkoo.pet.common.http.KVResult;
import com.ykkoo.pet.pojo.PetAnimal;
import java.util.List;

public abstract interface PetAnimalService
{
  public abstract PetAnimal save(PetAnimal paramPetAnimal);
  
  public abstract PetAnimal createPetAnimal(Integer paramInteger, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString1, String paramString2, String paramString3, String paramString4);
  
  public abstract KVResult getAnimalPage(Integer paramInteger1, Integer paramInteger2, Integer paramInteger3);
  
  public abstract List<PetAnimal> findAllByAnimalIdIn(List<Integer> paramList);
  
  public abstract PetAnimal findByAnimalId(Integer paramInteger);
  
  public abstract PetAnimal findByElectronicCard(String paramString);
  
  public abstract KVResult getAnimalInfo(Integer paramInteger);
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/service/PetAnimalService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */