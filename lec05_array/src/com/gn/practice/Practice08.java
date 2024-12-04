package com.gn.practice;

import java.util.Scanner;

public class Practice08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("소문자로 이루어진 문자열을 입력하세요: ");
        String input = scan.nextLine(); // 문자열 입력 받기
        
        // 소문자만 포함된 입력인지 확인
        if (!input.matches("[a-z]+")) {
            System.out.println("오류: 입력 문자열은 소문자만 포함해야 합니다.");
            return;
        }
        
        int[] counts = new int[26]; // 알파벳 개수(26) 크기의 배열 생성

        // 문자열 순회하면서 알파벳 개수 세기
        for (char ch : input.toCharArray()) {
            counts[ch - 'a']++; // 'a'를 기준으로 배열 인덱스 계산
        }

        // 결과 출력
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) { // 해당 알파벳이 존재할 경우 출력
                System.out.println((char) (i + 'a') + ": " + counts[i] + "개");
            }
        }
    }
}

