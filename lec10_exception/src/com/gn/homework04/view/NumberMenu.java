package com.gn.homework04.view;

import java.util.Scanner;

import com.gn.homework04.controller.NumberController;
import com.gn.homework04.exception.NumRangeException;

public class NumberMenu {
	public void menu() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();

		NumberController nc = new NumberController();
		try {
			boolean bool = nc.checkDouble(num1, num2);
			System.out.println(num1+"은(는) "+num2+"의 배수인가? "+bool);
		} catch(NumRangeException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
