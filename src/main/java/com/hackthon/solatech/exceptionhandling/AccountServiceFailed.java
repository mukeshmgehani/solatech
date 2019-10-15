package com.hackthon.solatech.exceptionhandling;

public class AccountServiceFailed extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public AccountServiceFailed() {
		super();
	}

	public AccountServiceFailed(String message) {
		super(message);
	}

}
