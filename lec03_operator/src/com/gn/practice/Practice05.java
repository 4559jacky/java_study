package com.gn.practice;

import java.util.*;

public class Practice05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("boolean 값을 입력하세요 : ");
		boolean bool = sc.nextBoolean();
		System.out.println(bool+"의 반대 값은 "+!bool+"입니다.");
	}
}
