package com.gn.study.constructor.model.vo;

public class Car {
	private String brand;
	private String color;
	private int year;
	
//	public Car(String b, String c, int y) {
//		brand = b;
//		color = c;
//		year = y;
//	}
	
	// 기본 생성자
	public Car() {
		this("미정", "미정", 2024);
	}
	
	// 매개변수 생성자
	// this. 쓰는 이유
	// 1. 일관성있는 코드
	// 2. 유지보수 확장성
	public Car(String brand, String color, int year) {
		this.brand = brand;
		this.color = color;
		this.year = year;
	}
	
}
