package com.bank.service;

import com.bank.details.UpdateDetails;
import com.bank.model.User;
import com.bank.model.UserDisplay;
import com.bank.response.UpdateResponse;

public interface ProfileService {
	public UpdateResponse updateUser(UpdateDetails user);
	public User getUser(String username);
	public UserDisplay userDisplay(String username);

}
