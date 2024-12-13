package com.gn.practice10.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.gn.practice10.model.vo.Planet;

public class Main {
	public static void main(String[] args) {
		Map<String, Planet> planetMap = new HashMap<>();
		planetMap.put("Mercury", new Planet("수성", 2849, 0.24));
		planetMap.put("Venus", new Planet("금성", 12104, 0.62));
		planetMap.put("Earth", new Planet("지구", 12742, 1.0));
		planetMap.put("Mars", new Planet("화성", 6779, 1.88));
		
		// keySet()
		Set<String> keySet = planetMap.keySet();
		Iterator<String> itKey = keySet.iterator();
		System.out.println("*** keySet() 사용 ***");
		while(itKey.hasNext()) {
			String key = itKey.next();
			Planet value = planetMap.get(key);
			System.out.println("행성 이름: "+key+"("+value.getName()+
								"), 지름: "+value.getDiameter()+
								" km, 공전주기: "+value.getPreiod()+"년");
		}
		
		// entrySet()
		Set<Entry<String, Planet>> entrySet = planetMap.entrySet();
		Iterator<Entry<String, Planet>> itEntry = entrySet.iterator();
		System.out.println("*** entrySet() 사용 ***");
		while(itEntry.hasNext()) {
			Entry<String, Planet> entry = itEntry.next();
			String key = entry.getKey();
			Planet value = entry.getValue();
			System.out.println("키: "+key+", 값: "+value);
		}
	}
}
