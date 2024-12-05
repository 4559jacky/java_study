package com.gn.homework10;

public class Main {
	public static void main(String[] args) {
		// 계좌번호가 "123-456-789"이고, 잔액이 100000원인 계좌 생성
		Account a1 = new Account("123-456-789", 100000);
		// 계좌번호가 "987-654-321"이고, 잔액이 50000원인 계좌 생성
		Account a2 = new Account("987-654-321", 50000);
		
		// 123-456-789 계좌에서 30000원 출금
		a1.withdraw(30000); // 70000
		// 987-654-321 계좌에 100000원 입금
		a2.deposit(100000); // 150000
		
		// 은행 객체 생성
		Bank bank = new Bank();
		// "123-456-789"에서 "987-654-321"으로 50000원 송금
		bank.transfer(a1, a2, 50000);
		
		// 각 계좌의 계좌번호와 잔액 출력
		System.out.println("계좌번호 : "+a1.getAccountNumber()+", "+"잔액 : "+a1.getBalance()+"원");
		System.out.println("계좌번호 : "+a2.getAccountNumber()+", "+"잔액 : "+a2.getBalance()+"원");
		
	}
}