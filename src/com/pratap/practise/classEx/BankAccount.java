package com.pratap.practise.classEx;

public class BankAccount {
	private String accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private int phoneNumber;
	
	public BankAccount() {
		System.out.println("Empty constructor called");
	}
	
	public BankAccount(String accountNumber, double balance, String customerName, String email, int phoneNumber) {
		System.out.println("Account constructor with parameter called ");
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void depositeFund(double amount) {
		this.balance = balance + amount;
		System.out.println("Deposite of "+amount+" made. The new balance is "+balance);
	}
	
	public void withdrawFund(double amount) {
		if (this.balance - amount < 0) {
			System.out.println(" Only "+this.balance+ " available. Withdrawal not processed.");
		}else {
			this.balance -= amount;
			System.out.println("Withdrawal of "+amount+ "processed . Reamining balance = "+this.balance);
		}
	}
}
