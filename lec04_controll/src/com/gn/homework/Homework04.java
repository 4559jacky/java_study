package com.gn.homework;

import java.util.Scanner;

public class Homework04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("각 과목의 점수를 입력하세요.");
		
		System.out.print("소프트웨어설계 점수 : ");
		int sub1 = sc.nextInt();
		
		System.out.print("소프트웨어개발 점수 : ");
		int sub2 = sc.nextInt();
		
		System.out.print("데이터베이스구축 점수 : ");
		int sub3 = sc.nextInt();
		
		System.out.print("프로그래밍언어활용 점수 : ");
		int sub4 = sc.nextInt();
		
		System.out.print("정보시스템구축관리 점수 : ");
		int sub5 = sc.nextInt();
		
		String subject = "";
		
		if(sub1>=40&&sub2>=40&&sub3>=40&&sub4>=40&&sub5>=40) {
			if((sub1+sub2+sub3+sub4+sub5)/5>=60) {
				System.out.println("합격을 축하합니다!");
			} else {
				System.out.println("평균 점수 60점 미만으로 불합격입니다.");
			}
		} else {
			if(sub1<40) {
				subject += "소프트웨어설계 과목, ";
			}
			if(sub2<40) {
				subject += "소프트웨어개발 과목, ";
			}
			if(sub3<40) {
				subject += "데이터베이스구축 과목, ";
			}
			if(sub4<40) {
				subject += "프로그래밍언어활용 과목, ";
			}
			if(sub5<40) {
				subject += "정보시스템구축관리 과목 ";
			}
			System.out.println(subject+"과락으로 불합격입니다.");
		}
		
		
	}
}
