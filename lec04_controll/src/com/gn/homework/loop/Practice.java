package com.gn.homework.loop;

import java.util.Scanner;

public class Practice {
	// 구구단 무한반복
	public void practice02() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		while(true) {
			if(num<0) {
				System.out.println("양수만 입력해주세요.");
				System.out.print("숫자 : ");
				num = sc.nextInt();
			} else if(num>9) {
				System.out.println("9이하의 숫자를 입력해주세요.");
				System.out.print("숫자 : ");
				num = sc.nextInt();
			} else if(num==0) {
				break;
			} else {
				for(int i=num; i<=9; i++) {
					System.out.println("=== "+i+"단 ===");
					for(int j=1; j<=9; j++) {
						System.out.println(i+" * "+j+" = "+i*j);
					}
				}
				System.out.print("숫자 : ");
				num = sc.nextInt();
			}
			
		}
	}
	
	// 탈출합시다
	public void practice03() {
		Scanner sc = new Scanner(System.in);
		String text = "";
		while(true) {
			System.out.print("입력 : ");
			text = sc.nextLine();
			if(text.equals("탈출")) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println(text);
			}
		}
	}
	
	// 트리 만들기
	public void practice06() {
		
		String tree = "";
		String space = " ";
		String star = "*";
		
		for(int i=4; i>=0; i--) {
			tree = "";
			for(int j=1; j<=9; j++) {
				if(j<=i) {
					tree += space;
				} else if(j>9-i) { // i=4일때 j는6~9, i=3일때 j는7~9
					tree += space;
				} else {
					tree += star;
				}
			}
			System.out.println(tree);
		}
//		System.out.println("    *    "); // 빈칸 4칸, * 1개 i = 4
//		System.out.println("   ***   "); // 빈칸 3칸, * 3개 i = 3
//		System.out.println("  *****  "); // 빈칸 2칸, * 5개 i = 2
//		System.out.println(" ******* "); // 빈칸 1칸, * 7개 i = 1
//		System.out.println("*********"); // 빈칸 0칸, * 9개 i = 0
	}
	
	// 박수박수박
	public void practice07() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		while(true) {
			if(num<=0) {
				System.out.println("양수가 아닙니다.");
				System.out.print("정수 : ");
				num = sc.nextInt();
			} else {
				for(int i=1; i<=num; i++) {
					if(i%2==0) {
						System.out.print("수");
					} else {
						System.out.print("박");
					}
				}
				break;
			}
		}
	}
}
