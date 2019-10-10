package com.bank.mortagage.entity;

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
@Table(name="account")
@Setter
@Getter
public class Account {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="account_id")
	private Integer accountId;
	@Column(name="account_number")
	private Integer accountNumber;
	@Column(name="account_type")
	private String accountType;
	@Column(name="balance")
	private Double balance;
	@Column(name="created")
	private Date created;
	private Integer customerId;

}
