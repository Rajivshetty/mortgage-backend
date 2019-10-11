package com.bank.mortgage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bank.mortgage.entity.Mortgage;

@Repository
public interface ApplyLoanRepository extends JpaRepository<Mortgage, Integer>{

	@Query("SELECT m FROM Mortgage m WHERE m.customerId=:customerId")
	List<Mortgage> findAllById(@Param("customerId") Integer customerId);

}
