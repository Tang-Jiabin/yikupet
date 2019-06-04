package com.ykkoo.pet.repository;

import com.ykkoo.pet.pojo.PetAnimal;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public abstract interface PetAnimalRepository
  extends JpaRepository<PetAnimal, Integer>, JpaSpecificationExecutor<PetAnimal>
{
  public abstract PetAnimal findByAnimalId(Integer paramInteger);
  
  public abstract List<PetAnimal> findAllByAnimalIdIn(List<Integer> paramList);
  
  public abstract PetAnimal findByElectronicCard(String paramString);
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/repository/PetAnimalRepository.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */