package com.bank.mortagage.service;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.bank.mortgage.entity.Mortgage;
import com.bank.mortgage.repository.ApplyLoanRepository;
import com.bank.mortgage.service.LoanDetailsServiceImpl;

@RunWith(SpringRunner.class)
public class LoanDetailsServiceImplTest {
	
	@InjectMocks
	private LoanDetailsServiceImpl loanDetailsServiceImpl;
	
	@MockBean
	private ApplyLoanRepository applyLoanRepository;
	
	@Test
	public void loanDetailsTest() {
		
		List<Mortgage> mortgages= new ArrayList();
		Mortgage mortgage=new Mortgage();
		
		mortgage.setMortgageId(1);
		mortgage.setLoanAccountNumber(4637l);
		mortgage.setLoanAmount(43663d);
		mortgage.setOutstandingPrincipleAmount(354562d);
		mortgage.setPrincipleAmount(354562d);
		mortgage.setEmi(3463d);
		mortgage.setTenure(2);
		mortgage.setCustomerId(2);
		
		//mortgages.add(mortgage);
		
		Mockito.when(applyLoanRepository.findAllById(2)).thenReturn(mortgages);
		
		assertNotNull(mortgages);
		

		
	}

}
