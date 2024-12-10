package com.gn.study.controller;

import com.gn.study.model.vo.Account;
import com.gn.study.model.vo.Calculator;
import com.gn.study.model.vo.InsufficientBalanceException;
import com.gn.study.model.vo.User;

public class Run {
	public static void main(String[] args) {
		int a = 3;
		int b = 0;
		
		try {
			System.out.println(a/b);
		} catch(ArithmeticException e) {
			System.out.println("0으로 나누면 안돼용~~");
		} finally {
			System.out.println("계산끝!!");
		}
		System.out.println(a+b);
		
		System.out.println("===== Null 조심 =====");
		
		String[] arr = new String[3];
//		System.out.println(null.length());
		// ㄴ> 컴파일 시점에서 이미 오류인걸 인지함.
		try {
			System.out.println(arr[0].length());
		} catch(NullPointerException e) {
			System.out.println("길이를 구할 수 없습니다.");
		}
		
		System.out.println("===== 배열 조심 =====");
		int[] numbers = {1,2,3};
		try {
			System.out.println(numbers[3]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 영역을 벗어났습니다.");
		}
		
		Calculator c = new Calculator();
		c.divide(3, 0);
		
		User u = new User();
		try {
			u.checkAge(18);
		} catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
		
		try {
			u.nameLength(null);
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("확인!!");
		
		System.out.println("======Account=======");
		
		Account ac = new Account("정재익", 50000);
		try {
			ac.withdraw(50000);
		} catch(InsufficientBalanceException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
