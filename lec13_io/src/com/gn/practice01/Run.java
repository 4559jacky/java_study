package com.gn.practice01;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Run {
	public static void main(String[] args) {
		File dir1 = new File("C:\\test\\sub");
//		if(!dir1.exists()) {
//			if(dir1.mkdirs()) {
//				System.out.println("디렉토리 생성 성공");
//			} else {
//				System.out.println("디렉토리 생성 실패");
//			}
//		} else {
//			System.out.println("이미 존재하는 디렉토리");
//		}
//		LocalDate date = LocalDate.now();
//		int year = date.getYear();
//		int month = date.getMonthValue();
//		int day = date.getDayOfMonth();
//		System.out.println(year+","+month+","+day);
//		File dir2 = new File("C:\\test\\sub\\"
//				+year+"\\"+month+"\\"+day);
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(
//				"yyyy\\mm\\dd");
//		String path1 = date.format(dtf);
//		File dir2 = new File("C:\\test\\sub\\"
//				+path1);
//		if(!dir2.exists()) {
//			if(dir2.mkdirs()) {
//				System.out.println("디렉토리 생성 성공");
//			} else {
//				System.out.println("디렉토리 생성 실패");
//			}
//		} else {
//			System.out.println("이미 존재하는 디렉토리");
//		}
//		
		Practice p = new Practice();
		p.deleteFile(dir1);
	}
	
	
}
