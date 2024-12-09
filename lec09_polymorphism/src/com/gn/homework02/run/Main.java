package com.gn.homework02.run;

import com.gn.homework02.model.vo.Dish;
import com.gn.homework02.model.vo.Drink;
import com.gn.homework02.model.vo.Menu;

public class Main {
	public static void main(String[] args) {
		// Menu 타입의 객체 배열 크기 5로 생성
		Menu[] menu = new Menu[5];
		// 각 인덱스에 무작위로 Dish 또는 Drink 객체 생성
		int random = 0;
		for(int i=0; i<menu.length; i++) {
			random = (int)(Math.random()*10);
			if(random%2!=0) {
				if(i==0) {
					menu[i] = new Drink("딸기바나나", 3500, "딸기, 바나나");
				} else if(i==1) {
					menu[i] = new Drink("초코바나나", 3500, "초코, 바나나");
				} else if(i==2) {
					menu[i] = new Drink("아샷추", 3500, "아이스티, 에스프레소 샷");
				} else if(i==3) {
					menu[i] = new Drink("아망추", 3500, "아이스티, 망고");
				} else if(i==4) {
					menu[i] = new Drink("바닐라 라떼", 3500, "우유, 에스프레소 샷, 바닐라 시럽");
				}
			} else {
				if(i==0) {
					menu[i] = new Dish("스테이크", 60000, "소고기");
				} else if(i==1) {
					menu[i] = new Dish("토마토 파스타", 15000, "토마토, 스파게티 면");
				} else if(i==2) {
					menu[i] = new Dish("바지락 칼국수", 10000, "바지락, 칼국수 면");
				} else if(i==3) {
					menu[i] = new Dish("제육볶음", 20000, "돼지고기, 고추장, 채소");
				} else if(i==4) {
					menu[i] = new Dish("짬뽕", 9000, "짬뽕면, 짬뽕국물");
				}	
			}
		}
		for(Menu m : menu) {
			m.cook();
		}
		
	}
}
