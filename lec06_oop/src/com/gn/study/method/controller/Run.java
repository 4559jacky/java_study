package com.gn.study.method.controller;

import com.gn.study.method.model.vo.Hospital;
import com.gn.study.method.model.vo.Library;
import com.gn.study.method.model.vo.Smartphone;

public class Run {
	public static void main(String[] args) {
		
		// 객체 생성(인스턴스화)
		Smartphone myPhone = new Smartphone();
		System.out.println("==============");
		myPhone.checkWork();
		System.out.println("==============");
		// 객체 호출
		// 1. 반환형X, 매개변수X
		myPhone.openApp();
		
		// 2. 반환형O, 매개변수X
		int battery = myPhone.checkBattery();
		System.out.println("잔량 배터리 : "+battery);
		
		// 3. 반환형X, 매개변수O
		myPhone.setVolume(15);
		
		// 4. 반환형O, 매개변수O
		String msg = myPhone.sendMsg("안녕");
		System.out.println(msg);
		
		System.out.println();
		
		Library library = new Library();
		library.borrowBooks("채식주의자", "해바라기", "데미안");
		System.out.println();
		library.returnBooks(2000, "채식주의자", "해바라기", "데미안");
		
		// 객체화
		Hospital hospital = new Hospital();
		hospital.emergencyCall();
		// hospital.doctorCall();
		// hospital.staffAnnouncement();
		// hospital.personalRecord();
		
		// 인스턴스를 생성하지 않고 메소드 호출 가능
		Hospital.hospitalInfo();
		// 객체로도 static 메서드를 접근 할 수 있지만 권고하진않는다.
		// hospital.hospitalInfo();
		
}
}
