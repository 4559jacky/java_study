package com.gn.practice07.model.vo;

public class Supplement {
	private String name;
	private int dose;
	private int price;
	
	public Supplement() {}
	public Supplement(String name, int dose, int price) {
		this.name = name;
		this.dose = dose;
		this.price = price;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setDount(int dose) {
		this.dose = dose;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// getter
	public String getName() {
		return name;
	}
	public int getDose() {
		return dose;
	}
	public int getPrice() {
		return price;
	}
	
	public void printInfo() {
		System.out.println("이름 : "+name+", "+"복용량 : "+dose+"알, "+"가격 : "+price+"원");
	}
	
}
