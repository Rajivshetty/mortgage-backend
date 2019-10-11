package com.bank.mortagage.entity;

import java.time.LocalDate;

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
@Table(name="emischeduler")
public class EmiScheduler {
	

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="emi_scheduler_id")
private Integer emiSchedulerId;
@Column(name="date")
private LocalDate date;
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

}
