package com.gn.study.controller;

import com.gn.study.model.vo.Alarm;
import com.gn.study.model.vo.Animal;
import com.gn.study.model.vo.Beverage;
import com.gn.study.model.vo.Cat;
import com.gn.study.model.vo.Coffee;
import com.gn.study.model.vo.Dog;
import com.gn.study.model.vo.Earth;
import com.gn.study.model.vo.FireAlarm;
import com.gn.study.model.vo.Mars;
import com.gn.study.model.vo.OrangeJuice;
import com.gn.study.model.vo.Planet;

public class Run {
	public static void main(String[] args) {
		// 1. 클래스의 업캐스팅
		int i_num = 3;
		double d_num = i_num;
		System.out.println(d_num);
		
		Beverage b1 = new Coffee();
		// like -> double d_num = 3;
		Beverage b2 = new OrangeJuice();
		
		b1.drink();
//		b1.ice();
		((Coffee)b1).ice();
		((OrangeJuice)b2).fresh();
		
		Coffee b3 = new Coffee();
		b3 = (Coffee)b1;
		b3.ice();
		
		b2.drink();
		
		// 2. 객체 배열과 다형성
		Beverage[] arr = new Beverage[3];
		Beverage bev = new Beverage();
		arr[0] = bev;
		
		Coffee cof = new Coffee();
		arr[1] = cof;
		
		OrangeJuice oj = new OrangeJuice();
		arr[2] = oj;
		
		System.out.println("=====================");
		
		for(Beverage b : arr) {
			b.drink();
			// 만약에 진짜 데이터가 Coffee면 ice메소드 호출
			// 만약에 진짜 데이터가 OrangeJuice면 fresh메소드 호출
			if(b instanceof Coffee) {
				((Coffee) b).ice();
			} else if(b instanceof OrangeJuice) {
				((OrangeJuice) b).fresh();
			}
		}
		
		// 3. 클래스 다운캐스팅
		
		
		// 4. 정적 바인딩
		System.out.println("=============================");
		Planet myPlanet = new Planet();
		myPlanet.description();
		myPlanet.description(46);
		
		
		// 5. 동적 바인딩
		System.out.println("=============================");
		Planet p1 = new Earth();
		Planet p2 = new Mars();
		p1.material();
		p2.material();
		
		
		// 6. 추상메소드
		System.out.println("=============================");
		Animal dog = new Dog(); // 타입(객체 자료형)으론 사용 가능하다
		dog.sound();
		Animal cat = new Cat();
		cat.sound();
		dog.breath();
		cat.breath();
//		Animal a= new Animal();
		// -> 추상 클래스는 인스턴스화(객체 선언) 할 수 없다.
		
		// 7. 인터페이스
		Alarm a = new FireAlarm();
		System.out.println(Alarm.MAX_VOLUME);
		a.soundAlarm();
		
		// 인터페이스는 다중상속이 가능하다.
		
		
		
		
	}
}
