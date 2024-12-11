package com.gn.practice02;

public class Run {
	public static void main(String[] args) {
		// 1. Pair 타입 객체 생성
		// 2. 매개변수 생성자 활용
		Pair<String, Integer> pair = new Pair<String, Integer>("Apple", 10);
		
		// 3. getter를 통해 필드값 출
		System.out.println("First : "+pair.getFirst());
		System.out.println("Second : "+pair.getSecond());
	}
	
}
