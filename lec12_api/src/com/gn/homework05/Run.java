package com.gn.homework05;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		sc.nextLine();
		System.out.print("생년월일 : ");
		String birth = sc.next();
		String firstName = name.substring(0,1);
		String year = birth.substring(0,4);
		String month = birth.substring(4,6);
		String password = firstName+birth.substring(2,4)+birth.substring(6,8)+name.substring(1);
		System.out.println("암호 : "+password);
	}
}
