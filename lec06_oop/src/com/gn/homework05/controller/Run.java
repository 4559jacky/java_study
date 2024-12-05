package com.gn.homework05.controller;

import com.gn.homework05.model.vo.Member;

public class Run {
	public static void main(String[] args) {
		Member m = new Member();
		m.changeName("김철수");
		m.printName();
	}
}
