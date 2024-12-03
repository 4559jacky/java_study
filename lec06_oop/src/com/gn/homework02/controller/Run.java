package com.gn.homework02.controller;

import com.gn.homework02.model.vo.Person;

public class Run {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.phone_num = "01012345678";
		p1.height = 190.5;
		p1.weight = 100.2;
		System.out.println("전화번호 : "+p1.phone_num+", "
							+"키 : "+p1.height+", "
							+"몸무게 : "+p1.weight);
		Person p2 = new Person();
		p2.phone_num = "01056434563";
		p2.height = 175.4;
		p2.weight = 65.6;
		System.out.println("전화번호 : "+p2.phone_num+", "
							+"키 : "+p2.height+", "
							+"몸무게 : "+p2.weight);
		
	}
}
