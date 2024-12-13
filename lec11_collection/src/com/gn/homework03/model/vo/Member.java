package com.gn.homework03.model.vo;

import java.util.Objects;

public class Member {
	private String password;
	private String name;
	
	public Member() {}
	public Member(String password, String name) {
		this.password = password;
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Member [password=" + password + ", name=" + name + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, password);
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof Member) {
			Member mem = (Member)obj;
			if(mem.name.equals(name)&&
					mem.password.equals(password)) {
				result = true;
			}
		}
		return result;
	}
	
	
	
	
	
}
