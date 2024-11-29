package com.gn.homework.condition;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 놀이동산 입장료 계산하기");
		System.out.println("2. 일기예보");
		System.out.println("3. 세개의 정수 비교하기");
		System.out.println("4. 철수네 공장");
		System.out.println("5. 헬스 마니아 철수");
		System.out.println("6. 합격인가? 불합격인가?");
		System.out.print("선택 : ");
		int num = sc.nextInt();
		Practice practice = new Practice();
		switch(num) {
			case 1 :
				practice.practice01();
				break;
			case 2 :
				practice.practice02();
				break;
			case 3 :
				practice.practice03();
				break;
			case 4 :
				practice.practice04();
				break;
			case 5 :
				practice.practice05();
				break;
			case 6 :
				practice.practice06();
				break;
		}

	}

}
