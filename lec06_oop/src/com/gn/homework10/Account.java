package com.gn.homework10;

public class Account {
	private String accountNumber;
	private int balance;
	
	public Account() {}
	public Account(String accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	// getter
	public String getAccountNumber() {
		return accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	
	public void deposit(int amount) { // 입금
		this.balance += amount;
	}
	
	public void withdraw(int amount) { // 출금
		this.balance -= amount;
	}
}
