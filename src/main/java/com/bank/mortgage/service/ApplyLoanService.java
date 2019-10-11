package com.bank.mortgage.service;



import com.bank.mortgage.dto.ApplyLoanDto;
import com.bank.mortgage.dto.ApplyLoanResponseDto;
import com.bank.mortgage.dto.EmiDto;

public interface ApplyLoanService {
	
	
	Double emiService(EmiDto emiDto) throws Exception; 

	ApplyLoanResponseDto applyLoanService(ApplyLoanDto applyLoanDto) throws Exception;
}
