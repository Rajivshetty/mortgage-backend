package com.bank.mortgage.dto;

public class ApplyLoanResponseDto {
	
	private Long loanAccountNumber;
	private Double emi;
	private Double payableAmount;
	private String status;
	
	public Long getLoanAccountNumber() {
		return loanAccountNumber;
	}
	public void setLoanAccountNumber(Long loanAccountNumber) {
		this.loanAccountNumber = loanAccountNumber;
	}
	public Double getEmi() {
		return emi;
	}
	public void setEmi(Double emi) {
		this.emi = emi;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Double getPayableAmount() {
		return payableAmount;
	}
	public void setPayableAmount(Double payableAmount) {
		this.payableAmount = payableAmount;
	}
	
	

}
