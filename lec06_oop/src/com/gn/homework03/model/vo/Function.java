package com.gn.homework03.model.vo;

public class Function {
	// - 문자열 두 개를 전달 받음
	// - 두 문자열을 합치고 리턴
	public String method1(String str1, String str2) {
		return str1+" "+str2;
	}
	public int method2(int num1, int num2) {
		if(num1<num2) {
			System.out.println("계산할 수 없습니다.");
			return 0;
		}
		return num1*num2;
	}
	public boolean method3(String str1, String str2) {
		boolean check = false;
		if(str1.equals(str2)) {
			check = true;
		}
		return check;
	}
}
