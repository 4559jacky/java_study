package com.gn.study.method.model.vo;

public class Restaurant {
	// 1. 매개변수X
	// 반환형X 매개변수X
	// -> 인사
	public void welcomeMsg() {
		System.out.println("어서오세용~~");
	}
	// 2. 기본형 매개변수
	// 반환형X 매개변수O
	// -> 테이블 번호를 입력받아서 출력
	public void setTableNumber(int tableNumber) {
		System.out.println("테이블 번호 "+tableNumber+"에 앉으세용~");
	}
	// 3. 배열 매개변수
	// 반환형X 매개변수O
	// -> 주문 목록(배열)을 입력받아서 출력
	public void processOrder(String[] menuItems) {
			System.out.println("주문 한번 확인할게용~~");
			for(String m : menuItems) {
				System.out.println(m);
			}
	}
	// 4. 클래스(객체) 매개변수 -> 음료수 세팅(Soda클래스)
	// 반환형X 매개변수O
	public void sodaSetting(Soda soda) {
		System.out.println(soda.name+" 먼저 세팅할게용~");
	}
}
