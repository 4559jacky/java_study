package com.gn.practice;

import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
		System.out.println("50을 넘는 숫자");
		int[] num1 = {-62, 107, -12, 89, -35};
		for(int n : num1) {
			if(n>50) {
				System.out.println(n);
			}
		}
		
		int[] num2 = {-62, 107, -12, 89, -35};
		for(int n : num2) {
			if(n<=50) {
				continue;
			}
			System.out.println(n);
		}
		
		// 더 해보기
		// 사용자로부터 길이 5의 배열에 들어가는 정수 데이터를 5개 입력받아서
		// 배열을 구성한 다음 그 중에서 50이 넘는 숫자를 출력해보세요.
		
		Scanner sc = new Scanner(System.in);
		
		int[] number = new int[5];
		
		for(int i=0; i<number.length; i++) {
			System.out.print((i+1)+"번째 정수를 입력해주세요 : ");
			number[i] = sc.nextInt();
		}
		sc.close();
		
		for(int n : number) {
			if(n<=50) {
				continue;
			}
			System.out.println(n);
		}
		
		
	}
}
