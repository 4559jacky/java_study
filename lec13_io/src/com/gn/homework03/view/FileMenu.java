package com.gn.homework03.view;

import java.util.Scanner;

import com.gn.homework03.controller.FileController;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	public void mainMenu(){
		System.out.println("***** My Note *****");
		System.out.println("1. 노트 새로 만들기");
		System.out.println("2. 노트 열기");
		System.out.println("3. 노트 열어서 수정하기");
		System.out.println("9. 끝내기");
		System.out.print("메뉴 번호 : ");
		int choice = sc.nextInt();
		switch(choice) {
			case 1: fileSave(); break;
			case 2: fileOpen(); break;
			case 3: fileEdit(); break;
			case 9: 
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				break;
			default : 
				System.out.println();
				mainMenu();
				break;
		}
	 }
	public void fileSave(){
		 StringBuilder sb = new StringBuilder();
		 String text = "";
		 sc.nextLine();
		 while(true) {
			 System.out.println("파일에 저장할 내용을 입력하세요.");
			 System.out.println("ex끝it  이라고 입력하면 종료됩니다.");
			 System.out.print("내용 : ");
			 text = sc.nextLine();
			 if(text.equals("ex끝it")) {
				 break;
			 }
			 sb.append(text+"\n");
		 }
		 while(true) {
			 System.out.print("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
			 String title = sc.next();
			 sc.nextLine();
			 if(fc.checkName(title)) {
				 System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n) : ");
				 String answer = sc.next();
				 if(answer.equals("y")) {
					 fc.fileSave(title, sb);
					 break;
				 } else if(answer.equals("n")) {
					 
				 }
			 } else {
				 fc.fileSave(title, sb);
				 break;
			 }
		 }
		 mainMenu();
	}
	public void fileOpen(){ 
		System.out.print("열 파일 명 : ");
		String title = sc.next();
		sc.nextLine();
		if(fc.checkName(title)) {
			String text = fc.fileOpen(title).toString();
			System.out.println(text);
		} else {
			System.out.println("없는 파일입니다.");
		}
		mainMenu();
	} 
	public void fileEdit(){ 
		StringBuilder sb = new StringBuilder();
		System.out.print("수정할 파일 명 : ");
		String title = sc.next();
		sc.nextLine();
		if(fc.checkName(title)==false) {
			System.out.println("없는 파일입니다.");
		} else {
			while(true) {
				System.out.println("파일에 저장할 내용을 입력하세요.");
				System.out.println("ex끝it  이라고 입력하면 종료됩니다.");
				System.out.print("내용 : ");
				String text = sc.nextLine();
				if(text.equals("ex끝it")) {
					break;
				}
				sb.append(text+"\n");
			}
			
			fc.fileEdit(title, sb);
		}
		mainMenu();
	}
}
