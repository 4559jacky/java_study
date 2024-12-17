package com.gn.practice09;

import java.util.Calendar;

public class Run {
	public static void main(String[] args) {
		Calendar smoke = Calendar.getInstance();
		smoke.set(2024, 1-1, 1);
		Calendar today = Calendar.getInstance();
		long diff = today.getTimeInMillis()-smoke.getTimeInMillis();
		long days = diff/(24*60*60*1000);
		System.out.println("오늘은 연초(1월 1일)로부터 "+days+"일이 지났습니다.");
	}
}
