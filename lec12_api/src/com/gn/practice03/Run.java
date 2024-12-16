package com.gn.practice03;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		String sentence = "the quick brown fox jumps over the lazy dog";
//		사용자로부터 문자열 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("단어를 입력하세요: ");
		String word = sc.nextLine();
//		입력받은 단어가 sentence에 존재하는지 확인
//		if(sentence.contains(word)) {
//			System.out.println(word);
//		} else {
//			System.out.println("존재하지 않는 단어입니다.");
//		}
//		일치하는 단어가 있으면 해당 단어 출력
//		없으면 "존재하지 않는 단어입니다." 출력
		
//		 심화문제
//       단어가 존재하면 해당 단어 뒤에 오는 단어를 출력합니다.
//		 만약 입력된 단어가 마지막 단어라면, “마지막 단어입니다.”라고 출력하세요.
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
//		 단어가 존재하지 않으면 “존재하지 않는 단어입니다.”라고 출력하세요.
//		 3) 출력 예시
//		 단어를 입력하세요: **brown**
//		 brown 다음 단어: fox
		
		
		
		
		
	}
}
