package com.gn.homework02.model.vo;

import java.util.Objects;

public class Lottery implements Comparable<Lottery> {
	private String name;
	private String phone;
	public Lottery() {}
	public Lottery(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "[이름=" + name + ", 휴대폰 번호=" + phone +"]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, phone);
	}
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof Lottery) {
			Lottery lot = (Lottery)obj;
			if(lot.name.equals(name)&&
					lot.phone.equals(phone)) {
				result = true;
			}
		}
		return result;
	}
	@Override
	public int compareTo(Lottery other) {
		if(name.equals(other.name)) {
			return phone.compareTo(other.phone);
		}
		return name.compareTo(other.name);
	}
	
}
