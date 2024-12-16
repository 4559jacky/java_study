package com.gn.homework03.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.gn.homework03.model.vo.Member;

public class MemberController {
	private Map<String, Member> map = new HashMap<>();
	
	public boolean joinMember(String id, Member m) {
		boolean result = false;
		if(!map.containsKey(id)) {
			map.put(id, m);
			result = true;
		}
		return result;
	}
	
	public String login(String id, String password) {
		if(map.containsKey(id)) {
			if(map.get(id).getPassword().equals(password)) {
				return map.get(id).getName();
			}
		}
		return null;
	}
	
	public boolean changePassword(String id, String oldPw,
					String newPw) {
		boolean result = false;
		if(map.containsKey(id)) {
			if(map.get(id).getPassword().equals(oldPw)) {
				map.get(id).setPassword(newPw);
				result = true;
			}
		}
		return result;
	}
	
	public void changeName(String id, String newName) {
		map.get(id).setName(newName);
	}
	
	public TreeMap<String, String> sameName(String name) {
		Set<String> nameSet = map.keySet();
		Iterator<String> iterator = nameSet.iterator();
		TreeMap<String, String> treeMap = new TreeMap<>();
		while(iterator.hasNext()) {
			String key = iterator.next();
			Member value = map.get(key);
			if(value.getName().equals(name)) {
				treeMap.put(key, name);
			}
		}
		return treeMap;
	}
	
	
	
	
	
}
