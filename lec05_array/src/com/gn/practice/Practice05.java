package com.gn.practice;

import java.util.Scanner;

public class Practice05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] scores = {54, 23};
		int[] new_scores = new int[scores.length+1];
		for(int i=0; i<scores.length; i++) {
			new_scores[i] = scores[i];
		}
		System.out.print("길동이 : ");
		new_scores[2] = sc.nextInt();
		int sum = 0;
		for(int score : new_scores) {
			sum += score;
			System.out.println(score);
		}
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + (sum/new_scores.length));
	}
}
