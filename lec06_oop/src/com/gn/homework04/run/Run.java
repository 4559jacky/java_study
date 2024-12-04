package com.gn.homework04.run;

import com.gn.homework04.controller.ExMethodController;

public class Run {

	public static void main(String[] args) {
		ExMethodController emc = new ExMethodController();
		// 1. 전달된 메세지를 출력하는 메소드 구현
		System.out.println("=======1=======");
		emc.printMsg("자바 너무 어려워용..");
		// 2. 1~100까지 합을 반환하는 메소드구현
		System.out.println("=======2=======");
		int num1 = emc.sumNumber();
		System.out.println(num1);
		// 3. 전달된 정수가 홀수인지 짝수인지 반환하는 메소드구현
		System.out.println("=======3=======");
		String text = emc.evenOdd(num1);
		System.out.println(text);
		// 4. 전달된 문자열에 영문자가 있는지 확인하는 결과를 반환하는 메소드 구현
		System.out.println("=======4=======");
		String check = emc.engCheck("자바는 영어로 Java");
		System.out.println(check);
		// 5. 문자열, 문자를 전달받아 문자열에 문자가 몇개있는지 출력하는 메소드구현
		System.out.println("=======5=======");
		emc.countWord("apple", 'p');
		// 6. 전달된 정수의 구구단을 출력하는 메소드 구현
		System.out.println("=======6=======");
		emc.gugudan(5);
	}
}
