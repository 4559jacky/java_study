package com.gn.homework;

import java.util.*;

public class Homework02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구슬의 개수 : " );
		int num = sc.nextInt();
		String str = "";
		if(num%2==0) {
			str = "짝수";
		} else {
			str = "홀수";
		}
		System.out.println("구슬의 개수는 " + str + "입니다.");
		
	}
}
