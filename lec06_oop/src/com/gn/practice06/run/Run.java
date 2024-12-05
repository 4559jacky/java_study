package com.gn.practice06.run;

import com.gn.practice06.model.vo.Person;

public class Run {
	public static void main(String[] args) {
		// 메인 메소드에 Person 타입의 객체 생성
		Person p = new Person();
		// 객체에 setter를 통해 데이터 값 추가
		p.setId("user01");
		p.setPwd("1234");
		p.setName("김철수");
		p.setAge(43);
		p.setGender('M');
		p.setPhone("010-111-1111");
		p.setEmail("kcs@gmail.com");
		
		// setter에 담은 데이터를 information() 메소드로 출력
		String data = p.information();
		System.out.println(data);
	}
}
