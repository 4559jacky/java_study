package com.gn.prcatice03.model.vo;

public class Circle extends Point {
	private int radius;
	private static final double PI = 3.14;
	
	public Circle() {}
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		super.draw();
		//면적 : 너비 * 높이
		System.out.printf("면적 : %.1f\n", (radius*radius*PI));
		System.out.printf("둘레 : %.1f\n", (2*radius*PI));
	}
}
