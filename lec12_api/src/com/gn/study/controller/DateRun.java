package com.gn.study.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateRun {
	public static void main(String[] args) {
		// Calendar
		Calendar cal1 = Calendar.getInstance();
		int year = cal1.get(Calendar.YEAR);
		int month = cal1.get(Calendar.MONTH)+1;
		int day = cal1.get(Calendar.DATE);
		System.out.println(year+"년 "+month+"월");
		
		Calendar cal2= Calendar.getInstance();
		int year2 = cal2.get(Calendar.YEAR);
		int mon2 = cal2.get(Calendar.MONTH)+1;
		int date2 = cal2.get(Calendar.DATE);
		int day2 = cal2.get(Calendar.DAY_OF_WEEK);
		String str2 = "";
		switch(day2) {
			case 1 :  str2 = "일";
			break;
			case 2 :  str2 = "월";
			break;
			case 3 :  str2 = "화";
			break;
		}
		System.out.println(year2+"년 "+mon2+"월 "+date2+"일 "+str2);
		
		// 날짜 변경(1) : set
		Calendar christmas = Calendar.getInstance();
		christmas.set(Calendar.DATE, 25);
		christmas.set(2024, 12-1, 25);
//		System.out.println(christmas);
		
		// 날짜 변경(2) : add
		Calendar cal3 = Calendar.getInstance();
		cal3.add(Calendar.DATE, 7);
		System.out.println(Calendar.DATE);
		
		String toDay = "2024-05-14";
		String[] temp = toDay.split("-");
		Calendar cal4 = Calendar.getInstance();
		cal4.set(Integer.parseInt(temp[0]),
				Integer.parseInt(temp[1])-1,
				Integer.parseInt(temp[2]));
		cal4.add(Calendar.MONTH, -1);
		int year4 = cal4.get(Calendar.YEAR);
		int mon4 = cal4.get(Calendar.MONTH)+1;
		int date4 = cal4.get(Calendar.DATE);
		System.out.println(year4+"-"+mon4+"-"+date4);
		
		// 두 날짜 사이의 차이 구하기
		Calendar cal5 = Calendar.getInstance();
		cal5.set(2024, 10-1, 16);
		Calendar today = Calendar.getInstance();
		// 둘 사이의 차이 구하기
		long diff = today.getTimeInMillis()-cal5.getTimeInMillis();
		// 초단위로 바꾸기 위해 1000을 나눠준다.
		// 1초 == 1000ms
		diff /= 1000*(24*60*60);
		System.out.println(diff);
		
		
		// 최대값 구하기
		Calendar cal6 = Calendar.getInstance();
		int last = cal6.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("마지막 날짜 : "+last);
		int today_day = today.get(Calendar.DATE);
		System.out.println(last-today_day);
		
		// SimpleDateFormat
		// Date 써보기
		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E HH:mm:ss");
		String printDate = sdf.format(d);
		System.out.println(printDate);
		
		Calendar cal7 = Calendar.getInstance();
//		cal7.add(Calendar.YEAR, 1);
		Date date = cal7.getTime();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy-MM-dd a KK:mm");
		sdf2 = new SimpleDateFormat("yyyy-MM-dd E요일 a KK:mm:ss");
		System.out.println(sdf2.format(date));
		
	}
}
