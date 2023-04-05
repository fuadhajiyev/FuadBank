package com.bank.service;

import com.bank.details.LoginDetails;
import com.bank.response.LoginResponse;

public interface LoginService {

	public LoginResponse customerLogin(LoginDetails details);
}
