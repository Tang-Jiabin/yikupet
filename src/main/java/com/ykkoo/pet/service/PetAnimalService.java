package com.ykkoo.pet.service;

import com.ykkoo.pet.common.http.KVResult;
import com.ykkoo.pet.pojo.PetAnimal;
import java.util.List;

public interface PetAnimalService
{
  PetAnimal save(PetAnimal paramPetAnimal);
  
  PetAnimal createPetAnimal(Integer paramInteger, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString1, String paramString2, String paramString3, String paramString4);
  
  KVResult getAnimalPage(Integer paramInteger1, Integer paramInteger2, Integer paramInteger3);
  
  List<PetAnimal> findAllByAnimalIdIn(List<Integer> paramList);
  
  PetAnimal findByAnimalId(Integer paramInteger);
  
  PetAnimal findByElectronicCard(String paramString);
  
  KVResult getAnimalInfo(Integer paramInteger);
}