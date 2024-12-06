package com.gn.study.model.vo;

public class AdvancedCalculator
	extends BasicCalculator {
	
//	@Override
//	public int add(int a, int b) {
//		return a+b;
//	}
	@Override
	public int subtract(int a, int b) {
		// 조건문과 반환형을 함께 사용할 경우
		// 모든 상황에 return이 있어야 함!!
		// 1. 조건문을 꼼꼼하게
//		if(a>b) {
//			return a-b;
//		} else {
//			return b-a;
//		}
		// 2. 삼항연산자
//		return a > b ? a-b : b-a;
		// 3. default 리턴값 셋팅
		if(a<b) return b-a;
		return a-b;
	}
}
