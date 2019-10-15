/**
 * 
 */
package com.hackthon.solatech.dto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.hackthon.solatech.entity.Application;
import com.hackthon.solatech.model.ApplicationRequestBo;

/**
 * @author hackathon
 *
 */
@Component
public class ApplicationTransformer {
	
	private static final Logger lOGGER = LoggerFactory.getLogger(ApplicationTransformer.class);

	
	public Application applicationRequestBoToApplication(ApplicationRequestBo applicationRequestBo) {
		lOGGER.info("ApplicationTransformer.applicationRequestBoToApplication has been called");
		Application application=new Application();
		application.setAmount(applicationRequestBo.getAmount());
		application.setPuropse(applicationRequestBo.getPuropse());
		application.setTerm(applicationRequestBo.getTerm());
		return application;
	}

}
