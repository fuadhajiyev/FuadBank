package com.bank.service;
import com.bank.model.User;
import com.bank.response.RegisterResponse;

public interface RegistrationService {

	public RegisterResponse createAccount(User details); 
	public boolean usernameAlreadyExists(String username);
	public boolean EmailAlreadyExists(String email);
	public boolean PhoneAlreadyExists(long l);
}
