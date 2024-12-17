package com.gn.homework09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Run {
	public static void main(String[] args) {
		Calendar open = Calendar.getInstance();
		open.set(2025, 1-1, 24);
		// 오늘 날짜 : OOOO년 OO월 OO일
		Calendar today = Calendar.getInstance();
		Date date = today.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("오늘 날짜 : yyyy년 MM월 dd일");
		System.out.println(sdf.format(date));
		// 카페 오픈일까지 남은 날 : OO일
		long days = open.getTimeInMillis()-today.getTimeInMillis();
		days /= 1000*24*60*60;
		System.out.println("카페 오픈일까지 남은 날 : "+days+"일");
		// 오픈달의 마지막 날 : 31일
		int last = open.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("오픈달의 마지막 날 : "+last+"일");
		// 카페 오픈일의 요일 : 금요일
		sdf = new SimpleDateFormat("카페 오픈일의 요일 : E요일");
		Date open1 = open.getTime();
		System.out.println(sdf.format(open1));
		
	}
}
