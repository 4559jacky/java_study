package com.gn.study;

public class DimensionalArray {
	public static void main(String[] args) {
		int score1 = 85;
		int score2 = 90;
		int score3 = 78;
		int score4 = 92;
		int score5 = 88;
		
		int[] scores = {85, 90, 78, 92, 88};
		
		// 1. 배열의 선언
		int[] intArr;
		char[] charArr;
		String[] strArr;
		
		// 2. 배열의 생성
		int[] nums;
		nums = new int[4];
		
		int[] heights = new int[10];
		
		// 3. 배열의 길이(인덱스)
		System.out.println(heights.length);
		
		// 4. 배열의 초기화(defalut)
		System.out.println(heights[2]);
		
		// 5. 배열의 초가화(값 변경)
		// (1) 인덱스 활용
		int[] age1 = new int[3];
		age1[0] = 40;
		age1[1] = 20;
		age1[2] = 70;
		
		// (2) for문 : 규칙 O
		int[] age2 = new int[3];
		for(int i=0; i<age2.length; i++) {
			age2[i] = i+10;
			System.out.println(age2[i]);
		}
		
		// (3) 선언과 동시에 초기화
		// 선언 -> 생성 -> 초기화
		int[] age3 = new int[] {1,2,3,4};
		int[] age4 = {5,6,7};
		
		// 아래 방법 불가능!!!!
//		int[] element;
//		element = {9,10,11};
		
		// 이건 가능!
		int[] element1;
		element1 = new int[] {9,10,11};
		
		// 6. 배열의 데이터 저장 과정
		// 배열은 참조형이므로 실제 데이터 Heap에 저장
		// 선언 시점에는 Stack에 주소값 저장 공간 마련
		// 생성까지 해야 Heap에 실제 값 저장 공간 마련
		
		// (1) 선언 : Stack에 score라는 이름의 저장공간 마련
		int[] score;
		// (2) 생성 : Heap에 기차가 생김, Stack에 가치의 주소값 저장
		score = new int[4];
		// (3) 초기화 : Heap의 값 변경
		score[0] = 90;
		
		// 7. 배열의 출력
		// (1) 인덱스를 이용한 출력
		System.out.println(age1[1]);
		
		// (2) 반복문을 이용한 출력
		String[] fruits = {"딸기", "체리", "포도"};
		for(int i=0; i<fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		// 향상된 for문 사용
		for(String str : fruits) {
			System.out.println(str);
		}
		
		
		
	}
}
