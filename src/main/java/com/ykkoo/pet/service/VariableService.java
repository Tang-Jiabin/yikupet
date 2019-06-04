package com.ykkoo.pet.service;

import com.ykkoo.pet.common.type.VariableType;
import com.ykkoo.pet.pojo.PetVariable;

public abstract interface VariableService
{
  public abstract PetVariable findByType(VariableType paramVariableType);
  
  public abstract PetVariable save(PetVariable paramPetVariable);
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/service/VariableService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */