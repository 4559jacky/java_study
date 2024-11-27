package com.gn.homework;

import java.util.*;

public class Homework04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력하세요 : ");
		String str = sc.nextLine();
		int num = str.charAt(0);
		System.out.println(str + "의 유니코드 : " + num);
	}

}
