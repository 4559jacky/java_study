package com.gn.prcatice03.run;

import java.util.Scanner;

import com.gn.prcatice03.model.vo.Circle;
import com.gn.prcatice03.model.vo.Rectangle;

public class Run1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 크기가 2인 Circle, Rectangle 각각 객체 배열 할당  
		Circle[] cirArr = new Circle[2];
		Rectangle[] recArr = new Rectangle[2];
		// 위의 사용 데이터를 참고하여 각각 초기화
		System.out.print("x값을 입력 : ");
		int x = sc.nextInt();
		System.out.print("x값을 입력 : ");
		int y = sc.nextInt();
		System.out.print("radius값을 입력 : ");
		int radius = sc.nextInt();
		cirArr[0] = new Circle(x, y, radius);
		do {
			System.out.print("x값을 입력 : ");
			x = sc.nextInt();
			System.out.print("x값을 입력 : ");
			y = sc.nextInt();
			System.out.print("radius값을 입력 : ");
			radius = sc.nextInt();
			cirArr[1] = new Circle(x, y, radius);
		} while(false);
		
		System.out.print("width값을 입력 : ");
		int width = sc.nextInt();
		System.out.print("height값을 입력 : ");
		int height = sc.nextInt();
		recArr[0] = new Rectangle(-1, -2, width, height);
		do {
			System.out.print("x값을 입력 : ");
			width = sc.nextInt();
			System.out.print("x값을 입력 : ");
			height = sc.nextInt();
			recArr[1] = new Rectangle(-2, 5, width, height);
		} while(false);
		
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
