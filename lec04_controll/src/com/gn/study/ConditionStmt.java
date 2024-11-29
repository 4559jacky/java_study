package com.gn.study;

public class ConditionStmt {

	public static void main(String[] args) {
		// 1. if문
		int number = 10;
		if(number>5) {
			int su = 2;
			System.out.println("number는 5보다 큽니다.");
			System.out.println(su);
		}
		// System.out.println(su);
		
		// 2. if-else문
		int num = 0;
		if(num>0) {
			// 양수
			System.out.println("양수입니다.");
		} else {
			// 음수
			System.out.println("음수입니다.");
		}
		
		// 3. if-else if-else문
		int a = 3;
		if(a >= 9) {
			System.out.println("9이상");
		} else if(a >= 6) {
			System.out.println("9미만 && 6이상");
		} else if(a >= 3) {
			System.out.println("9미만 && 6미만 && 3이상");
		} else {
			System.out.println("3미만");
		}
		
		// 4. 중첩 if문
		// 변수의 값이 양수 vs 음수
		// 양수 -> 짝수 vs 홀수
		int target = -5;
		if(target>0) {
			// 양수
			if(target%2==0) {
				// 짝수
				
			} else {
				// 홀수
				
			}
		} else if(target < 0) {
			// 음수
			
		} else {
			// 0
		}
		
		// 5. switch 믄
		// 하나의 조건으로 다양한값에 따른 동작을 나눠야 할 때 사용
		// switch 의 조건식에는 숫자, 문자, 문자열만 쓸 수 있다.
		// if문의 else처럼 switch문에서 어떤 경우도 충족하지 못할 때
		// default를 수행한다.
		// case문에 문장의 시작과 끝을 지정하는 { } 블록을 설정하지 않는다.
		// 상위 조건이 충족되면 하위 조건에 까지 영향을 미친다.
		// 이를 차단하기 위해서 모든 case문에 끝에 break를 반드시 추가해야한다.
		int day = 5; // 화요일
		// 오늘은 O요일 입니다.
		String text = "";
		switch(day) {
			case 0 : 
				text = "일";
				break;
			case 1 : 
				text = "월";
				break;
			case 2 : 
				text = "화";
				break;
			case 3 : 
				text = "수";
				break;
			case 4 : 
				text = "목";
				break;
			case 5 : 
				text = "금";
				break;
			case 6 : 
				text = "토";
				break;
			default :
				text = "모르는";
				break;
		}
		
		System.out.println("오늘은 " + text + "요일 입니다.");
		
		// 조건 여러개가 수행하는 기능이 같은 경우
		int month = 7;
		
		switch(month) {
			case 1, 3, 5, 7, 8, 10, 12 :
				System.out.println("31일");
				break;
			case 4 : case 6 : case 9 : case 11 :
				System.out.println("30일");
				break;
			case 2 : 
				System.out.println("28일");
				break;
			default :
				System.out.println("존재하지 않는 달입니다.");
				break;
		}
		
		
	}

}
