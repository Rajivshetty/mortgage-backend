package com.bank.mortgage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.mortgage.entity.Mortgage;
import com.bank.mortgage.repository.ApplyLoanRepository;

@Service
public class LoanDetailsServiceImpl implements LoanDetailsService {

	@Autowired
	private ApplyLoanRepository applyLoanRepository;

	public List<Mortgage> loanDetails(Integer customerId) {

		List<Mortgage> mortgages = applyLoanRepository.findAllById(customerId);
		return mortgages;

	}

}
