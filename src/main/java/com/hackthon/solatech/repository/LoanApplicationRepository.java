package com.hackthon.solatech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hackthon.solatech.dto.StatusRes;
import com.hackthon.solatech.entity.LoanApplication;

/**
 * @author hackathon
 *
 */
@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Integer> {
	
	@Query("select c.name, r.name, a.amount,a.status from LoanApplication a join Representative r on a.id = r.id join Corporate c on a.id=c.corporate_id where a.id=?1")
	 public StatusRes getStatusByApplicationId(Integer applicationId);
	
	


}
