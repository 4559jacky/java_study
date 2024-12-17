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
		
		// 10. indexOf
		test = "2024.12.16.12.43";
		System.out.println(test.indexOf(".")); // 잴 처음 만나는 .의 인덱스
		System.out.println(test.indexOf("12")); // 잴 처음 만나는 12의 인덱스
		System.out.println(test.lastIndexOf("12")); // 잴 마지막에 만나는 12의 인덱스
		
		// 11. split();
		String[] time = test.split("\\.");
		for(String t : time) {
			System.out.println(t);
		}
		
		String name = "김-철-수";
		String[] nameArr = name.split("-");
		for(String n : nameArr) {
			System.out.print(n);
		}
		System.out.println();
		String a = "a+b+c+d";
		String[] arrA = a.split("\\+");
		for(String a1 : arrA) {
			System.out.print(a1);
		}
		System.out.println();
		String b = "e.f.g.h";
		String[] arrB = b.split("\\.");
		for(String b1 : arrB) {
			System.out.print(b1);
		}
		System.out.println();
		
		// 문자열 바꾸기
		String ide = "eclipse";
		ide = ide.replace("e", "a");
		System.out.println(ide);
		
		String id = "김 철 수";
		id = id.replace(" ", "");
		System.out.println(id);
		
		// 비어있는지 확인
		System.out.println("-----------isBlank()------------");
		String empty1 = ""; // 값이 없는 경우
		String empty2 = " "; // 띄어쓰기가 있는 경우
		System.out.println("(1) : "+empty1.isBlank());
		System.out.println("(2) : "+empty2.isBlank());
		System.out.println("-----------isEmpty()------------");
		System.out.println("(3) : "+empty1.isEmpty());
		System.out.println("(4) : "+empty2.isEmpty());
		System.out.println("-----------length()------------");
		System.out.println(empty1.length()==0);
		empty2 = empty2.replace(" ", ""); // 공백 없애면 true, 아니면 false
		System.out.println(empty2.length()==0);
		System.out.println("-----------trim()------------");
		String empty3 = " 안 녕 ";
		empty3 = empty3.trim(); // 앞 뒤 공백 없애줌
		System.out.println(empty3);
		
		System.out.println("-----------join()------------");
		String[] students = {"마루","춘배","명동"};
		String allStudent = String.join("-", students);
		System.out.println(allStudent);
		
		System.out.println("-----------substring()------------");
		String cutTest = "hello world";
		System.out.println(cutTest.substring(6)); //인덱스6번부터
		System.out.println(cutTest.substring(0,5)); //0번부터 4번까지
		// cutTest.charAt(3)
		System.out.println(cutTest.substring(3,4)); //3번부터 4번되기 전 까지==3
		
		String file = "test.jpg";
		String ex = file.substring(file.indexOf(".")+1); // "." 다음부터
		String file_name = file.substring(0,file.lastIndexOf(".")); //0번부터 마지막"."전까지
		System.out.println(ex+" : "+file_name);
		
		// valueOf
		double pi = 3.14;
		String piStr = String.valueOf(pi);
		System.out.println(piStr+2.1);
		
		// StringBuilder
		StringBuilder sb = new StringBuilder("Hello");
		// append
		sb.append("World!!");
		System.out.println(sb);
		// insert
		sb.insert(5, " Java ");
		System.out.println(sb);
		// delete
		sb.delete(11, 16+1);
		System.out.println(sb);
//		sb.deleteCharAt(10);
//		System.out.println(sb);
		// deleteCharAt()
		int idx = sb.indexOf("!");
		sb.deleteCharAt(idx);
		System.out.println(sb);
		// reverse
		sb.reverse();
		System.out.println(sb);
		String bbb = sb.toString();
	}
}
