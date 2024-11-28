package com.gn.practice;

import java.util.Scanner;

public class Practice06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 : ");
		int x = sc.nextInt();
		
		System.out.print("두번째 : ");
		int y = sc.nextInt();
		
		int min = x<y ? x : y;
		System.out.println("두 수 중에서 작은 수는? " + min);
	}
}