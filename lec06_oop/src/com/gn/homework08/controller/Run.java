package com.gn.homework08.controller;

import com.gn.homework08.open.model.vo.Person;

public class Run {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "김철수";
		p1.age = 20;
		System.out.println(p1.name+"는 "+p1.age+"살 입니다.");
		
		com.gn.homework08.closed.model.vo.Person p2 = new com.gn.homework08.closed.model.vo.Person();
		p2.setName("김철수");
		p2.setAge(20);
		System.out.println(p2.getName()+"는 "+p2.getAge()+"살 입니다.");
	}
}
