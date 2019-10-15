/**
 * 
 */
package com.hackthon.solatech.dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.hackthon.solatech.entity.LoanApplication;
import com.hackthon.solatech.entity.Corporate;
import com.hackthon.solatech.entity.Representative;
import com.hackthon.solatech.model.LoanApplicationRequestBo;

/**
 * @author hackathon
 *
 */
@Component
public class ApplicationTransformer {
	
	private static final Logger lOGGER = LoggerFactory.getLogger(ApplicationTransformer.class);

	private static final String DATE_FORMATTER= "yyyy-MM-dd";
	
	public LoanApplication applicationRequestBoToApplication(LoanApplicationRequestBo loanApplicationRequestBo, Corporate corporate, Representative representative) {
		lOGGER.info("ApplicationTransformer.applicationRequestBoToApplication has been called");
		LoanApplication loanApplication=new LoanApplication();
		loanApplication.setAmount(loanApplicationRequestBo.getAmount());
		loanApplication.setPuropse(loanApplicationRequestBo.getPuropse());
		loanApplication.setTerm(loanApplicationRequestBo.getTerm());
		loanApplication.setStatus("IN_PROGRESS");
		loanApplication.setCorporate(corporate);
		loanApplication.setRepresentative(representative);
		return loanApplication;
	}


	public Corporate applicationRequestBoToCorporate(LoanApplicationRequestBo loanApplicationRequestBo) {
		lOGGER.info("ApplicationTransformer.applicationRequestBoToCorporate has been called");
		Corporate corporate=new Corporate();
		corporate.setAddress(loanApplicationRequestBo.getCorporateAddress());
		corporate.setFinancialStatement(loanApplicationRequestBo.getCorporateFinancialStatement());
		corporate.setLegalStructure(loanApplicationRequestBo.getCorporateLegalStructure());
		corporate.setName(loanApplicationRequestBo.getCorporateName());
		corporate.setRevenueLastYear(loanApplicationRequestBo.getCorporateRevenueLastYear());
		corporate.setAge(loanApplicationRequestBo.getCorporateAge());
		corporate.setCurrentDebt(loanApplicationRequestBo.getCorporateCurrentDebt());
		return corporate;
	}


	public Representative applicationRequestBoToRepresentative(LoanApplicationRequestBo loanApplicationRequestBo, Corporate corporate) {
		lOGGER.info("ApplicationTransformer.applicationRequestBoToRepresentative has been called");
		Representative representative=new Representative();
		representative.setAddress(loanApplicationRequestBo.getRepresentiveAddress());
		representative.setCitizenShip(loanApplicationRequestBo.getRepresentiveCitizenShip());
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMATTER);
        LocalDate formatDateTime = LocalDate.parse(loanApplicationRequestBo.getRepresentiveDateOfBirth(), formatter);
		representative.setDate(formatDateTime.atStartOfDay());
		representative.setName(loanApplicationRequestBo.getRepresentiveName());
		representative.setEmail(loanApplicationRequestBo.getRepresentiveEmail());
		representative.setPassportNumber(loanApplicationRequestBo.getRepresentivePassportNumber());
		representative.setPhoneNumber(loanApplicationRequestBo.getRepresentivePhoneNumber());
		representative.setCorporate(corporate);
		return representative;
	}

}
