package com.gn.practice;

import java.util.*;

public class Practice01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력해주세요 : ");
		int num1 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("두번째 숫자를 입력해주세요 : ");
		int num2 = sc.nextInt();
		
		System.out.println();
		
		System.out.println("첫번째 숫자 : **" + num1 + "**");
		System.out.println("두번째 숫자 : **" + num2 + "**");
		System.out.println("덧셈 : " + (num1+num2));
		System.out.println("뺄셈 : " + (num1-num2));
		System.out.println("곱셈 : " + (num1*num2));
		System.out.println("몫 : " + (num1/num2));
		System.out.println("나머지 : " + (num1%num2));
	}

}
