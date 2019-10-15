/**
 * 
 */
package com.hackthon.solatech.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.hackthon.solatech.service.LoanApplicationService;

/**
 * @author hackathon
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class LoanApplicationControllerTest {

	@InjectMocks
	private LoanApplicationController loanApplicationController;
	
	@Mock
	private LoanApplicationService loanApplicationService;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
