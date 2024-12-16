package com.gn.homework06;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		String sentence = "the quick brown fox jumps over the lazy dog";
//		사용자로부터 문자열 입력 받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단어를 입력하세요: ");
		String word = sc.nextLine();
		String[] str = sentence.split(" ");
		for(int i=0; i<str.length; i++) {
			if(!(i==str.length-1)) {
				if(str[i].equals(word)) {
					System.out.println(word+" 다음 단어: "+str[i+1]);
					break;
				}
			} else {
				if(str[i].equals(word)) {
					System.out.println("마지막 단어입니다.");
				} else {
					System.out.println("존재하지 않는 단어입니다.");
				}
			} 
			
		}
	}
}
