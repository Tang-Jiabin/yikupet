package com.ykkoo.pet.repository;

import com.ykkoo.pet.common.type.VariableType;
import com.ykkoo.pet.pojo.PetVariable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract interface PetVariableRepository
  extends JpaRepository<PetVariable, Integer>
{
  public abstract PetVariable findByType(VariableType paramVariableType);
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/repository/PetVariableRepository.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */