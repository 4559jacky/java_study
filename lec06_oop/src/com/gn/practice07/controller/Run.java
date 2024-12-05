package com.gn.practice07.controller;

import com.gn.practice07.model.vo.Supplement;

public class Run {

	public static void main(String[] args) {
		Supplement[] arr = new Supplement[4];
		arr[0] = new Supplement("유산균", 1, 18000);
		arr[1] = new Supplement("비타민B", 1, 15000);
		arr[2] = new Supplement("루테인", 2, 20000);
		arr[3] = new Supplement("비타민D", 1, 12000);
		
		System.out.println("========== 영양제 목록 ==========");
		for(Supplement s : arr) {
			s.printInfo();
		}
	}

}
