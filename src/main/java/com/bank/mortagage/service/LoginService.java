package com.bank.mortagage.service;

import org.springframework.stereotype.Service;

import com.bank.mortagage.dto.LoginRequestDto;
import com.bank.mortagage.dto.LoginResponseDto;

@Service
public interface LoginService {
	
	public LoginResponseDto login(LoginRequestDto loginRequestDto);
}
