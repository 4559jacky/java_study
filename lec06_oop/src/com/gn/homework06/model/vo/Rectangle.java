package com.gn.homework06.model.vo;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle() {}
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public int calculateRound(int width, int height) {
		return 2*width+2*height;
	}
	public int calculateArea(int width, int height) {
		return width*height;
	}
	
	public void printInfo() {
		System.out.println("=== 사각형 정보 ===");
		System.out.println("1. 사각형의 둘레");
		System.out.println(calculateRound(width, height));
		System.out.println("1. 사각형의 넓이");
		System.out.println(calculateArea(width, height));
	}
}
