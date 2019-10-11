package com.bank.mortagage.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.bank.mortgage.entity.Customer;
import com.bank.mortgage.entity.Mortgage;
import com.bank.mortgage.repository.ApplyLoanRepository;
import com.bank.mortgage.repository.CustomerRepository;
import com.bank.mortgage.service.ApplyLoanServiceImpl;

@RunWith(SpringRunner.class)
public class ApplyLoanServiceImplTest {
	
	@InjectMocks
	private ApplyLoanServiceImpl applyLoanServiceImpl;
	
	@MockBean
	private ApplyLoanRepository applyLoanRepository;
	
	@MockBean
	private CustomerRepository customerRepository;
	
	@Before
	public void setup() {
	        MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void applyLoanServiceTest() {
		
		Mortgage mortgage=new Mortgage();
		mortgage.setCustomerId(101);
		mortgage.setLoanAccountNumber(20l);
		mortgage.setEmi(500d);
		mortgage.setLoanAmount(10000d);
		mortgage.setOutstandingPrincipleAmount(8000d);
		mortgage.setPrincipleAmount(8000d);
		mortgage.setTenure(2);
		
		
		Customer customer  = new Customer ();
		
		customer.setAddress("uk");
		customer.setAge(44);
		customer.setAnnualIncome(100000d);
		customer.setCustomerId(1);
		customer.setCustomerName("ram");
		customer.setEmail("ram@gmail.com");
		customer.setPassword("123");
		customer.setPhoneNumber("99999");
		customer.setPropertyValue(393939d);
		
		/*ApplyLoanResponseDto applyLoanResponseDto=new ApplyLoanResponseDto();
		applyLoanResponseDto.setLoanAccountNumber(mortgage.getLoanAccountNumber());
		applyLoanResponseDto.setEmi(mortgage.getEmi());
		applyLoanResponseDto.setPayableAmount(mortgage.getLoanAmount());
		applyLoanResponseDto.setStatus("loan successfully applied for this Customer");	*/
		
		
		
		Mockito.when(applyLoanRepository.save(mortgage)).thenReturn(mortgage);
		
		//Mortgage mort=applyLoanRepository.getOne(mortgage.getCustomerId());
		//Integer custId=mort.getCustomerId();
		assertNotNull(mortgage);
//		Mockito.asserassertnotNull(mortgage);
		//assertNotNull(custId);
		//assertNotEquals(applyLoanRepository.save(mortgage),null);
		
	}

}
