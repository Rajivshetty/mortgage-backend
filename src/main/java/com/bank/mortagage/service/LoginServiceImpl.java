package com.bank.mortagage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.bank.mortagage.dto.LoginRequestDto;
import com.bank.mortagage.dto.LoginResponseDto;
import com.bank.mortagage.entity.Customer;
import com.bank.mortagage.exception.CommonException;
import com.bank.mortagage.repository.LoginRepository;
import com.bank.mortagage.util.CustomerUtil;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginRepository loginRepository;

	@Override

	public LoginResponseDto login(LoginRequestDto loginRequestDto) {

		String name = loginRequestDto.getName();
		String password = loginRequestDto.getPassword();

		Customer customer = loginRepository.findByCustomerNameAndPassword(loginRequestDto.getName(), loginRequestDto.getPassword());

		if (customer == null) {

			throw new CommonException(CustomerUtil.CUSTOMER_NOT_FOUND);
		}




		customer.setPassword(loginRequestDto.getPassword());


		LoginResponseDto loginResponseDto = new LoginResponseDto();

		loginResponseDto.setCustomerId(customer.getCustomerId());

		loginResponseDto.setStatusCode(HttpStatus.OK.value());

		loginResponseDto.setMessage("Log In is successfull");

		return loginResponseDto;

	}

}
