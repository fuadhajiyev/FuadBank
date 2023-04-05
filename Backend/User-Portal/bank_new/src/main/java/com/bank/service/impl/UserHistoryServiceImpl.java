package com.bank.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dao.UserHistoryRepository;
import com.bank.model.UserHistory;
import com.bank.service.UserHistoryService;

@Service
public class UserHistoryServiceImpl implements UserHistoryService{

	@Autowired
	private UserHistoryRepository dao;
	
	@Override
	public UserHistory addAction(long account, int amount, int balance, String action) {
		LocalDate today = LocalDate.now();
		
		UserHistory row=new UserHistory();
		row.setAccount(account);
		row.setAction(action);
		row.setAmount(amount);
		row.setDate(today);
		return dao.save(row);
	}

	@Override
	public List<UserHistory> getHistory(long account) {
		// TODO Auto-generated method stub
				return dao.findByAccount(account);
	}

}
