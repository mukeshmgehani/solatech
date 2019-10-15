package com.hackthon.solatech.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackthon.solatech.entity.Account;
import com.hackthon.solatech.exceptionhandling.AccountServiceFailed;
import com.hackthon.solatech.service.AccountService;

@RestController
@RequestMapping("/account")
@CrossOrigin(allowedHeaders = { "*", "/" }, origins = { "*", "/" })
public class AccountController {

	@Autowired
	private AccountService accountService;

	private static final Logger lOGGER = LoggerFactory.getLogger(ApplicationController.class);

	@PostMapping
	private Account createAccount(@RequestBody Account accountreq) {

		lOGGER.info("AccountController.createAccount : ENTRY");
		try {
			if (accountreq == null) {
				throw new AccountServiceFailed("Account Details not found");
			}

			accountreq = accountService.createAccount(accountreq);
		} catch (AccountServiceFailed e) {
			throw new AccountServiceFailed("Internal Server Exception while getting exception");
		}
		return accountreq;
	}

}
