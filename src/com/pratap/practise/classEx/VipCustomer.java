package com.pratap.practise.classEx;

public class VipCustomer {
	private String customerName;
	private double creditLimit;
	private String emailId;
	
	
	
	public VipCustomer() {
		this("defaultName",0.0,"defaultEmail");
	}
	
	
	
	public VipCustomer(String customerName, double creditLimit) {
		this(customerName, creditLimit,"unknow@aa.com");
	}



	public VipCustomer(String name, double creditLimit, String email) {
		this.customerName = name;
		this.creditLimit = creditLimit;
		this.emailId = email;
	}


	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
}
