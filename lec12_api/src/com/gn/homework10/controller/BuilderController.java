	package com.gn.homework10.controller;

public class BuilderController {
	public BuilderController() {}
	public String afterReplace(String str) {
		// 1. 매개변수로 String 받아옴
		// 2. 띄어쓰기를 없앤 문자열 반환
//		str = str.replace(" ", "");
//		return str;
		
		// StringBuilder 사용하기
		StringBuilder sb = new StringBuilder(str);
		while(sb.indexOf(" ")!=-1) {
			int idx = sb.indexOf(" ");
			sb.deleteCharAt(idx);
		}
		return sb.toString();

		
	}
	public String firstCap(String input) {
		// 1. 매개변수로 String 받아오기
		// 2. 첫글자만 대문자로 바꾼 문자열 반환
//		input = input.substring(0,1).toUpperCase()+
//				input.substring(1);
//		return input;
		
		// StringBuilder 사용하기
		StringBuilder sb = new StringBuilder(input);
		// 첫 번째 문자만 대문자로 변경
	    char firstChar = Character.toUpperCase(sb.charAt(0));
	    sb.setCharAt(0, firstChar);
		return sb.toString();
	}
	public int findChar(String input, char one) {
		// 1. 매개변수로 String과 char 받아오기
		// 2. String에 char가 몇개 있는지 반환
//		int count = 0;
//		for(int i=0; i<input.length(); i++) {
//			if(input.charAt(i)==one) {
//				count++;
//			}
//		}
//		return count;
		
		// StringBuilder 사용하기
		StringBuilder sb = new StringBuilder(input);
		int count = 0;
		String s = String.valueOf(one);
		while(sb.indexOf(s)!=-1) {
			int idx = sb.indexOf(s);
			sb.deleteCharAt(idx);
			count++;
		}
		return count;
	}
}
