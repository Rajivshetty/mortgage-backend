package com.bank.mortagage.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.mortagage.dto.AccountDetailsDto;
import com.bank.mortagage.entity.Account;
import com.bank.mortagage.repository.CutomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CutomerRepository customerRepository;
	@Override
	public AccountDetailsDto getAccDetails(int id) {
		
		Optional<Account> account = customerRepository.findByCustomerId(id);
		AccountDetailsDto accountDto = new AccountDetailsDto();
		accountDto.setAccountNumber(account.get().getAccountNumber());
		accountDto.setBalance(account.get().getBalance());
		accountDto.setAccountType(account.get().getAccountType());
		accountDto.setCreated(account.get().getCreated());
		return accountDto;
	}

}
