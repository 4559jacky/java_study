package com.gn.practice;

import java.util.Scanner;

public class Practice03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		System.out.print("성별(F/M) : ");
		String gender = sc.nextLine();
		
		System.out.print("머리(cm) : ");
		int hair = sc.nextInt();
		
		if(gender.equals("M")) {
			if(hair<=3) {
				System.out.println("합격입니다.");
			} else {
				System.out.println("불합격입니다.");
			}
		} else {
			if(hair<=7) {
				System.out.println("합격입니다.");
			} else {
				System.out.println("불합격입니다.");
			}
		}
		
		
	}
}