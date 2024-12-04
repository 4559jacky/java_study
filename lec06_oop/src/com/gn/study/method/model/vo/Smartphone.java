package com.gn.study.method.model.vo;

public class Smartphone {
	// 1. 반환형X, 매개변수X
	// -> 앱 열림 메세지
	public void openApp() {
		System.out.println("앱이 열렸어용~");
	}
	
	// 2. 반환형O, 매개변수X
	// -> 배터리 잔량 리턴
	public int checkBattery() {
		return 85;
	}
	
	// 3. 반환형X. 매개변수O
	// -> 볼륨 입력하면 출력
	public void setVolume(int volume) {
		System.out.println("볼륨이 "+volume+"으로 설정되었어용~");
	}
	
	// 4. 반환형O, 매개변수O
	// -> 메세지 전송
	public String sendMsg(String msg) {
		return "메시지 \'" + msg + "\'가 전송되었어용~";
	}
	
	public void checkWork() {
		Hospital hospital = new Hospital();
		hospital.emergencyCall();
		hospital.doctorCall();
		hospital.staffAnnouncement();
		// hospital.personalRecord();
	}
}
