package com.gn.practice01;

public class Run {
	public static void main(String[] args) {
		long before = System.currentTimeMillis();
		int[] array = new int[1000000];
		for(int i=0; i<array.length; i++) {
			array[i] = (int)(Math.random()*100)+1;
		}
		int[] arr_clone = new int[array.length/2];
		System.arraycopy(array, 0, arr_clone, 0, array.length/2);
		for(int i=0; i<arr_clone.length; i++) {
			if(i%10==9) {
				System.out.println(arr_clone[i]);
			} else {
				System.out.print(arr_clone[i]+",");
			}
		}
		long after = System.currentTimeMillis();
		System.out.println("복사 작업 소요 시간: "+(after-before)/100+"ms");
	}
}
