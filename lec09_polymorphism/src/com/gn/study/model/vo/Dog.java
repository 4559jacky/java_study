package com.gn.study.model.vo;

public class Dog extends Animal {
	@Override
	public void sound() {
		System.out.println("강아지는 멍멍~");
	}
	@Override
	public void breath() {
		System.out.println("강아지는 아르르");
	}
}
