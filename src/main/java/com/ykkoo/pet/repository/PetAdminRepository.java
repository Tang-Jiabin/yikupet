package com.ykkoo.pet.repository;

import com.ykkoo.pet.pojo.PetAdmin;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract interface PetAdminRepository
  extends JpaRepository<PetAdmin, Integer>
{
  public abstract PetAdmin findByAdminAccountAndAdminPassword(String paramString1, String paramString2);
  
  public abstract List<PetAdmin> findAllByAdminAccountOrAdminName(String paramString1, String paramString2);
  
  public abstract PetAdmin findByAdminId(Integer paramInteger);
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/repository/PetAdminRepository.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */