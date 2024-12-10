package com.gn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		int random = (int)(Math.random()*50)+1;
		System.out.println(random);
		randomNum(random);
	}
	
	public static void randomNum(int random) {
		InputMismatchException e = new InputMismatchException("잘못된 값입니다. 숫자를 입력해주세요.");
		try {
			int num = number();
			while(true) {
				if(random<num) {
					System.out.println("Down!");
					num = number();
				} else if(num<random) {
					System.out.println("Up!");
					num = number();
				} else if(random==num) {
					System.out.println("축하합니다~ 정답이에용~");
					break;
				}
			}
		} catch(InputMismatchException e1) {
			System.out.println(e.getMessage());
			randomNum(random);
		}
	}
	
	public static int number() {
		System.out.print("1~50사이의 숫자 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}
	
}
