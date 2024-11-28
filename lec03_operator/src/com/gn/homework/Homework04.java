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
		
		System.out.println("합계 : " + (kor+math+eng) + "점");
		System.out.println("평균 : " + (kor+math+eng)/3 + "점");
		
		if(kor>=60&&math>=60&&eng>=60) {
			if((kor+math+eng)/3>=90) {
				System.out.println("휴대폰을 바꿀 수 있습니다.");
			} else {
				System.out.println("휴대폰을 바꿀 수 없습니다.");
			}
		} else {
			System.out.println("휴대폰을 바꿀 수 없습니다.");
		}
		
		
	}
}
