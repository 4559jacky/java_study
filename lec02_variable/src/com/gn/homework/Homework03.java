package com.gn.homework;

import java.util.*;

public class Homework03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		char one = str.charAt(0);
		char two = str.charAt(1);
		char three = str.charAt(2);
		System.out.println("첫번째 문자 : " + one);
		System.out.println("두번째 문자 : " + two);
		System.out.println("세번째 문자 : " + three);
	}

}
