package com.gn.practice;

import java.util.Scanner;

public class Practice04 {
	public static void main(String[] args) {
		int[] ages = {20, 18, 22, 19, 21};
		int max = ages[0];
		int min = ages[0];
		for(int age : ages) {
			if(max<age) {
				max = age;
			}
			if(min>age) {
				min = age;
			}
		}
		System.out.println("가장 나이가 많은 학생의 나이 : " + max + "\n" + "가장 어린 학생의 나이 : " + min);
		
		Scanner sc = new Scanner(System.in);
		
		int[] age2 = new int[5];
		
		for(int i=0; i<age2.length; i++) {
			System.out.print((i+1)+"번째 학생의 나이를 입력해주세요 : ");
			age2[i] = sc.nextInt();
		}
		sc.close();
		
		int max1 = age2[0];
		int min1 = age2[0];
		
		for(int age : age2) {
			if(max1<age) {
				max1 = age;
			}
			if(min1>age) {
				min1 = age;
			}
		}
		System.out.println("가장 나이가 많은 학생의 나이 : " + max1 + "\n" + "가장 어린 학생의 나이 : " + min1);
		
	}
}
