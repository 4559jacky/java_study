package com.gn.study.model.vo;

// 1. 클래스에 final
// public final class BasicCalculator {
public class BasicCalculator {
	// 2. 메소드에 final
	public final int add(int a, int b) {
		return a+b;
	}
	public int subtract(int a, int b) {
		return a-b;
	}
}
