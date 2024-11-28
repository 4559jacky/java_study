package com.gn.homework;

import java.util.*;

public class Homework04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : " );
		int kor = sc.nextInt();
		
		System.out.print("수학 : " );
		int math = sc.nextInt();
		
		System.out.print("영어 : " );
		int eng = sc.nextInt();
		
		int sum = kor+math+eng;
		int avg = (kor+math+eng)/3;
		
		String phone_change =
		(kor>=60&&math>=60&&eng>=60) ? ((avg>=90) ? "휴대폰을 바꿀 수 있습니다." : "휴대폰을 바꿀 수 없습니다.") : "휴대폰을 바꿀 수 없습니다.";
		
		System.out.println("합계 : " + sum + "점");
		System.out.println("평균 : " + avg + "점");
		System.out.println(phone_change);
		
//		if(kor>=60&&math>=60&&eng>=60) {
//			if((kor+math+eng)/3>=90) {
//				System.out.println("휴대폰을 바꿀 수 있습니다.");
//			} else {
//				System.out.println("휴대폰을 바꿀 수 없습니다.");
//			}
//		} else {
//			System.out.println("휴대폰을 바꿀 수 없습니다.");
//		}
		
		
		
		
	}
}
