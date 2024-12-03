package com.gn.study;

import java.util.Arrays;

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
		
		System.out.println("=========================");
		
		// 3. 배열의 길이(인덱스)
		System.out.println(heights.length);
		
		// 4. 배열의 초기화(defalut)
		System.out.println(heights[2]);
		
		System.out.println("=========================");
		
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
		
		System.out.println("=========================");
		
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
		
		System.out.println("=========================");
		
		// (2) 반복문을 이용한 출력
		String[] fruits = {"딸기", "체리", "포도"};
		for(int i=0; i<fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		
		System.out.println("=========================");
		
		// 8. toCharArray
		String text = "Hello World";
		char[] c = text.toCharArray();
		for(int i=0; i<c.length; i++) {
			System.out.println(c[i]);
		}
		
		System.out.println("=========================");
		
		// vs charAt(i)
		text = "안녕하세요.";
		for(int i=0; i<text.length(); i++) {
			System.out.println(text.charAt(i));
		}
		
		System.out.println("=========================");
		
		// for each문
		int[] numbers = {1,2,3,4,5};
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("=========================");
		
		for(int number : numbers) {
			System.out.println(number);
		}
		
		System.out.println("=========================");
		
		// 10. 배열의 활용 (1)  - 총합과 평균
		int[] sus = {83,90,100,100,50};
		int sum = 0;
		double avg = 0;
		for(int su : sus) {
			sum += su;
		}
		avg = (double)sum/sus.length;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		
		System.out.println("=========================");
		
		// 11. 배열의 활용(2) - 최대값과 최소값
		int[] arr = {8,9,10,4,2};
		int max = arr[0];
		int min = arr[0];
		for(int a : arr) {
			if(max<a) {
				max = a;
			}
			if(min>a) {
				min = a;
			}
		}
		System.out.println("최소값 : " + min + "\n" + "최대값 : " + max);
		
		System.out.println("=========================");
		
		// 12. 배열의 활용(3) - 오름차순, 내림차순
		int[] data = {8,4,1,3};
		// 인덱스 기준 : 0번과 1번 비교 -> 4,8,1,3
		// 인덱스 기준 : 0번과 2번을 비교 -> 1,8,4,3
		// 인덱스 기준 : 0번과 3번을 비교 -> 1,8,4,3
		// 1번과 2번을 비교 -> 1,4,8,3
		// 1번과 3번을 비교 -> 1,3,8,4
		// 2번과 3번을 비교 -> 1,3,4,8
		for(int i=0; i<data.length-1; i++) {
			for(int j=i+1; j<data.length; j++) {
				if(data[i]>data[j]) {
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		System.out.print("오름차순 : ");
		for(int d : data) {
			System.out.print(d);
		}
		
		System.out.println();
		// 0번 vs 1번 : 3,1,4,8
		// 0번 vs 2번 : 4,1,3,8
		// 0번 vs 3번 : 8,1,3,4
		// 1번 vs 2번 : 8,3,1,4
		// 1번 vs 3번 : 8,4,1,3
		// 2번 vs 3번 : 8,4,3,1
		for(int i=0; i<data.length-1; i++) {
			for(int j=i+1; j<data.length; j++) {
				if(data[i]<data[j]) {
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		System.out.print("내림차순 : ");
		for(int d : data) {
			System.out.print(d);
		}
		
		System.out.println();
		System.out.println("=========================");
		
		// 13. 배열의 복사
		// 배열은 한번 생성되면 길이 변경 불가능
		// 더 많은 저장 공간 필요시
		// 기존의 배열보다  더 큰 배열 생성
		// 이전 배열이 가진 내용 복사
		
		// 배열 복사의 2가지 방법 - (1) 얕은 복사
		// 객체의 주소값을 복사하는 것
		// Stack에 있는 주소값 복사
		// Heap에 있는 데이터는 그대로 유지
		// 하나의 메모리를 두 개의 배열에서 동시에 참조
		// - 명시적으로 두 개의 배열이지만 보이지만 하나의 몸체 공유
		// - 하나의 배열에서 값 변경 시 다른 배열에서도 값 변경
		int[] arr1 = {5,6,7,8};
		//int[] arr2 = arr1;
		// (2) 깊은 복사
		int[] arr2 = new int[arr1.length];
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = arr1[i];
		}
		arr2[3] = 1000;
		for(int num1 : arr1) {
			System.out.print(num1+", ");
		}
		System.out.println();
		for(int num2 : arr2) {
			System.out.print(num2+", ");
		}
		
		System.out.println();
		System.out.println("=========================");
		
		// Math.random() 1~100 사이의 정수 랜덤값 도출
		// 0.0이상 1.0미만의 난수 실수를 생성
		// 실행할 때마다 다른 값 반환
		// 무작위로 값 생성 가능
		// Math.random() 자체는 실수형 데이터를 생성
		// 정수형 결과를 도출하기 위해서는 작업 필요
		double basic = Math.random();
		System.out.println(basic);
		
		// 1. (최대값-최소값-1) 만큼 곱하기
		double hundred = basic*(100-1+1);
		System.out.println(hundred);
		
		// 2. 형변환
		int casting = (int)hundred;
		System.out.println(casting);
		
		// 3. 최소값 더하기
		int add = casting + 1;
		System.out.println(add);
		
		// 10~20 사이의 정수 랜덤값
		int rnd = (int)(Math.random()*11)+10;
		System.out.println(rnd);
		
		// 1~45 사이의 정수 랜덤값
		int n = 0;
		while(true) {
			n = (int)(Math.random()*45) + 1;
			if(n<=45) break;
		}
		System.out.println(n);
		
	}
}
