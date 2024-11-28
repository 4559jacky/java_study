package com.gn.homework;

import java.util.*;

public class Homework01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("말해보세요 : " );
		
		String str1 = sc.nextLine();
		String str2 = str1.equals("간다") ? "온다" : "간다";

//		if(str1.equals("간다")) {
//			str2 = "온다";
//		} else {
//			str2 = "간다";
//		}
		
		System.out.println("앵무새 : " + str2);
	}
}
