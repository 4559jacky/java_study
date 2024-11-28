package com.gn.practice;

import java.util.*;

public class Practice04 {
	public static void main(String[] args) {
		// 철수가 여권을 만들려고 합니다.
		// 영어 이름 : Chulsu?
		// 20대 이신가요?
		// 1. 철수의 영어 이름과 나이 정보를 입력받습니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		// 2. 3가지 논리형 데이터 출력
		
		// (1) 영어 이름이 일치하나요? true
		boolean a = name.equals("Chulsu");
		System.out.println("영어 이름이 일치하나요? : " + a);
		// (2) 20대 인가요? false
		boolean b = 20<=age && age<30;
		System.out.println("20대 인가요?? : " + b);
		// (3) 영어 이름이 일치하면서 동시에 20대인가요? false
		boolean c = a&&b;
		System.out.println("영어 이름이 일치하면서 동시에 20대인가요? : " + c);
	}
}
