package com.bank.service;

import com.bank.model.Saccount;
import com.bank.response.DepositResponse;
import com.bank.response.TransferResponse;
import com.bank.response.WithdrawResponse;

public interface SaccountService {
	public Saccount getAccountDetails(long account);
	public Saccount getAccount(String username);
	public Saccount newAccount(String username,int userId);
	public DepositResponse deposit(long acc,int amount);
	public WithdrawResponse withdraw(long acc,int amount);
	public TransferResponse transfer(long saccount,long raccount,int amount);
}

