package com.hackthon.solatech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hackthon.solatech.dto.StatusRes;
import com.hackthon.solatech.entity.Application;

/**
 * @author hackathon
 *
 */
@Repository
public interface ApplicationRepository extends JpaRepository<Application, Integer> {
	
	 @Query("select cName,rName,amount,statusType from application app where c.name like %?1")
	   public StatusRes getStatusByApplicationId(Integer applicationId);
	
	


}
