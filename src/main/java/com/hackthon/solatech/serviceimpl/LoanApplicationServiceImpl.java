/**
 * 
 */
package com.hackthon.solatech.serviceimpl;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.hackthon.solatech.dto.ApplicationTransformer;
import com.hackthon.solatech.dto.StatusRes;
import com.hackthon.solatech.entity.LoanApplication;
import com.hackthon.solatech.entity.Corporate;
import com.hackthon.solatech.entity.Representative;
import com.hackthon.solatech.exceptionhandling.AccountServiceFailed;
import com.hackthon.solatech.model.LoanApplicationRequestBo;
import com.hackthon.solatech.model.LoanApplicationResponseBo;
import com.hackthon.solatech.model.SolaTechResponseBO;
import com.hackthon.solatech.repository.LoanApplicationRepository;
import com.hackthon.solatech.repository.CorporateRepository;
import com.hackthon.solatech.repository.RepresentativeRepository;
import com.hackthon.solatech.service.LoanApplicationService;
import com.hackthon.solatech.util.SolatechUtil;
import com.hackthon.solatech.util.exception.CustomExceptionHandler;

/**
 * @author User1
 *
 */
@Service
public class LoanApplicationServiceImpl implements LoanApplicationService {

	private static final Logger lOGGER = LoggerFactory.getLogger(LoanApplicationServiceImpl.class);

	@Autowired
	private LoanApplicationRepository loanApplicationRepository;

	@Autowired
	private CorporateRepository corporateRepository;

	@Autowired
	private RepresentativeRepository representativeRepository;

	@Autowired
	private ApplicationTransformer applicationTransformer;

	@Autowired
	StatusRes statusDetails;

	/**
	 * save loanapplication form
	 */
	@Override
	@Transactional
	public SolaTechResponseBO createApplication(LoanApplicationRequestBo loanApplicationRequestBo) {
		lOGGER.info("ApplicationServiceImpl.createApplication has been called");

		Corporate corporate = applicationTransformer.applicationRequestBoToCorporate(loanApplicationRequestBo);

		try{
			corporateRepository.save(corporate);
		}catch (CustomExceptionHandler e) {
			throw new AccountServiceFailed("Corprate Data has been failed to save \n"+e.getMessage());
		}
		

		Representative representative = applicationTransformer
				.applicationRequestBoToRepresentative(loanApplicationRequestBo, corporate);
		
		try{
			representativeRepository.save(representative);
		}catch (CustomExceptionHandler e) {
			throw new AccountServiceFailed("Represtative Data has been failed to save \n"+e.getMessage());
		}
		
		
		
		LoanApplication loanApplication = applicationTransformer
				.applicationRequestBoToApplication(loanApplicationRequestBo, corporate, representative);
		
		try{
			loanApplicationRepository.save(loanApplication);
		}catch (CustomExceptionHandler e) {
			throw new AccountServiceFailed("Loan Application Data has been failed to save \n"+e.getMessage());
		}
		
		LoanApplicationResponseBo loanApplicationResponseBo=new LoanApplicationResponseBo();
		loanApplicationResponseBo.setLoanApplicationId(loanApplication.getId());
		SolatechUtil.prepareSolatechReponseBO(loanApplicationResponseBo, "Application has been submitted", HttpStatus.CREATED);
		return loanApplicationResponseBo;
	}

	/**
	 * Get Status according to applicationId
	 */
	@Override
	public StatusRes getStatus(int applicationId) {
		lOGGER.info("ApplicationServiceImpl.getStatus has been called to getStatus details");
		StatusRes statusByApplicationId = null;
		try {
			 statusByApplicationId = loanApplicationRepository.getStatusByApplicationId(applicationId);
		}catch (CustomExceptionHandler e) {
			throw new AccountServiceFailed(e.getMessage());
		}
		
		return statusByApplicationId;

	}

}
