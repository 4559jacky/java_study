package com.gn.homework02;

public class Practice {
	public String takeState(String str) {
		String[] strArr = str.split(" ");
		for(String s : strArr) {
			if(s.substring(s.length()-1).equals("구")) {
				return s;
			}
		}
		return null;
	}
}
