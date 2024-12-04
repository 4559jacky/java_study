package com.gn.homework04.controller;

public class ExMethodController {
	// 1. 전달된 메세지를 출력하는 메소드 구현
	public void printMsg(String msg) {
		System.out.println(msg);
	}
	// 2. 1~100까지 합을 반환하는 메소드구현
	public int sumNumber() {
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		return sum;
	}
	// 3. 전달된 정수가 홀수인지 짝수인지 반환하는 메소드구현
	public String evenOdd(int num) {
		if(num%2==0) {
			return "짝수";
		} else {
			return "홀수";
		}
	}
	// 4. 전달된 문자열에 영문자가 있는지 확인하는 결과를 반환하는 메소드 구현
	public String engCheck(String str) {
		int count = 0;
		boolean upCase = false;
		boolean downCase = false;
		for(int i=0; i<str.length(); i++) {
			if(65<=(int)str.charAt(i)&&(int)str.charAt(i)<=90) {
				upCase = true;
			}
			if(97<=(int)str.charAt(i)&&(int)str.charAt(i)<=122) {
				downCase = true;
			}
			if(upCase||downCase) {
				count++;
			}
		}
		if(count>0) {
			return "영문자가 있음";
		} else {
			return "영문자가 없음";
		}
	}
	// 5. 문자열, 문자를 전달받아 문자열에 문자가 몇개있는지 출력하는 메소드구현
	public void countWord(String str, char c) {
		int cnt = 0;
		for(int i=0; i<str.length(); i++) {
			if(c==str.charAt(i)) {
				cnt++;
			}
		}
		System.out.println(str+"문자열에는 "+c+"문자가 "+cnt+"개 포함되어있습니다.");
	}
	// 6. 전달된 정수의 구구단을 출력하는 메소드 구현
	public void gugudan(int num) {
		System.out.println("=== "+num+"단 ===");
		for(int i=1; i<=9; i++) {
			System.out.println(num+" * "+i+" = "+num*i);
		}
	}
}
