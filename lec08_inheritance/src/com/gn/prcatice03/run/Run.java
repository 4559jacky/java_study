package com.gn.prcatice03.run;

import com.gn.prcatice03.model.vo.Circle;
import com.gn.prcatice03.model.vo.Rectangle;

public class Run {
	public static void main(String[] args) {
		// 크기가 2인 Circle, Rectangle 각각 객체 배열 할당  
		Circle[] cirArr = new Circle[2];
		Rectangle[] recArr = new Rectangle[2];
		// 위의 사용 데이터를 참고하여 각각 초기화 
		cirArr[0] = new Circle(1, 2, 3);
		cirArr[1] = new Circle(3, 3, 4);
		recArr[0] = new Rectangle(-1, -2, 5, 2);
		recArr[1] = new Rectangle(-2, 5, 2, 8);
		// 각 도형의 draw 메소드 실행(for each)
		System.out.println("=== circle ===");
		for(Circle c : cirArr) {
			c.draw();
		}
		System.out.println("=== rectangle ===");
		for(Rectangle r : recArr) {
			r.draw();
		}

		
	}
}
