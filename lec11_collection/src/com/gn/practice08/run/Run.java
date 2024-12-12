package com.gn.practice08.run;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.gn.practice08.model.vo.Person;

public class Run {
	public static void main(String[] args) {
		Set<Person> set1 = new HashSet<>();
		set1.add(new Person("홍길동", 20));
		set1.add(new Person("이순신", 25));
		set1.add(new Person("유관순", 22));
		Set<Person> set2 = new HashSet<>();
		set2.add(new Person("유관순", 22));
		set2.add(new Person("강감찬", 27));
		set2.add(new Person("을지문덕", 30));
		Set<Person> union = new TreeSet<>(set1);
		union.addAll(set2);
		Set<Person> intersection = new TreeSet<>(set1);
		intersection.retainAll(set2);
		Set<Person> difference = new TreeSet<>(set1);
		difference.removeAll(set2);
		
		System.out.println("=== 합집합 ===");
		Iterator<Person> iterator = union.iterator();
		int count = 1;
		while(iterator.hasNext()) {
			Person p = iterator.next();
			System.out.println(count+"번 "+p);
			count++;
		}
		System.out.println("=== 교집합 ===");
		iterator = intersection.iterator();
		count = 1;
		while(iterator.hasNext()) {
			Person p = iterator.next();
			System.out.println(count+"번 "+p);
			count++;
		}
		System.out.println("=== 차집합 ===");
		iterator = difference.iterator();
		count = 1;
		while(iterator.hasNext()) {
			Person p = iterator.next();
			System.out.println(count+"번 "+p);
			count++;
		}
		
	}
}
