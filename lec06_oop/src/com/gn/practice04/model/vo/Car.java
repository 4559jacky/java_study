package com.gn.practice04.model.vo;

public class Car {
	
	// 1. 시동걸기 -> 출력
	public void startEngine() {
		System.out.println("자동차 시동이 켜졌습니다.");
	}
	// 2. 속도 확인하기
	public int checkSpeed() {
		return 50;
	}
	// 3. 속도 설정하기 -> 출력
	public void setSpeed(int speed) {
		System.out.println("속도가 " +speed+"km/h로 설정되었습니다.");
	}
	// 4. 여행 목적지 설정하기
	public String setDestination(String destination) {
		return "목적지가 설정되었습니다 : " + destination;
	}
	// 5. 선루프 열고 닫기
	public String sunroof(String option) {
		if(option.equals("open")) {
			return "선루프가 열렸습니다.";
		} else if(option.equals("close")) {
			return "선루프가 닫혔습니다.";
		} else {
			return "이해할 수 없는 명령입니다.";
		}
	}
	// 6. 기름 체크하기
	public String oilCheck(int oil) {
		if(oil<=30) return "기름이 부족합니다.";
		else if(oil<=50) return "여유 있습니다.";
		else return "충분합니다.";
	}
}
