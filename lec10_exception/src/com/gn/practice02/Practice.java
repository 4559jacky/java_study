package com.gn.practice02;

public class Practice {
	public void printStrLength(String str) {
		try {
			System.out.println("문자열 길이 : "+str.length());
		} catch(NullPointerException e) {
			System.out.print("NullPointerException 발생 : ");
			System.out.println(e.getMessage());
		}
	}
}
