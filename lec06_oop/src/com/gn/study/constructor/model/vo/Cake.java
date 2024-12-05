package com.gn.study.constructor.model.vo;

public class Cake {
	// 3. 명시적 초기화
	public String flavor;
	public static int price = 27000;
	
	// 2. 초기화 블록을 통한 초기화
	{flavor = "딸기";}
	static {price = 31000;}
	
	// 1. 생성자를 통한 초기화
	public Cake() {
		this.flavor = "녹차";
		// this.price= 40000;
	}
}
