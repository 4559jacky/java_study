package com.gn.study.controller;

public class StringRun {
	public static void main(String[] args) {
		// 1. 리터럴 -> ""
		// 값이 같으면 hashCode 동일, == 비교 연산자 사용 가능
		String str = "Hello";
		System.out.println("Hello(1) : "+System.identityHashCode(str));
//		str += "World";
		System.out.println(System.identityHashCode(str));
		
		String str1 = "Hello";
		System.out.println("Hello(2) : "+System.identityHashCode(str1));
		if(str == str1) {
			System.out.println("같다!!");
		}
		
		// 2. new 연산자 -> 객체
		String str2 = new String("Hello");
		System.out.println(System.identityHashCode(str2));
	
	
		// 3. equals
		System.out.println("equals() : "+("Hi".equals(str2)));
		// 4. length()
		System.out.println("length() : "+str2.length());
		// 5. charAt()
		System.out.println("charAt(i) : "+str2.charAt(0));
		// 6. toCharArray()
		char[] arr = str2.toCharArray();
		for(char c: arr) {
			System.out.println(c);
		}
		// 7. contains()
		System.out.println("contains() : "+str2.contains("lo"));
		// 8. compareTo()
		System.out.println("compareTo() : "+str2.compareTo("Yzz"));
		
		// 9. concat() -> 원본값 수정 불가능
		String test = "우리는";
		test.concat("할수있다.");
		System.out.println(test);
		
		// 10.
	
	}
}
