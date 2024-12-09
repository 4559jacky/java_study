package com.gn.study.model.vo;

public interface Alarm {
	// 상수 필드
	// 상수 -> 변수명 대문자, 스네이크 케이스 사용
	
	public static final int MAX_VOLUME = 10;
	// int MAX_VOLUME = 10;
	// interface안에 있는 필드는 무조건
	// public static final이 들어가야하기때문에
	// 생략이 가능하다.
	// int MAX_VOLUME = 10;
	// 이렇게 표현이 가능
	
	// 추상메소드
	public abstract void soundAlarm();
	// 필드와 마찬가지로 추상메소드도
	// void soundAlarm();으로 생략해서 사용 가능하다.
	
	
	
}
