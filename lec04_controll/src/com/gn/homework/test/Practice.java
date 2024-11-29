package com.gn.homework.test;

import java.util.Scanner;

// 기능 메소드									
public class Practice {
	// 1번 기능 : 인사말 출력
	public void practice01() {
		System.out.println("안녕하세요~");
	}
	// 2번 기능 : 두 개의 숫자를 입력 받아서 합 출력
	public void practice02() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 : ");
		int a = sc.nextInt();
		System.out.print("두번째 수 : ");
		int b = sc.nextInt();
		System.out.println("두 수의 합 : " + (a+b));
		sc.close();
	}
	// 3번 기능
}
