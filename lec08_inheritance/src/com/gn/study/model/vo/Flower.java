package com.gn.study.model.vo;

public class Flower {
	private String name;
	private String color;
	
	public Flower() {}
	public Flower(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	@Override
	public boolean equals(Object obj) {
		Flower f = (Flower)obj;
		if(this.name.equals(f.name)) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + "\n색상 : " + color;
	}
}
