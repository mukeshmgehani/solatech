package com.hackthon.solatech.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackthon.solatech.entity.Account;
import com.hackthon.solatech.exceptionhandling.AccountServiceFailed;
import com.hackthon.solatech.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountRepository accountRepository;

	@Transactional
	public Account createAccount(Account account) {
		try {
			account = accountRepository.save(account);
		} catch (IllegalArgumentException e) {
			throw new AccountServiceFailed(e.getMessage());
		}
		return account;
	}

}
