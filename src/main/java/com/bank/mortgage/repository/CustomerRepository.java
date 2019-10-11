package com.bank.mortgage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.mortgage.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	

}
