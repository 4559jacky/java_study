package com.gn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework01_1 {
	public static void main(String[] args) {
		InputMismatchException exc = new InputMismatchException("잘못된 값입니다. 숫자를 입력해주세요.");
		// 1~50사이의 숫자 중 랜덤한 숫자를 도출하세요.
		int random = (int)(Math.random()*50)+1;
		System.out.println(random);
		// 사용자가 해당 랜덤 숫자를 맞출 때까지 계속 숫자를 입력 받으세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("1~50사이의 숫자 : ");
		while(true) {
			try {
				int number = sc.nextInt();
				while(true) {
					if(random==number) {
						System.out.println("축하합니다~ 정답이에요");
						break;
					} else if(number<random) {
						System.out.println("Up");
						System.out.print("1~50사이의 숫자 : ");
						number = sc.nextInt();
					} else if(random<number) {
						System.out.println("Down");
						System.out.print("1~50사이의 숫자 : ");
						number = sc.nextInt();
					}
				}
			} catch(InputMismatchException e) {
				System.out.println(exc.getMessage());
				sc.nextLine();
				System.out.print("1~50사이의 숫자 : ");
			}
		}
		
	}
}
