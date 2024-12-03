package com.gn.homework.two;

import java.util.Scanner;


public class Run {

	public static void main(String[] args) {
		Practice practice = new Practice();
		Scanner sc = new Scanner(System.in);
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 거꾸로 4 x 4 배열");
		System.out.println("2. 랜덤 4 x 4 배열");
		System.out.println("3. 알파벳 랜덤 2차원 배열");
		System.out.println("4. 문장 출력하기");
		System.out.println("5. 자리 배치하기");
		System.out.println("6. 학생의 위치 출력");
		System.out.print("선택 : ");
		int num = sc.nextInt();
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