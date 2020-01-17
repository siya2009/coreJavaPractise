package com.pratap.practise.classEx;

public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount shashiAccount = new BankAccount("33333",0.0, "Shashi","ss@aa.com",989898878);
		System.out.println(shashiAccount.getAccountNumber()); 
		System.out.println(shashiAccount.getCustomerName());
		shashiAccount.withdrawFund(100.0);
		
		shashiAccount.depositeFund(50.0);
		shashiAccount.withdrawFund(100.0);
		
		shashiAccount.depositeFund(51.0);
		shashiAccount.withdrawFund(100.0);
	}

}
