package com.bank.mortgage.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="emi_scheduler")
@Setter
@Getter
public class EmiScheduler {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="emi_scheduler_id")
	private Integer emiSchedulerId;
	@Column(name="date")
	private Date date;
	@Column(name="principle_emi")
	private Double principleEmi;
	@Column(name="interest_emi")
	private Double interestEmi;
	@Column(name="total_emi")
	private Double totalEmi;
	@Column(name="principle_amount")
	private Double principleAmount;
	@Column(name="outstanding_principle_amount")
	private Double outstandingPrincipleAmount;
	private Integer customerId;
	public Integer getEmiSchedulerId() {
		return emiSchedulerId;
	}
	public void setEmiSchedulerId(Integer emiSchedulerId) {
		this.emiSchedulerId = emiSchedulerId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Double getPrincipleEmi() {
		return principleEmi;
	}
	public void setPrincipleEmi(Double principleEmi) {
		this.principleEmi = principleEmi;
	}
	public Double getInterestEmi() {
		return interestEmi;
	}
	public void setInterestEmi(Double interestEmi) {
		this.interestEmi = interestEmi;
	}
	public Double getTotalEmi() {
		return totalEmi;
	}
	public void setTotalEmi(Double totalEmi) {
		this.totalEmi = totalEmi;
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
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	


}
