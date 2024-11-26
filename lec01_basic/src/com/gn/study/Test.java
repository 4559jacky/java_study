package com.gn.study;

public class Test {
	// 메인 메소드
	// 라인 주석입니다.
	/*
	 블록 주석
	 여러 줄 주석 가능
	 */
	public static void main(String[] args) {
		System.out.println("Hello World");
		// 1. print -> 줄 바꾸기 X
		System.out.print("Hello World");
		System.out.print(123);
		// 2. println -> 줄 바꾸기 O
		System.out.println("Hello World");
		System.out.println(123);
		// 3. printf -> 표현식, 데이터 :
		// 형식화된 출력을 할 때 사용
		// 숫자나 날짜 등의 특정 형식을 출력할 때 사용
		// 정수 : %d, 실수 : %.2f(소수점 두번째까지 반올림),
		// 문자열 : %s
		// 이름 : 김철수, 나이 : 25, 키 : 179.8
		System.out.printf("이름 : %s, 나이 : %d, 키 : %.1f", "김철수", 25, 179.83);
		
		
		System.out.println();
		
		// 이스케이프 문자
		// "안녕하세요."
		System.out.println("안녕하세요.");
		System.out.println("\"안녕하세요.\"");
		
		// hello world 사이에 줄 바꾸기
		System.out.println("Hello\nWorld");
		
	}
}
