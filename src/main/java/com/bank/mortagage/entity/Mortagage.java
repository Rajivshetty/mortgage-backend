package com.bank.mortagage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="mortagage")
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

private Integer tenure;

public Integer getTenure() {
	return tenure;
}
public void setTenure(Integer tenure) {
	this.tenure = tenure;
}
public Integer getMortagageId() {
	return mortagageId;
}
public void setMortagageId(Integer mortagageId) {
	this.mortagageId = mortagageId;
}
public Integer getLoanAccountNumber() {
	return loanAccountNumber;
}
public void setLoanAccountNumber(Integer loanAccountNumber) {
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
public Integer getCustomerId() {
	return customerId;
}
public void setCustomerId(Integer customerId) {
	this.customerId = customerId;
}
public Mortagage() {
	super();
	// TODO Auto-generated constructor stub
}


}
