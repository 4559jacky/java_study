package com.gn.homework02;

import java.io.File;

public class Run {
	public static void main(String[] args) {
		Practice p = new Practice();
		File dir = new File("C:\\test\\sub");
		long start1 = System.nanoTime();
		p.method1(dir);
		long end1 = System.nanoTime();
		double result1 = (end1 - start1)/100000.0;
		long start2 = System.nanoTime();
		p.method2(dir);
		long end2 = System.nanoTime();
		double result2 = (end2 - start2)/100000.0;
		System.out.println("method1메소드 실행에 소요된 시간 : "+result1);
		System.out.println("method2메소드 실행에 소요된 시간 : "+result2);
	}
}
