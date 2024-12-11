package com.gn.study.model.vo;
// 제네릭
public class Container<T, A ,B> {
	private T item;
	private A name;
	private B age;
	
	public Container(T item, A name, B age) {
		this.item = item;
		this.name = name;
		this.age = age;
	}
	
	public T getItem() {
		return item;
	}
	public void SetItem(T item) {
		this.item = item;
	}

	public A getName() {
		return name;
	}

	public void setName(A name) {
		this.name = name;
	}

	public B getAge() {
		return age;
	}

	public void setAge(B age) {
		this.age = age;
	} 
}
