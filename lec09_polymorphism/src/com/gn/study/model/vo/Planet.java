package com.gn.study.model.vo;

public class Planet {
	public void description() {
		System.out.println("태양 주위를 공전하는 천체");
	}
	// 오버로딩 :
	// 하나의 메서드에 매개변수의 순서, 타입, 개수를 다르게함
	public void description(int age) {
		System.out.println(age+"억년");
	}
	
	public void material() {
		System.out.println("행성마다 물질이 달라요.");
	}
}
