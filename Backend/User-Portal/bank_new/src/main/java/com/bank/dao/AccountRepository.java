package com.bank.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bank.model.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Integer>{

	public Account findByUsername(String username);
	public Account findByAccno(long accno);
}
