package com.bank.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.model.ChequebookRequest;

public interface ChequeBookRepository extends JpaRepository<ChequebookRequest, Integer>{

	public List<ChequebookRequest> findByAccount(long account);
}
