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

import com.hackthon.solatech.dto.StatusDTO;
import com.hackthon.solatech.model.ApplicationRequestBo;
import com.hackthon.solatech.model.SolaTechResponseBO;
import com.hackthon.solatech.service.ApplicationService;

/**
 * @author hackathon
 *
 */
@RestController
@RequestMapping("/v1/solatech")
@CrossOrigin(allowedHeaders = { "*", "/" }, origins = { "*", "/" })
public class ApplicationController {

	@Autowired
	private ApplicationService applicationService;

	private static final Logger lOGGER = LoggerFactory.getLogger(ApplicationController.class);

	@PostMapping("/applications")
	private SolaTechResponseBO createApplication(@RequestBody ApplicationRequestBo applicationRequestBo) {

		lOGGER.info("AccountController.createApplication has been called");

		return applicationService.createApplication(applicationRequestBo);
	}
	
	@GetMapping("/status")
	private StatusDTO getStatus(@RequestParam("applicationId") int applicationId) {

		lOGGER.info("AccountController.createApplication has been called");

		return applicationService.getStatus(applicationId);
	}
	
	
	
	
	

}
