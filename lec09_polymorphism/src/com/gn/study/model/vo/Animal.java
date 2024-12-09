package com.gn.study.model.vo;
// 클래스 내부에 추상메소드가 하나라도 있으면
// 그 클래스는 무조건 추상클래스여야한다
public abstract class Animal {
	// 추상메소드
	public abstract void sound();
	public void breath() {
		System.out.println("동물은 숨을 쉽니다.");
	}
	
	// 추상 메소드를 포함한 클래스는 무조건 추상 클래스여야 하지만,
	// 추상 클래스라고 무조건 추상 메소드가 있어야 하는건 아니다.
	// (없어도 된다.)
	
	// extends를 통해서 상속한다.
	
	// 추상 클래스 사용 이유
	// 1. 일관된 인터페이스 제공
	// 2. 꼭 필요한 기능 강제화
	// -> 공통 기능, 혹은 모든 자식 클래스에서 특수화해야하는 기능
	
	
	
}
