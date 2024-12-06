package com.gn.study.controller;

import com.gn.study.model.vo.Dog;
import com.gn.study.model.vo.Flower;
import com.gn.study.model.vo.Juice;
import com.gn.study.model.vo.Pizza;

public class Run {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
//		Parent p = new Parent();
//		Child c = new Child();
//		System.out.println(p.getA());
//		System.out.println(c.getA());
		
		Juice j = new Juice("트로피칼", 500, "용과");
		j.juiceInfo();
		
		Pizza p = new Pizza();
		p.printReaction();
		
		Flower f1 = new Flower("장미", "빨간색");
		Flower f2 = new Flower("장미", "빨간색");
		boolean same = f1.equals(f2);
		System.out.println(same);
		
		System.out.println(f1);
		
	}
}