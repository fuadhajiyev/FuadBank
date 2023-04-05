package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.model.ChequebookRequest;
import com.bank.response.ChequeResponse;
import com.bank.service.ChequebookService;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ChequeBookController {
	@Autowired
	private ChequebookService service;

	@PostMapping("/cheque/request")
	public ChequeResponse createrequest(@RequestBody ChequebookRequest chequebook) {
		return service.createrequest(chequebook);
	}

	@GetMapping("/cheque/getbyAccount/{account}")
	public List<ChequebookRequest> getRequests(@PathVariable("account") long account) {
		List<ChequebookRequest> list=service.getRequests(account);
		//Collections.reverse(list);
		//return service.getRequests(account);
		return list;
	}
}
