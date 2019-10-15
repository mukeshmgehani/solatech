package com.hackthon.solatech.serviceimpl;

import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.hackthon.solatech.entity.Account;
import com.hackthon.solatech.repository.AccountRepository;

@RunWith(MockitoJUnitRunner.class)
public class AccountServiceImplTest {

	@Mock
	AccountServiceImpl accountServiceImpl;

	@Mock
	AccountRepository accountRepository;

	Account account = new Account();

	@Before
	public void setup() {
		account.setAccountId(1234l);
		account.setAccountType("Loan");
		account.setBalance(new BigDecimal(10000));
		account.setRepresentativeId(12l);

	}

	//@Test
	public void testCreateAccount() {
		when(this.accountRepository.save(account)).thenReturn(account);
		Account createAccount = accountServiceImpl.createAccount(account);
		assertNull(createAccount);
	}

	@Test
	public void testGetAccount() {

	}

}
