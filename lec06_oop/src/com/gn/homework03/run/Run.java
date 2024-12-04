package com.gn.homework03.run;

import com.gn.homework03.model.vo.Function;

public class Run {

	public static void main(String[] args) {
		Function f1 = new Function();
		String sum_word = f1.method1("Hello", "World");
		System.out.println(sum_word);
		int multi = f1.method2(1, 3);
		System.out.println(multi);
		Boolean same_word = f1.method3("cosmos", "cosmos");
		System.out.println(same_word);
	}

}
