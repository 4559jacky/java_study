package com.gn.homework;

import java.util.*;

public class Homework01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		String money = "";
		if(age>=65) {
			money = "무료";
		} else if(age>=19) {
			money = "30000원";
		} else if(age>=13) {
			money = "20000원";
		} else if(age>=3) {
			money = "10000원";
		} else {
			money = "무료";
		}
		
		System.out.println("당신의 놀이동산 요금은 " + money + "입니다.");
	}
}
