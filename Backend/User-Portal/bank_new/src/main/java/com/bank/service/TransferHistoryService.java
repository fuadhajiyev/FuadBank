package com.bank.service;

import java.util.List;

import com.bank.model.Transfer;

public interface TransferHistoryService {

	public Transfer addAction(long saccount, long raccount, int amount);
	public List<Transfer> getTransfers(long account);
}
