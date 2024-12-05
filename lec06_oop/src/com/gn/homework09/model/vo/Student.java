package com.gn.homework09.model.vo;

public class Student {
	private static int studentNumber;
	private String studentName;
	private String className;
	
	// setter
	public void setStudentNumber() {
		this.studentNumber++;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
	// getter
	public int getStudentNumber() {
		return studentNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public String getClassName() {
		return className;
	}
	
	
}
			