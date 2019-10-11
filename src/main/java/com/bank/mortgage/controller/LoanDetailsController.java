package com.bank.mortgage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.mortgage.entity.Mortgage;
import com.bank.mortgage.service.LoanDetailsService;

@RestController
@RequestMapping("/user/v1")
public class LoanDetailsController {

	@Autowired
	private LoanDetailsService loanDetailsService;

	@GetMapping("/details/{customerId}")
	public List<Mortgage> fetchLoanDetail(@PathVariable("customerId") Integer customerId) {

		return loanDetailsService.loanDetails(customerId);

	}

}
