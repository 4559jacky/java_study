package com.gn.practice;

import java.util.Scanner;

public class Practice06_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 : ");
		int x = sc.nextInt();
		
		System.out.print("두번째 : ");
		int y = sc.nextInt();
		
		System.out.print("세번째 : ");
		int z = sc.nextInt();
		
		int max = x>y ? (x>z? x:z) : (y>z? y:z);
		System.out.println("세 개의 정수 중에서 가장 큰 수는? " + max);
	}
}
