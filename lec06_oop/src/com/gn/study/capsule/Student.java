package com.gn.study.capsule;

public class Student {
	
	// 캡슐화 1. 필드는 private
	private int studentNo;
	
	public Student(int studentNo) {
		this.studentNo = studentNo;
	}
	
	// getter -> 초기화가 아니라 재할당 방법
	public int getStudentNo() {
		return studentNo;
	}
	
	// setter -> 초기화가 아니라 재할당 방법
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
}
