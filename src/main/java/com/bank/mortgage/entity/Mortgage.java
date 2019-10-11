package com.bank.mortgage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="mortgage")
@Setter
@Getter
public class Mortgage {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="mortgage_id")
	private Integer mortgageId;
	@Column(name="loan_account_number")
	private Long loanAccountNumber;
	@Column(name="loan_amount")
	private Double loanAmount;
	@Column(name="principle_amount")
	private Double principleAmount;
	@Column(name="outstanding_principle_amount")
	private Double outstandingPrincipleAmount;
	@Column(name="emi")
	private Double emi;
	@Column(name="tenure")
	private Integer tenure;
	@Column(unique=false)
	private Integer customerId;
	
	public Integer getMortgageId() {
		return mortgageId;
	}
	public void setMortgageId(Integer mortgageId) {
		this.mortgageId = mortgageId;
	}
	public Long getLoanAccountNumber() {
		return loanAccountNumber;
	}
	public void setLoanAccountNumber(Long loanAccountNumber) {
		this.loanAccountNumber = loanAccountNumber;
	}
	public Double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public Double getPrincipleAmount() {
		return principleAmount;
	}
	public void setPrincipleAmount(Double principleAmount) {
		this.principleAmount = principleAmount;
	}
	public Double getOutstandingPrincipleAmount() {
		return outstandingPrincipleAmount;
	}
	public void setOutstandingPrincipleAmount(Double outstandingPrincipleAmount) {
		this.outstandingPrincipleAmount = outstandingPrincipleAmount;
	}
	public Double getEmi() {
		return emi;
	}
	public void setEmi(Double emi) {
		this.emi = emi;
	}
	public Integer getTenure() {
		return tenure;
	}
	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	
	
	
	
	
	
	


}
