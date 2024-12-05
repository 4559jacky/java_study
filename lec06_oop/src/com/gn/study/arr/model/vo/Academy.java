package com.gn.study.arr.model.vo;

public class Academy {
	private String name;
	private String phone;
	
	// 기본 생성자
	public Academy() {}
	
	// 매개변수 생성자
	public Academy(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	// getter
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	
	
}
