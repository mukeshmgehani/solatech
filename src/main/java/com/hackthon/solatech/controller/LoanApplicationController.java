package com.hackthon.solatech.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hackthon.solatech.dto.StatusRes;
import com.hackthon.solatech.model.LoanApplicationRequestBo;
import com.hackthon.solatech.model.SolaTechResponseBO;
import com.hackthon.solatech.service.LoanApplicationService;

/**
 * @author hackathon
 *
 */
@RestController
@RequestMapping("/v1/loanapplication")
@CrossOrigin(allowedHeaders = { "*", "/" }, origins = { "*", "/" })
public class LoanApplicationController {

	@Autowired
	private LoanApplicationService loanApplicationService;

	private static final Logger lOGGER = LoggerFactory.getLogger(LoanApplicationController.class);

	@PostMapping("")
	private SolaTechResponseBO createApplication(@RequestBody LoanApplicationRequestBo loanApplicationRequestBo) {

		lOGGER.info("AccountController.createApplication has been called");

		return loanApplicationService.createApplication(loanApplicationRequestBo);
	}
	
	@GetMapping("/status")
	private StatusRes getStatus(@RequestParam("applicationId") int applicationId) {

		lOGGER.info("getStatus details from application");

		return loanApplicationService.getStatus(applicationId);
	}
	
}
