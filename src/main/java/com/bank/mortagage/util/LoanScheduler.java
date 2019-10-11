package com.bank.mortagage.util;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.bank.mortagage.entity.Mortagage;
import com.bank.mortagage.repository.LoanRepository;

@Component
public class LoanScheduler {

	@Autowired
	LoanRepository loanRepository;

	@Scheduled(fixedRate = 100000)
	public void loanDeduction() {
		System.out.println("test" + LocalDateTime.now());
		List<Mortagage> loans = loanRepository.findAll();

		List<Mortagage> recurredLoan = new ArrayList<>();
		double rateOfInterest = 10.0;

		loans.stream().forEach(mortgage -> {
			Mortagage mortgage1 = new Mortagage();
			Double interestAmount = interestCalculation(rateOfInterest, mortgage.getOutstandingPrincipleAmount());
			Double balance = principalCalculation(mortgage.getEmi(), interestAmount);
			Double overAllBalance = balanceAmount(mortgage.getOutstandingPrincipleAmount(), balance);
			mortgage.setTenure(mortgage.getTenure() - 1);
			mortgage.setOutstandingPrincipleAmount(overAllBalance);
			BeanUtils.copyProperties(mortgage, mortgage1);
			recurredLoan.add(mortgage1);
		});

		loanRepository.saveAll(recurredLoan);
	}

	public Double interestCalculation(Double rateOfInterest, Double balanceAmount) {
		Double interest = ((balanceAmount * rateOfInterest) / CustomerUtil.MONTH) * (100);
		System.out.println("interest " + interest);
		return interest;
	}

	public Double principalCalculation(Double emi, Double interestAmount) {
		Double principalAmount = emi - interestAmount;
		System.out.println("principalAmount " + principalAmount);
		return principalAmount;
	}

	public Double balanceAmount(Double balanceAmount, Double monthlyPrinicipalAmount) {
		Double principalBalance = balanceAmount - monthlyPrinicipalAmount;
		System.out.println("principalBalance " + principalBalance);
		return principalBalance;
	}

}
