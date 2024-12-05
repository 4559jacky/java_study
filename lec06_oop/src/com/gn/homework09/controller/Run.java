package com.gn.homework09.controller;

import com.gn.homework09.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setStudentNumber();
		s1.setStudentName("김철수");
		s1.setClassName("A");
		System.out.println(s1.getStudentNumber()+" "+
							s1.getStudentName()+" "+
							s1.getClassName());
		Student s2 = new Student();
		s2.setStudentNumber();
		s2.setStudentName("홍길동");
		s2.setClassName("F");
		System.out.println(s2.getStudentNumber()+" "+
				s2.getStudentName()+" "+
				s2.getClassName());
		Student s3 = new Student();
		s3.setStudentNumber();
		s3.setStudentName("이영희");
		s3.setClassName("B");
		System.out.println(s3.getStudentNumber()+" "+
				s3.getStudentName()+" "+
				s3.getClassName());
	
	}
}
