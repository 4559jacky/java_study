	package com.gn.study.controller;

import com.gn.study.model.vo.Container;

public class Run {
	public static void main(String[] args) {
		// Boxing
		Integer iNum = 100;
		// UnBoxing
		int num = iNum;
		// parse 메소드
		String str1 = "123";
		String str2 = "456";
		System.out.println(str1+str2);
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		System.out.println(num1+num2);
		
		str2 = "1.34";
		System.out.println(str2+str2);
		
		double num3 = Double.parseDouble(str2);
		System.out.println(num3+num3);
		
		// NumberFormatException
		try {
			String[] arr = new String[3];
			arr[0] = "일";
			int arrNum = Integer.parseInt(arr[0]);
		} catch(NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println("숫자가 아닌 문자열");
		
		// ClassCastException
		try {
			Object o = 9;
			String oStr = (String)o;
			System.out.println(oStr);			
		} catch(ClassCastException e) {
			e.printStackTrace();
		}
		System.out.println("선넘은 형변환");
	
		// 제네릭
		// 객체가 생성되어야지 자료형을 정할 수 있다.
		// ㄴ> static 은 사용할 수 없다. (생성자를 못만듦)
		Container<String, String, Integer> con = new Container<String, String, Integer>("아이템", "정재익", 27);
//		Container<String> tain = new Container<String>("!23");
//		con.SetItem(123);
//		tain.SetItem("!23");
		System.out.println(con.getItem());
		System.out.println(con.getName());
		System.out.println(con.getAge());
//		System.out.println(tain.getItem());
		
	
	}
	
}
