package com.gn.practice;

import java.util.Scanner;

public class Practice04 {
	public static void main(String[] args) {
		// ctrl + shift + o
		Scanner sc = new Scanner(System.in);
		
		System.out.print("조명의 밝기를 입력하세요 (0~3): ");
		int light = sc.nextInt();
		
		String str = "";
		str += "현재 조명의 밝기: ";
		
		switch(light) {
			case 0 :
				str += "조명을 끕니다.";
				break;
			case 1 :
				str += "어두운 조명입니다.";
				break;
			case 2 :
				str += "밝은 조명입니다.";
				break;
			case 3 :
				str += "매우 밝은 조명입니다.";
				break;
			default :
				str += "올바른 입력이 아닙니다.";
				break;
		}
		System.out.println(str);
		
//		switch(light) {
//		case 0 :
//			System.out.println("현재 조명의 밝기: 조명을 끕니다.");
//			break;
//		case 1 :
//			System.out.println("현재 조명의 밝기: 어두운 조명입니다.");
//			break;
//		case 2 :
//			System.out.println("현재 조명의 밝기: 밝은 조명입니다.");
//			break;
//		case 3 :
//			System.out.println("현재 조명의 밝기: 매우 밝은 조명입니다.");
//			break;
//		default :
//			System.out.println("올바른 입력이 아닙니다.");
//			break;
//	}
		
	}
}
