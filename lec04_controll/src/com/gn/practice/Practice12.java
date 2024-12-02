package com.gn.practice;

import java.util.Scanner;

public class Practice12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
	     int sum = 0;
	     for(int i=1; i<=sc.nextInt(); i++) {
	         sum += i;
	         a = i;
	         if(sum>1000) break;
	     }
	     System.out.println(a+"까지의 합:"+sum);
	}
}
