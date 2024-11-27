package com.gn.homework;

import java.util.*;

public class Homework02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 : ");
		double weight = sc.nextDouble();
		System.out.print("세로 : ");
		double height = sc.nextDouble();
		System.out.println("면적 : " + weight*height);
		System.out.println("둘레 : " + (weight+height)*2);
	}

}
