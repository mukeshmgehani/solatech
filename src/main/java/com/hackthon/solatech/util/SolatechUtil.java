
/**
 * 
 */
package com.hackthon.solatech.util;

import org.springframework.http.HttpStatus;

import com.hackthon.solatech.model.SolaTechResponseBO;

/**
 * @author hackathon
 *
 */
public class SolatechUtil {
	
	public static void prepareSolatechReponseBO(SolaTechResponseBO solaTechResponseBO,String message,HttpStatus httpStatus) {
		solaTechResponseBO.setMessage(message);
		solaTechResponseBO.setStatus(httpStatus.toString());
	}

}
