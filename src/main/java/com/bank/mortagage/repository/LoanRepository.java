package com.bank.mortagage.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.mortagage.entity.Mortagage;

@Repository
public interface LoanRepository extends JpaRepository<Mortagage, Integer>{

}
