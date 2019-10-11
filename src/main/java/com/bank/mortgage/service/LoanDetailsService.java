package com.bank.mortgage.service;

import java.util.List;

import com.bank.mortgage.entity.Mortgage;

public interface LoanDetailsService {
	List<Mortgage> loanDetails(Integer customerId);

}
