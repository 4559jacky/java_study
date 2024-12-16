package com.gn.homework04;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = "";
		String msg = "";
		while(true) {
			System.out.print("문자열 : ");
			text = sc.next();
			sc.nextLine();
			if(text.toUpperCase().equals("N")) break;
			msg = msg.concat(text);
		}
		System.out.println("최종 문자열 : "+msg);
	}
}
