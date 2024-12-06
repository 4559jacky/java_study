package com.gn.homework01.run;

import java.util.Scanner;

import com.gn.homework01.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 최대 10명의 학생 정보를 기록할 수 있게 배열을 생성
		Student[] students = new Student[10];
		
		for (int i = 0; i < students.length; i++) {
		    students[i] = new Student(); // 객체 생성
		}
		// 학생수를 나타내는 변수
		// 한명 추가시 1씩 증가
		int count = 0;
		
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		students[count].setGrade(grade);
		System.out.print("반 : ");
		int classroom = sc.nextInt();
		students[count].setClassroom(classroom);
		System.out.print("이름 : ");
		String name = sc.next();
		students[count].setName(name);
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		students[count].setKor(kor);
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		students[count].setEng(eng);
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		students[count].setMath(math);
		
		System.out.print("계속 추가하시겠습니까? ");
		sc.nextLine();
		String answer = sc.nextLine();
		
		while(true) {
			count++;
			// 'n'또는 'N'을 입력할때까지 계속 학생 정보 입력받기
			if(answer.equals("N")||answer.equals("n")||count==10) {
				break;
			} else {
				System.out.print("학년 : ");
				grade = sc.nextInt();
				students[count].setGrade(grade);
				System.out.print("반 : ");
				classroom = sc.nextInt();
				students[count].setClassroom(classroom);
				System.out.print("이름 : ");
				name = sc.next();
				students[count].setName(name);
				System.out.print("국어점수 : ");
				kor = sc.nextInt();
				students[count].setKor(kor);
				System.out.print("영어점수 : ");
				eng = sc.nextInt();
				students[count].setEng(eng);
				System.out.print("수학점수 : ");
				math = sc.nextInt();
				students[count].setMath(math);	
				System.out.print("계속 추가하시겠습니까? ");
				sc.nextLine();
				answer = sc.nextLine();
			}
		}
		
		for(Student s : students) {
			if(s.getGrade()!=0) {
				System.out.println("=== "+s.getGrade()+"학년 "+
						s.getClassroom()+"반 "+
						s.getName()+" ===");
				System.out.println("국어 : "+s.getKor());
				System.out.println("영어 : "+s.getEng());
				System.out.println("수학 : "+s.getMath());
				System.out.println("평균 : "+(s.getKor()+s.getEng()+s.getMath())/3);
			} else {
				break;
			}
			
		}
		
		
	}
}
