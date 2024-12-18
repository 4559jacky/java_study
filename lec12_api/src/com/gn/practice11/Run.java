package com.gn.practice11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Run {
	public static void main(String[] args) {
		LocalDateTime dateTime1 = LocalDateTime.now();
		LocalDateTime release = LocalDateTime.of(2024,12,25,00,00,00);
		// 오늘 날짜
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(
				"오늘 날짜 : yyyy년 MM월 dd일");
		String today = dateTime1.format(dtf);
		System.out.println(today);
		// 영화 개봉일까지 남은 날
		long days = ChronoUnit.DAYS.between(dateTime1, release);
		System.out.println("영화 개봉까지 남은 날 : "+days+"일");
		// 개봉일의 요일
//		int yoil = release.getDayOfWeek().getValue();
//		String week = getKoreanDayOfWeek(yoil);
//		System.out.println("영화 개봉일의 요일 : "+week);
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("E요일");
		release.format(dtf1);
		System.out.println("영화 개봉일의 요일 : "+release.format(dtf1));
		

		// 개봉일
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern(
				"개봉일 : yyyy년 MM월 dd일");
		String releaseDay = release.format(dtf2);
		System.out.println(releaseDay);
	}
	public static String getKoreanDayOfWeek(int day) {
		// 요일의 정보를 숫자 형태로 전달 받아서 문자열 형태의 요일 정보 리턴
		// LocalDate의 getDayOfWeek().getValue() 활용
		String week = "";
		switch(day) {
			case 1 :
				week = "월요일";
				break;
			case 2 :
				week = "화요일";
				break;
			case 3 :
				week = "수요일";
				break;
			case 4 :
				week = "목요일";
				break;
			case 5 :
				week = "금요일";
				break;
			case 6 :
				week = "토요일";
				break;
			case 7 :
				week = "일요일";
				break;
		}
		return week;
	}
}
