package com.bank.service;

import java.util.List;
import com.bank.model.ChequebookRequest;
import com.bank.response.ChequeResponse;

public interface ChequebookService {

	public ChequeResponse createrequest(ChequebookRequest chequebook);
	public List<ChequebookRequest> getRequests(long account);
}
