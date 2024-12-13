package com.gn.practice11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Run {
	public static void main(String[] args) {
		Map<Integer, Fruit> fruits = new HashMap<>();
		fruits.put(1, new Fruit("귤", "제주", 10, 15000));
		fruits.put(2, new Fruit("사과", "예산", 5, 25000));
		fruits.put(3, new Fruit("포도", "강화도", 5, 35000));
		fruits.put(4, new Fruit("배", "나주", 10, 50000));
		
		System.out.println("=== 전체 데이터 조회 ===");
		Map<Integer, Fruit> fruits1 = new TreeMap<>(fruits);
		Set<Integer> keySet = fruits1.keySet();
		Iterator<Integer> itkey = keySet.iterator();
		while(itkey.hasNext()) {
			int key = itkey.next();
			Fruit value = fruits.get(key);
			System.out.println(key+" : "+value);
		}
		System.out.println("=== 가격 20000원 이상 ===");
		Set<Entry<Integer, Fruit>> upPrice = fruits.entrySet();
		Iterator<Entry<Integer, Fruit>> itEntry = upPrice.iterator();
		while(itEntry.hasNext()) {
			Entry<Integer, Fruit> entry = itEntry.next();
			int key = entry.getKey();
			Fruit value = entry.getValue();
			if(value.getPrice()>=20000) {
				System.out.println(key+" : "+value);
			}
		}
		System.out.println("=== 이름이 한글자인 과일 ===");
		Set<Integer> oneWordFruit = fruits.keySet();
		Iterator<Integer> iter = oneWordFruit.iterator();
		while(iter.hasNext()) {
			int key = iter.next();
			Fruit value = fruits.get(key);
			if(value.getName().length()==1) {
				System.out.println(key+" : "+value);
			}
		}
		System.out.println("=== 포도 가격 인상 ===");
		Set<Entry<Integer, Fruit>> rePriceFruit = fruits.entrySet();
		Iterator<Entry<Integer, Fruit>> itRePrice = rePriceFruit.iterator();
		while(itRePrice.hasNext()) {
			Entry<Integer, Fruit> entry = itRePrice.next();
			int key = entry.getKey();
			Fruit value = entry.getValue();
			if(value.getName().equals("포도")) {
				value.setPrice(28000);
				System.out.println(key+" : "+value);
			}
		}
		
		
	}
}
