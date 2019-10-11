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
@Table(name="customer")
@Setter
@Getter
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="customer_id")
	private Integer customerId;
	@Column(name="customer_name")
	private String customerName;
	@Column(name="password")
	private String password;
	@Column(name="email")
	private String email;
	@Column(name="phone_number")
	private String phoneNumber;
	@Column(name="address")
	private String address;
	@Column(name="annual_income")
	private Double annualIncome;
	@Column(name="age")
	private Integer age;
	@Column(name="property_value")
	private Double propertyValue;
	

}
