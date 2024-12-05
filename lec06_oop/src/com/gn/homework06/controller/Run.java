package com.gn.homework06.controller;

import com.gn.homework06.model.vo.Rectangle;

public class Run {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(1, 1);
		Rectangle r2 = new Rectangle(3, 5);
		r1.printInfo();
		r2.printInfo();
	}
}
