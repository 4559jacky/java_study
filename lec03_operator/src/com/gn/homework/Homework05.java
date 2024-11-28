package com.gn.homework;

import java.util.*;

public class Homework05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호(-) : ");
		String num = sc.nextLine();
		
		char c = num.charAt(7);
		
		if(c=='1'||c=='3') {
			System.out.println("입력하신 주민번호는 남성입니다.");
		} else if(c=='2'||c=='4') {
			System.out.println("입력하신 주민번호는 여성입니다.");
		} else {
			System.out.println("입력하신 주민번호는 잘못된 값입니다.");
		}
		
		
		
	}
}
