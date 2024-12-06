package com.gn.practice01.model.vo;

public class Manager extends Employee {
	private String department;
	
	public Manager() {}
	public Manager(String name, String department) {
		super(name);
		this.department = department;
	}
	public void printDepartment() {
		super.printInfo();
		System.out.println("담당 부서 : "+department);
	}
}
