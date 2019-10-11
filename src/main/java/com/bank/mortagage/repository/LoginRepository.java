package com.bank.mortagage.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.mortagage.entity.Customer;

@Repository
public interface LoginRepository extends JpaRepository<Customer, Integer> {
	
	Customer findByCustomerNameAndPassword(String name, String password);

	Optional<Customer> findByCustomerId(Integer customerId);
}
