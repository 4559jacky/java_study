package com.gn.homework03;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String email = sc.nextLine();
		email = email.trim();
		int idx = email.indexOf("@");
		String id = email.substring(0, idx);
		email = email.substring(idx);
		if(email.equals("@goodee.co.kr")) {
			email = id.toUpperCase() + email;
			System.out.println(email);
		} else {
			System.out.println("유효하지 않은 이메일입니다.");
		}
	}
}
