package com.bank.mortgage.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.mortgage.dto.ApplyLoanDto;
import com.bank.mortgage.dto.ApplyLoanResponseDto;
import com.bank.mortgage.dto.EmiDto;
import com.bank.mortgage.service.ApplyLoanService;

@RestController
@RequestMapping("/user")
public class ApplyLoanContorller {
	
	@Autowired
	private ApplyLoanService applyLoanService;
	
	
	@PostMapping("/emi")
	public Double emi(@RequestBody EmiDto emiDto) throws Exception {
		
		Double emi=applyLoanService.emiService(emiDto);
		return emi;
		
	}
	
	@PostMapping("/loan")
	public ApplyLoanResponseDto applyLoan(@RequestBody ApplyLoanDto applyLoanDto) throws Exception  {
		
		
		
		return applyLoanService.applyLoanService(applyLoanDto);
		
		
	}

}
