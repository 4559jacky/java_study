package com.gn.homework11;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		LocalTime start = LocalTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("기준 : HH시 mm분 ss초");
		String startTime = start.format(dtf);
		System.out.println(startTime);
		Scanner sc = new Scanner(System.in);
		String answer = "";
		System.out.print("입력 : ");
		answer = sc.next();
		sc.nextLine();
		while(!(answer.toUpperCase().equals("N"))) {
			if(answer.toUpperCase().equals("Y")) {
				LocalTime end = LocalTime.now();
//				DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("경과(초) : ss")
				long seconds = ChronoUnit.SECONDS.between(start, end);
				System.out.println("경과(초) : "+seconds);
				System.out.print("입력 : ");
				answer = sc.next();
				sc.nextLine();
			} else {
				System.out.println("다시 입력해주세요.");
				System.out.print("입력 : ");
				answer = sc.next();
				sc.nextLine();
			}			
		}
		System.out.println("종료합니다.");
		sc.close();
		
	}
}
