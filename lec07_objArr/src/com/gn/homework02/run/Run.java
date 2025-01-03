package com.gn.homework02.run;

import com.gn.homework02.model.vo.Employee;

public class Run {
	public static void main(String[] args) {
		// 객체배열을 크기 3으로 할당 한 뒤
		Employee[] emp = new Employee[3];
		// 0번 인덱스에는 기본생성자를 통해서 객체 생성
		emp[0] = new Employee();
		// 1번 인덱스에는 매개변수 6개짜리 생성자를 이용하여 객체 생성
		emp[1] = new Employee(1, "이영희", 19, 'M', "01022223333", "가산");
		// 2번 인덱스에는 매개변수 10개짜리 생성자를 이용하여 객체 생성
		emp[2] = new Employee(2, "김철수", "교육부", "강사", 20, 'F',
								1000000, 0.01, "01011112222", "구디");
		
		// information 메소드로 객체 배열 출력
		int a = 0;
		for(Employee e : emp) {
			System.out.print("emp["+a+"] : ");
			System.out.println(e.information());
			a++;
		}
		
		System.out.println("=================================================================");
		
		// 3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 다시 출력
		emp[0].setEmpNo(0);
		emp[0].setEmpName("홍길동");
		emp[0].setDept("영업부");
		emp[0].setJob("팀장");
		emp[0].setAge(30);
		emp[0].setGender('M');
		emp[0].setSalary(3000000);
		emp[0].setBonusPoint(0.2);
		emp[0].setPhone("01055559999");
		emp[0].setAddress("금천구");
		
		emp[1].setDept("기획부");
		emp[1].setJob("부장");
		emp[1].setSalary(4000000);
		emp[1].setBonusPoint(0.3);
		
		a = 0;
		for(Employee e : emp) {
			if(a>=2) {
				break;
			}
			System.out.print("emp["+a+"] : ");
			System.out.println(e.information());
			a++;
		}

		System.out.println("=================================================================");
		
		// 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
		// 보너스가 적용된 연봉 = (급여 + (급여 * 보너스포인트)) * 12
		for(int i=0; i<emp.length; i++) {
			int salary = emp[i].getSalary();
			double bonusPoint = emp[i].getBonusPoint();
			emp[i].setSalary((int)(salary+(salary*bonusPoint))*12);
		}
		
		for(Employee e : emp) {
			System.out.println(e.getEmpName()+"의 연봉 : " + e.getSalary()+"원");
		}
		
		System.out.println("=================================================================");
		
		// 3명 직원의 연봉 평균을 구하여 출력
		int sum = 0;
		for(Employee e : emp) {
			sum += e.getSalary();
		}
		int agv = sum/3;
		System.out.println("직원들의 연봉의 평균 : "+agv+"원");
		
	}
}
