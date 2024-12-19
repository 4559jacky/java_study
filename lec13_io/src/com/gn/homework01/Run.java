package com.gn.homework01;

public class Run {
	public static void main(String[] args) {
		String song = "나비야, 나비야 이리 날아오너라"
				+ "\n노랑나비, 흰 나비 춤을 추며 오너라"
				+"\n봄바람에 꽃잎도 방긋방긋 웃으며"
				+ "\n참새도 짹짹짹 노래하며 춤춘다";
		Practice p = new Practice();
		long start1 = System.nanoTime();
		p.method1(song);
		long end1 = System.nanoTime();
		double result1 = end1-start1;
		result1 = result1/100000.0;
		long start2 = System.nanoTime();
		p.method2(song);
		long end2 = System.nanoTime();
		double result2 = end2-start2;
		result2 = result2/100000.0;
		System.out.println("method1메소드 실행에 소요된 시간 : "+result1);
		System.out.println("method2메소드 실행에 소요된 시간 : "+result2);
		
	}
}
