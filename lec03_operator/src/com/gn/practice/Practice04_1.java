package com.gn.practice;

import java.util.*;

public class Practice04_1 {
	public static void main(String[] args) {
		// 이니셜 "Cheolsu" 맞으신가요?
		// 아니요 "Chulsu"입니다.
		// 혹시 "30"대 이신가요?
		// "23"살 입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이니셜이 맞으신가요? : ");
		String ini = sc.next();
		System.out.println("아니요 Chulsu 입니다.");
		System.out.print("혹시 나이가 맞나요? : ");
		int age = sc.nextInt();
		System.out.println("23살 입니다.");
		
	}
}
