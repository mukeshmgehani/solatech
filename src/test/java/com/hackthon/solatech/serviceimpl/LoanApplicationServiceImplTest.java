package com.hackthon.solatech.serviceimpl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.hackthon.solatech.dto.ApplicationTransformer;
import com.hackthon.solatech.dto.StatusRes;
import com.hackthon.solatech.entity.Corporate;
import com.hackthon.solatech.entity.LoanApplication;
import com.hackthon.solatech.entity.Representative;
import com.hackthon.solatech.exceptionhandling.AccountServiceFailed;
import com.hackthon.solatech.model.LoanApplicationRequestBo;
import com.hackthon.solatech.model.LoanApplicationResponseBo;
import com.hackthon.solatech.repository.CorporateRepository;
import com.hackthon.solatech.repository.LoanApplicationRepository;
import com.hackthon.solatech.repository.RepresentativeRepository;
import com.hackthon.solatech.service.LoanApplicationService;

public class LoanApplicationServiceImplTest {
	
	@InjectMocks
	private LoanApplicationServiceImpl applicationServiceImpl;
	
	@Mock
	private LoanApplicationService loanApplicationService;
	
	@Mock
	private LoanApplicationRepository loanApplicationRepository;

	@Mock
	private CorporateRepository corporateRepository;

	@Mock
	private RepresentativeRepository representativeRepository;

	@Mock
	private ApplicationTransformer applicationTransformer;

	@Mock
	private StatusRes statusDetails;

	@Mock
	private LoanApplicationRequestBo loanApplicationRequestBo;
	

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testCreateApplicationWhenApplicationDataSaved() {
		LoanApplicationRequestBo loanApplicationRequestBo=prepareLoanApplicationRequestBo();
		LoanApplicationResponseBo loanApplicationResponseBo=new LoanApplicationResponseBo();
		loanApplicationResponseBo.setLoanApplicationId(1);
		Corporate corporate=prepareCorporate(loanApplicationRequestBo);
		Representative representative=prepareRepresentative(loanApplicationRequestBo, corporate);
		LoanApplication loanApplication=prepareLoanApplication(loanApplicationRequestBo, corporate, representative);
		Mockito.when(applicationTransformer.applicationRequestBoToCorporate(loanApplicationRequestBo)).thenReturn(corporate);
		Mockito.when(applicationTransformer.applicationRequestBoToRepresentative(loanApplicationRequestBo, corporate)).thenReturn(representative);
		Mockito.when(applicationTransformer.applicationRequestBoToApplication(loanApplicationRequestBo, corporate, representative)).thenReturn(loanApplication);
		Mockito.when(corporateRepository.save(corporate)).thenReturn(corporate);
		Mockito.when(representativeRepository.save(representative)).thenReturn(representative);
		Mockito.when(loanApplicationRepository.save(loanApplication)).thenReturn(loanApplication);
		
		LoanApplicationResponseBo actual=(LoanApplicationResponseBo) applicationServiceImpl.createApplication(loanApplicationRequestBo);
		Assert.assertEquals(loanApplicationResponseBo.getLoanApplicationId(), actual.getLoanApplicationId());
	}
//	
//	@Test(expected = AccountServiceFailed.class)
//	public void testCreateApplicationWhenErrorOccuredWhileSavingApplicationDataSaved() {
//		LoanApplicationRequestBo loanApplicationRequestBo=prepareLoanApplicationRequestBo();
//		LoanApplicationResponseBo loanApplicationResponseBo=new LoanApplicationResponseBo();
//		loanApplicationResponseBo.setLoanApplicationId(1);
//		Corporate corporate=prepareCorporate(loanApplicationRequestBo);
//		Representative representative=prepareRepresentative(loanApplicationRequestBo, corporate);
//		LoanApplication loanApplication=prepareLoanApplication(loanApplicationRequestBo, corporate, representative);
//		Mockito.when(applicationTransformer.applicationRequestBoToCorporate(loanApplicationRequestBo)).thenReturn(corporate);
//		Mockito.when(applicationTransformer.applicationRequestBoToRepresentative(loanApplicationRequestBo, corporate)).thenReturn(representative);
//		Mockito.when(applicationTransformer.applicationRequestBoToApplication(loanApplicationRequestBo, corporate, representative)).thenReturn(loanApplication);
//		Mockito.when(corporateRepository.save(corporate)).thenReturn(corporate);
//		Mockito.when(representativeRepository.save(representative)).thenReturn(representative);
//		Mockito.when(loanApplicationRepository.save(loanApplication)).thenThrow(new RuntimeException());
//		
//		LoanApplicationResponseBo actual=(LoanApplicationResponseBo) applicationServiceImpl.createApplication(loanApplicationRequestBo);
//	}
	
	private LoanApplicationRequestBo prepareLoanApplicationRequestBo() {
		LoanApplicationRequestBo loanApplicationRequestBo=new LoanApplicationRequestBo();
		loanApplicationRequestBo.setAmount(new BigDecimal(100000L));
		loanApplicationRequestBo.setCorporateAddress("Test Corporate Address");
		loanApplicationRequestBo.setCorporateAge(3);
		loanApplicationRequestBo.setCorporateCurrentDebt(new BigDecimal(1000L));
		loanApplicationRequestBo.setCorporateFinancialStatement("Test Financial");
		loanApplicationRequestBo.setCorporateLegalStructure("test Legal Structure");
		loanApplicationRequestBo.setCorporateName("test Corporate name");
		loanApplicationRequestBo.setCorporateRevenueLastYear("100000$");
		loanApplicationRequestBo.setPuropse("Assest purchase");
		loanApplicationRequestBo.setRepresentiveAddress("test represantive address");
		loanApplicationRequestBo.setRepresentiveCitizenShip("test represantive citizen ship");
		loanApplicationRequestBo.setRepresentiveDateOfBirth("1992-01-23");
		loanApplicationRequestBo.setRepresentiveEmail("mukeshmgehani@gmail.com");
		loanApplicationRequestBo.setRepresentiveName("Mukesh Gehani");
		loanApplicationRequestBo.setRepresentivePassportNumber("k8393099");
		loanApplicationRequestBo.setRepresentivePhoneNumber("9898989898");
		loanApplicationRequestBo.setTerm(3);
		
		return loanApplicationRequestBo;
	}
	
	private Corporate prepareCorporate(LoanApplicationRequestBo loanApplicationRequestBo) {
		Corporate corporate=new Corporate();
		corporate.setAddress(loanApplicationRequestBo.getCorporateAddress());
		corporate.setFinancialStatement(loanApplicationRequestBo.getCorporateFinancialStatement());
		corporate.setLegalStructure(loanApplicationRequestBo.getCorporateLegalStructure());
		corporate.setName(loanApplicationRequestBo.getCorporateName());
		corporate.setRevenueLastYear(loanApplicationRequestBo.getCorporateRevenueLastYear());
		corporate.setAge(loanApplicationRequestBo.getCorporateAge());
		corporate.setCurrentDebt(loanApplicationRequestBo.getCorporateCurrentDebt());
		corporate.setCorporate_id(1L);
		return corporate;
	}
private Representative prepareRepresentative(LoanApplicationRequestBo loanApplicationRequestBo, Corporate corporate) {
	String DATE_FORMATTER= "yyyy-MM-dd";
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
	representative.setId(1L);
	return representative;
}
	private LoanApplication prepareLoanApplication(LoanApplicationRequestBo loanApplicationRequestBo, Corporate corporate, Representative representative) {
		LoanApplication loanApplication=new LoanApplication();
		loanApplication.setAmount(loanApplicationRequestBo.getAmount());
		loanApplication.setPuropse(loanApplicationRequestBo.getPuropse());
		loanApplication.setTerm(loanApplicationRequestBo.getTerm());
		loanApplication.setStatus("IN_PROGRESS");
		loanApplication.setCorporate(corporate);
		loanApplication.setRepresentative(representative);
		loanApplication.setId(1);
		return loanApplication;
	}
}

