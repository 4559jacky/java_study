package com.gn.study.model.vo;

import java.util.Objects;

public class Product implements Comparable<Product> {
	private String name;
	private int price;
	
	public Product() {
		super();
	}
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return name + "의 가격은 " + price + "원";
	}
	@Override
	public int compareTo(Product other) {
//		if(this.price > other.price) {
//			return 1;
//		} else if(this.price < other.price) {
//			return -1;
//		} else {
//			return 0;
//		}
		return this.name.compareTo(other.name);
//		return this.price - other.price;
	}
}
