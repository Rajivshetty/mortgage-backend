package com.bank.mortagage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.mortagage.dto.LoginRequestDto;
import com.bank.mortagage.dto.LoginResponseDto;
import com.bank.mortagage.service.LoginService;

import lombok.extern.slf4j.Slf4j;




@RestController

@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })

@RequestMapping("/api")

@Slf4j
public class LoginController {
	

	@Autowired

	LoginService loginService;

	
	@PostMapping("/login")

	public ResponseEntity<LoginResponseDto> verify(@RequestBody LoginRequestDto loginRequestDto) {



		return new ResponseEntity<>(loginService.login(loginRequestDto), HttpStatus.FOUND);

	}
}
