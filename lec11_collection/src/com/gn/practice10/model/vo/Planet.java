package com.gn.practice10.model.vo;

public class Planet {
	private String name;
	private int diameter;
	private double preiod;
	
	public Planet() {}
	public Planet(String name, int diameter,
					double preiod) {
		this.name = name;
		this.diameter = diameter;
		this.preiod = preiod;
	}
	public String getName() {
		return name;
	}

	public int getDiameter() {
		return diameter;
	}

	public double getPreiod() {
		return preiod;
	}
	@Override
	public String toString() {
		return name + " (지름: " + diameter + " km, 공전주기: " + preiod + "년)";
	}
	
	

	
	
}
