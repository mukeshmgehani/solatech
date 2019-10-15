package com.hackthon.solatech.service;

import com.hackthon.solatech.dto.StatusRes;
import com.hackthon.solatech.model.LoanApplicationRequestBo;
import com.hackthon.solatech.model.SolaTechResponseBO;

public interface LoanApplicationService {
	
	SolaTechResponseBO createApplication(LoanApplicationRequestBo loanApplicationRequestBo);

	StatusRes getStatus(int applicationId);



}
