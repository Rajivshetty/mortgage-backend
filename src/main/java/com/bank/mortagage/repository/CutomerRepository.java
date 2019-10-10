package com.bank.mortagage.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.mortagage.entity.Account;

@Repository
public interface CutomerRepository extends JpaRepository<Account, Integer>{

	Optional<Account> findByCustomerId(int id);

}
