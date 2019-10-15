package com.hackthon.solatech.service;

import com.hackthon.solatech.model.ApplicationRequestBo;
import com.hackthon.solatech.model.SolaTechResponseBO;

public interface ApplicationService {
	
	SolaTechResponseBO createApplication(ApplicationRequestBo applicationRequestBo);



}
