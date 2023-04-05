package com.bank.service;

import com.bank.model.Account;
import com.bank.response.DepositResponse;
import com.bank.response.TransferResponse;
import com.bank.response.WithdrawResponse;

public interface AccountService {

	public Account newAccount(String username,int userId);
	public Account getAccount(String username);
	public DepositResponse deposit(long acc,int amount);
	public WithdrawResponse withdraw(long acc,int amount);
	public TransferResponse transfer(long saccount,long raccount,int amount);
	public Account getAccountDetails(long account);
	public Account updateAccount(Account account);
}
