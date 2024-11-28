package com.gn.homework;

import java.util.Scanner;

public class Homework02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("월 : ");
		int month = sc.nextInt();
		System.out.print("기온 : ");
		int temperature = sc.nextInt();
		
		String season = "";
		String alarm = "";
		
		if(month==1||month==2||month==12) {
			season = "겨울";
			if(temperature <= -15) {
				alarm = "한파 경보";
			} else if(temperature <= -12) {
				alarm = "한파 주의보";
			}
		} else if(month==3||month==4||month==5) {
			season = "봄";
		} else if(month==6||month==7||month==8) {
			season = "여름";
			if(temperature >= 35) {
				alarm = "폭염 경보";
			} else if(temperature <= 33) {
				alarm = "폭염 주의보";
			}
		} else if(month==9||month==10||month==11) {
			season = "가을";
		} else {
			season = "해당하는 계절이 없습니다.";
		}
		
		System.out.println(season+ " " +alarm);
		
	}
}

