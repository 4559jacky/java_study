package com.gn.practice01.run;

import com.gn.practice01.model.vo.Manager;

public class Run {

	public static void main(String[] args) {
		// Manager 클래스 인스턴스화 : 매개변수 생성자 활용
		Manager m = new Manager("김철수", "영업부");
		// printInfo() 호출 : 직원 이름 출력
//		m.printInfo();
		// printDepartment() 호출 : 부서 정보 출력
		m.printDepartment();
	}

}
