package com.gn.homework01;

public class Run {
	public static void main(String[] args) {
		String str ="김철수,25,동작구,남\n홍길동,27,관악구,남\n이영희,29,강서구,여";
		String[] strArr = str.split("\n");
//		- 김철수,25,동작구,남
//		- 홍길동,27,관악구,남
//		- 이영희,29,강서구,여
		
		Person[] p = new Person[3];
		for(int i=0; i<strArr.length; i++) {
			String[] strArr1 = strArr[i].split(",");
			String name = strArr1[0];
			int age = Integer.parseInt(strArr1[1]);
			String address = strArr1[2];
			char gender = strArr1[3].charAt(0);
			p[i] = new Person(name, age, address, gender);
			System.out.println("Person "+p[i]);
		}
	}
}
