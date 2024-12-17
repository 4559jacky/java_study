package com.gn.practice02;

import java.util.Arrays;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = new String[3];
		System.out.print("문자열(1) : ");
		str[0]= sc.next();
		sc.nextLine();
		System.out.print("문자열(2) : ");
		str[1] = sc.next();
		sc.nextLine();
		System.out.print("문자열(3) : ");
		str[2] = sc.nextLine();
		String fruit = "";
		int max = 0;
		Arrays.sort(str);
//		for(String s : str) {
//			System.out.println(s);
//		}
		// apple lemon mango 
		//   5     5    5
		
		for(int i =0; i<str.length; i++) {
			if(max<=str[i].length()) {
				max = str[i].length();
				fruit = str[i];
			}
		}
		fruit = fruit.concat(fruit);
		System.out.println(fruit);
	}
}
