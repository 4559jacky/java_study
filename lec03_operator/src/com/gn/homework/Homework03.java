package com.gn.homework;

import java.util.*;

public class Homework03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("친구 수 : " );
		int friends = sc.nextInt();
		
		System.out.print("사탕의 수 : " );
		int candys = sc.nextInt();
		
		int person = candys/friends;
		int rest = candys%friends;
		
		System.out.println("1인당 사탕 개수 : " + person + "개");
		System.out.println("남는 사탕 개수 : " + rest + "개");
		
		
	}
}
