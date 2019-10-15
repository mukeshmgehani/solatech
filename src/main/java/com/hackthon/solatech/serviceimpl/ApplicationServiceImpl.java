/**
 * 
 */
package com.hackthon.solatech.serviceimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.hackthon.solatech.dto.ApplicationTransformer;
import com.hackthon.solatech.dto.StatusRes;
import com.hackthon.solatech.entity.Application;
import com.hackthon.solatech.model.ApplicationRequestBo;
import com.hackthon.solatech.model.SolaTechResponseBO;
import com.hackthon.solatech.repository.ApplicationRepository;
import com.hackthon.solatech.service.ApplicationService;
import com.hackthon.solatech.util.SolatechUtil;

/**
 * @author User1
 *
 */
@Service
public class ApplicationServiceImpl implements ApplicationService {
	
	private static final Logger lOGGER = LoggerFactory.getLogger(ApplicationServiceImpl.class);

	
	@Autowired
	private ApplicationRepository applicationRepository;
	
	@Autowired
	private ApplicationTransformer applicationTransformer;
	
	@Autowired
	StatusRes statusDetails;
	
	/**
	 * save loanapplication form
	 */
	@Override
	public SolaTechResponseBO createApplication(ApplicationRequestBo applicationRequestBo) {
		lOGGER.info("ApplicationServiceImpl.createApplication has been called");
		
		Application application=applicationTransformer.applicationRequestBoToApplication(applicationRequestBo);
		applicationRepository.save(application);
		SolaTechResponseBO solaTechResponseBO=new SolaTechResponseBO();
		SolatechUtil.prepareSolatechReponseBO(solaTechResponseBO, "Application has been submitted", HttpStatus.CREATED);
		return solaTechResponseBO;
	}
	
	/**
	 * Get Status according to applicationId
	 */
	@Override
	 public StatusRes getStatus(int applicationId) {
		 lOGGER.info("ApplicationServiceImpl.getStatus has been called to getStatus details");
//		 applicationRepository.getStatusByApplicationId(applicationId);  
		 return statusDetails;
		
	}
	



}
