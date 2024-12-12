package com.gn.practice07.controller;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.gn.practice07.model.vo.Equipment;

public class Run {
	public static void main(String[] args) {
		Set<Equipment> storage1 = new HashSet<>();
		storage1.add(new Equipment("라켓", 15000));
		storage1.add(new Equipment("배트", 6000));
		storage1.add(new Equipment("축구공", 3000));
		
		Set<Equipment> storage2 = new HashSet<>();
		storage2.add(new Equipment("배트", 6000));
		storage2.add(new Equipment("야구공", 5000));
		storage2.add(new Equipment("글로브", 9000));
		
		System.out.println("*** 합집합 ***");
		Set<Equipment> example1 = new HashSet<>(storage1);
		example1.addAll(storage2);
//		Iterator<String> iterator = fruits.iterator();
		Iterator<Equipment> iterator = example1.iterator();
		while(iterator.hasNext()) {
			Equipment ment = iterator.next();
			System.out.println(ment);
			// remove()는 굳이 안해도 된다.
//			iterator1.remove();
		}
//		System.out.println(example1);
		
		System.out.println("*** 교집합 ***");
		Set<Equipment> example2 = new HashSet<>(storage1);
		example2.retainAll(storage2);
		iterator = example2.iterator();
		while(iterator.hasNext()) {
			Equipment ment = iterator.next();
			System.out.println(ment);
			iterator.remove();
		}
//		System.out.println(example1);
		
		System.out.println("*** 차집합 ***");
		Set<Equipment> example3 = new HashSet<>(storage1);
		example3.removeAll(storage2);
		iterator = example3.iterator();
		while(iterator.hasNext()) {
			Equipment ment = iterator.next();
			System.out.println(ment);
			iterator.remove();
		}
//		System.out.println(example1);
		
	}
}
