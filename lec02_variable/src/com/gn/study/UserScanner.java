package com.gn.study;
// 1. 외부에서 가져오기
import java.util.*;

public class UserScanner {
	public static void main(String[] args) {
		// 2. Scanner 이름짓기
		Scanner sc = new Scanner(System.in);
		
		// 정수 형태 데이터 입력받기
		System.out.print("점수 : ");
		int num = sc.nextInt();
		System.out.println(num);
		
		sc.nextLine();
		
		// 3. 입력 받기
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.println(name);
		
		
//		System.out.print("숫자 : ");
//		int num1 = sc.nextInt();
//		System.out.println(num1 + "의 약수는");
//		for(int i=1; i<=num1; i++) {
//			if(num1%i==0) {
//				System.out.print(i+" ");
//			}
//		}
		
		
	}
}
