package com.bank.mortgage.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.mortgage.dto.ApplyLoanDto;
import com.bank.mortgage.dto.ApplyLoanResponseDto;
import com.bank.mortgage.dto.EmiDto;
import com.bank.mortgage.entity.Customer;
import com.bank.mortgage.entity.Mortgage;
import com.bank.mortgage.exception.CommonException;
import com.bank.mortgage.repository.ApplyLoanRepository;
import com.bank.mortgage.repository.CustomerRepository;

@Service
public class ApplyLoanServiceImpl implements ApplyLoanService {

	@Autowired
	private ApplyLoanRepository applyLoanRepository;

	@Autowired
	private CustomerRepository customerRepository;

	// EMI Calculator Service Method and Check availability
	public Double emiService(EmiDto emiDto) throws CommonException {

		Optional<Customer> customer = customerRepository.findById(emiDto.getCustomerId());
		Double annualSal = customer.get().getAnnualIncome();
		Integer age = customer.get().getAge();
		Double emi = 0.0;
		Double loanAmount = emiDto.getLoanAmount();
		if (loanAmount <= 2 * annualSal && age >= 18 && age <= 60) {
			Integer tenure = emiDto.getTenure();
			Double interestAmount = (loanAmount * tenure) / 10;
			Double totalAmount = loanAmount + interestAmount;
			emi = totalAmount / (tenure * 12);

		} else {
			throw new CommonException("You are not eligible for loan");
		}

		return emi;

	}

	@Override
	public ApplyLoanResponseDto applyLoanService(ApplyLoanDto applyLoanDto) throws CommonException {

		Optional<Customer> customer = customerRepository.findById(applyLoanDto.getCustomerId());
		Customer customerRerturned = null;
		if (customer.isPresent()) {
			customerRerturned = customer.get();

		}

		Integer customerId = customerRerturned.getCustomerId();

		// Integer id=customer.get().getCustomerId();
		/*
		 * Integer age=customer.get().getAge(); Double
		 * annualSal=customer.get().getAnnualIncome();
		 */

		Double emi = 0.0;
		Double totalAmount = 0.0;
		Double amount = applyLoanDto.getAmount();
		// if(amount<=2*annualSal && age<=18 && age>=60) {

		Integer tenure = applyLoanDto.getTenure();
		Double interestAmount = (amount * tenure) / 10;
		totalAmount = amount + interestAmount;
		emi = totalAmount / (tenure * 12);
		// }else {

		// throw new CommonException("Your are not eligible for this loan");
		// }

		Mortgage mortgage = new Mortgage();

		mortgage.setCustomerId(applyLoanDto.getCustomerId());
		mortgage.setLoanAccountNumber(System.currentTimeMillis());
		mortgage.setEmi(emi);
		mortgage.setLoanAmount(totalAmount);
		mortgage.setOutstandingPrincipleAmount(applyLoanDto.getAmount());
		mortgage.setPrincipleAmount(applyLoanDto.getAmount());

		mortgage.setTenure(applyLoanDto.getTenure());
		Mortgage motgageapply = applyLoanRepository.save(mortgage);

		ApplyLoanResponseDto applyLoanResponseDto = new ApplyLoanResponseDto();
		applyLoanResponseDto.setLoanAccountNumber(motgageapply.getLoanAccountNumber());
		applyLoanResponseDto.setEmi(motgageapply.getEmi());
		applyLoanResponseDto.setPayableAmount(motgageapply.getLoanAmount());
		applyLoanResponseDto.setStatus("loan successfully applied for this Customer Id " + customerId);

		return applyLoanResponseDto;

	}

}
