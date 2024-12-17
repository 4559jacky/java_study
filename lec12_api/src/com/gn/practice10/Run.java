package com.gn.practice10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Run {
	public static void main(String[] args) {
		// 오늘 날짜를 기준으로 1주일 뒤에 날짜 정보를 출력
		// 00월 00일 0요일
		Calendar today = Calendar.getInstance();
		today.add(Calendar.DATE, 7);
		Date week = today.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("MM월 dd일 E요일");
		System.out.println(sdf.format(week));
//		today.add(Calendar.DATE, -7);
		today = Calendar.getInstance();
//		int month = today.getActualMaximum(Calendar.DAY_OF_MONTH);
//		System.out.println(month);
//		today.add(Calendar.DATE, month);
		today.add(Calendar.MONTH, 1);
		Date mon = today.getTime();
		System.out.println(sdf.format(mon));
	}
}
