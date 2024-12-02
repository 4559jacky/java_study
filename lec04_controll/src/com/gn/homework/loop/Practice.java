package com.gn.homework.loop;

import java.util.Scanner;

public class Practice {
	
	// github Test
	// 24.11.30 16:18
	// test 16:22
	
	// 1~50까지 짝수 합하기
	public void practice01() {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while(true) {
			System.out.print("정수(1~50) : ");
			num = sc.nextInt();
			System.out.println("1~50 사이의 정수를 입력하세요.");
			if(1<=num&&num<=50) {
				int sum = 0;
				System.out.print("합계 : ");
				for(int i=1; i<=num; i++) {
					if(i%2==0) {
						sum += i;
					}
				}
				System.out.println(sum);
				break;
			}
		}
		
	}
	
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
				sc.close();
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
				sc.close();
				break;
			} else {
				System.out.println(text);
			}
		}
	}
	
	// 게임 재시작
	public void practice04() {
		Scanner sc = new Scanner(System.in);
		String str = "";
		do {
			System.out.println("게임을 실행합니다!");
			System.out.println("게임을 다시 플레이하시겠습니까?(yes/no)");		
			str = sc.nextLine();
		} while(str.equals("yes"));
		System.out.println("게임을 종료합니다.");
		
		
	}
		
	// 양수만 더하기
	public void practice05() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true) {
			System.out.print("숫자(0을 입력하면 종료) : ");
			int num = sc.nextInt();
			if(num>0) {
				sum += num;
			}
			if(num==0) {
				System.out.print("양수의 합계 : " + sum);
				break;
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
		
		while(true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			if(num<=0) {
				System.out.println("양수가 아닙니다.");
			} else {
				for(int i=1; i<=num; i++) {
					if(i%2==0) {
						System.out.print("수");
					} else {
						System.out.print("박");
					}
				}
				sc.close();
				break;
			}
		}
	}
	
	// 1~50까지 짝수 합하기
	public void practice08() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("문자열 : ");
			String str = sc.nextLine();
			System.out.print("문자 : ");
			char c = sc.nextLine().charAt(0);
			int count = 0;
			for(int i=0; i<str.length(); i++) {
				if(str.charAt(i)==c) {
					count++;
				}
			}
			System.out.println("포함된 개수 : " + count);
			
			System.out.print("다시 입력하시겠습니까? : ");
			String str1 = sc.nextLine();
			if(str1.equals("N")) {
				sc.close();
				break;
			} else {
				System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
				System.out.print("다시 입력하시겠습니까? : ");
				str1 = sc.nextLine();
			}
			
		}
		
		
	}

}
