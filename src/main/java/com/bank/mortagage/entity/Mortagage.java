package com.bank.mortagage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="mortagage")
@Setter
@Getter
public class Mortagage {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="mortagage_id")
	private Integer mortagageId;
	@Column(name="loan_account_number")
	private Integer loanAccountNumber;
	@Column(name="loan_amount")
	private Double loanAmount;
	@Column(name="principle_amount")
	private Double principleAmount;
	@Column(name="outstanding_principle_amount")
	private Double outstandingPrincipleAmount;
	@Column(name="emi")
	private Double emi;
	private Integer customerId;


}
