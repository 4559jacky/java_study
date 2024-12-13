package com.gn.homework03.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.gn.homework03.model.vo.Member;

public class MemberController {
	private Map<String, Member> map = new HashMap<>();
	
	public boolean joinMember(String id, Member m) {
		boolean result = false;
		return result;
	}
	
	public String login(String id, String password) {
		return null;
	}
	
	public boolean changePassword(String id, String oldPw,
					String newPw) {
		return true;
	}
	
	public void changeName(String id, String newName) {
		
	}
	
	public TreeMap<String, String> sameName(String name) {
		TreeMap<String, String> treeMap = new TreeMap<>();
		return treeMap;
	}
	
	public String nameCheck(String id, String password) {
		return null;
	}
	
	
	
	
}
