package com.gn.practice06;

import java.util.Objects;

public class Food {
	private String name;
	private int price;
	
	public Food() {}
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof Food) {
			Food f = (Food)obj;
			if(f.name.equals(name)&&f.price==price) {
				result = true;
			}
		}
		return result;
	}
	@Override
	public String toString() {
		return name+":"+price;
	}
}
