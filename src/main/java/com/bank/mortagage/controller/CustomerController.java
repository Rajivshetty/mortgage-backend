package com.bank.mortagage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.mortagage.dto.AccountDetailsDto;
import com.bank.mortagage.service.CustomerService;

import lombok.extern.slf4j.Slf4j;

@RestController

@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })

@RequestMapping("/api")

@Slf4j
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/user/{id}/accountDetails")
	public ResponseEntity<AccountDetailsDto> getAccDetails(@PathVariable int id){
		
		return new ResponseEntity<>(customerService.getAccDetails(id),HttpStatus.OK);
	}
}
