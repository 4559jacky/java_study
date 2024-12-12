package com.gn.study.controller;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.gn.study.model.vo.Product;
import com.gn.study.model.vo.Student;

public class SetRun {
	public static void main(String[] args) {
		Set<Integer> class1 = new HashSet<>();
		class1.add(1);
		class1.add(2);
		class1.add(3);
		System.out.println(class1);
		
		Set<Integer> class2 = new HashSet<>();
		class2.add(3);
		class2.add(4);
		class2.add(5);
		System.out.println(class2);
		
		// 합집합
		System.out.println("==== HashSet의 합집합 ====");
//		class1.addAll(class2);
		Set<Integer> union = new HashSet<>(class1);
		union.addAll(class2);
		System.out.println(union);
		
		// 교집합
		System.out.println("==== HashSet의 교집합 ====");
//		class1.retainAll(class2);
		Set<Integer> intersection = new HashSet<>(class1);
		intersection.retainAll(class2);
		System.out.println(intersection);
		
		// 차집합
		System.out.println("==== HashSet의 차집합 ====");
		Set<Integer> difference = new HashSet<>(class1);
		difference.removeAll(class2);
		System.out.println(difference);
		
		// 객체 집합
		System.out.println("==== 객체의 집합 ====");
		Set<Student> set1 = new HashSet<>();
		set1.add(new Student("철수", 20));
		set1.add(new Student("영희", 28));
		set1.add(new Student("은우", 30));
		
		Set<Student> set2 = new HashSet<>();
		set2.add(new Student("철수", 20));
		set2.add(new Student("길동", 25));
		
//		set1.addAll(set2);
//		set1.retainAll(set2);
		set1.removeAll(set2);
		System.out.println(set1);
		
		System.out.println("==== Iterator ====");
		
		Set<String> fruits = new HashSet<>();
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("체리");
		System.out.println(fruits);
		Iterator<String> iterator = fruits.iterator();
		String[] str = new String[fruits.size()];
		int count = 0;
		while(iterator.hasNext()) {
			String fruit = iterator.next();
			str[count++] = fruit;
			System.out.print(fruit);
			iterator.remove();
			if(fruits.size() != 0) {
				System.out.print(", ");
			}
		}
		System.out.println();
		for(String s : str) {
			System.out.println(s);
		}
		
		System.out.println("==== LinkedHashSet ====");
		Set<String> set4 = new LinkedHashSet<>();
//		set4 = new HashSet<>();
//		set4 = new TreeSet<>();
		set4 = new TreeSet<>(Collections.reverseOrder());
		set4.add("동");
		set4.add("서");
		set4.add("남");
		set4.add("북");
		set4.add("동");
		System.out.println(set4);
		Set<Product> set = new TreeSet<>();
		set.add(new Product("jelly", 2000));
		set.add(new Product("cookie", 4000));
		set.add(new Product("candy", 500));
		System.out.println(set);
	}
}
