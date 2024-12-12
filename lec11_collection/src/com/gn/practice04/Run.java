package com.gn.practice04;

import java.util.ArrayList;
import java.util.List;

public class Run {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("사과", 1000));
		list.add(new Product("바나나", 2000));
		list.add(new Product("딸기", 3000));
		
		System.out.println("=== for each로 조회 ===");
		for(Product p : list) {
			System.out.println(p);
		}
		list.remove(1);
		list.set(0, new Product("오렌지", 1500));
		System.out.println("=== 기본 for문으로 조회 ===");
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+" : "+list.get(i));
		}
	}
}
