package com.bank.mortagage.service;

import org.springframework.stereotype.Service;

import com.bank.mortagage.dto.AccountDetailsDto;

@Service
public interface CustomerService {

	AccountDetailsDto getAccDetails(int id);

}
