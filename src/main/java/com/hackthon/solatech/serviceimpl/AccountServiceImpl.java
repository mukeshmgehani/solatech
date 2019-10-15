package com.hackthon.solatech.serviceimpl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackthon.solatech.entity.Account;
import com.hackthon.solatech.exceptionhandling.AccountServiceFailed;
import com.hackthon.solatech.repository.AccountRepository;
import com.hackthon.solatech.service.AccountService;

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

	@Override
	public Account getAccount(String accountId) {
		Optional<Account> findById;
		try {
			findById = accountRepository.findById(Long.parseLong(accountId));
		} catch (IllegalArgumentException e) {
			throw new AccountServiceFailed(e.getMessage());
		}
		return findById.get();
	}

}
