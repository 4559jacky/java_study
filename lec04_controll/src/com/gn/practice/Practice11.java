package com.gn.practice;

import java.util.Scanner;

public class Practice11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("텍스트를 입력해주세요 : ");
		String str = sc.nextLine();
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==' ') {
				continue;
			}
			System.out.print(str.charAt(i));
		}
	}
}
