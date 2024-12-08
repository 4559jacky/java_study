package com.gn.homework01.run;

import java.util.Scanner;

import com.gn.homework01.model.vo.Employee;
import com.gn.homework01.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		// 3명의 학생 정보를 기록할 수 있게 객체 배열 할당 (Student[])
		Student[] students = new Student[3];
		// 사용데이터 참고하여 3명의 학생 정보 초기화
		students[0] = new Student("김철수", 20, 178.2, 70.0, 1, "정보시스템공학과");
		students[1] = new Student("이영희", 23, 167.0, 54.0, 4, "물리학과");
		students[2] = new Student("홍길동", 21, 197.6, 86.0, 2, "경영학과");
		// 위의 학생 정보 모두 출력 
		for(Student s : students) {
			System.out.println(s.toString());
		}
		
		
		// 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당 (Employee[])
		Employee[] emp = new Employee[10];
		
		System.out.println("=== 사원 입력받기 ===");
		
		// 사원들의 정보를 키보드로 계속 입력 받고   --> while(true) 무한 반복문을 통해
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String answer = "y";
		while(true) {
			// ‘n’일 경우 더 이상 그만 입력 받도록..
			if(answer.equals("n")||answer.equals("N")||count>=10) {
				break;
			} 
			// 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
			else if(answer.equals("y")||answer.equals("Y")) {
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				System.out.print("키 : ");
				double height = sc.nextDouble();
				System.out.print("몸무게 : ");
				double weight = sc.nextDouble();
				System.out.print("급여 : ");
				int salary = sc.nextInt();
				sc.nextLine();
				System.out.print("부서 : ");
				String dept = sc.next();
				
				// 입력받은 정보들을 가지고 매개변수 생성자를 이용하여 객체배열에 객체 생성
				emp[count] = new Employee(name, age, height, weight, salary, dept);
				
				// 한 명씩 추가 될 때마다 카운트함
				count++;
				
				System.out.print("계속 추가하시겠습니까? ");
				answer = sc.next();
			}
		}

		// 배열에 담긴 사원들의 정보를 모두 출력
		for(Employee e : emp) {
			if(e == null) {
				break;
			} else {
				System.out.println(e.toString());
			}
		}
	
	}
}
