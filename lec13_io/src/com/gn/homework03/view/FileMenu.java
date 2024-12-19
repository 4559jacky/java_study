//package com.gn.homework03.view;
//
//import java.util.Scanner;
//
//import com.gn.homework03.controller.FileController;
//
//public class FileMenu {
//	private Scanner sc = new Scanner(System.in);
//	private FileController fc = new FileController();
//	
//	public void mainMenu(){ 
//		System.out.println("***** My Note *****");
//		System.out.println("1. 노트 새로 만들기");
//		System.out.println("2. 노트 열기");
//		System.out.println("3. 노트 열어서 수정하기");
//		System.out.println("9. 끝내기");
//		System.out.print("메뉴 번호 : ");
//		int choice = sc.nextInt();
//		switch(choice) {
//			case 1: fileSave(); break;
//			case 2: fileOpen(); break;
//			case 3: fileEdit(); break;
//			case 9: 
//				System.out.println("프로그램을 종료합니다.");
//				sc.close();
//				break;
//			default : 
//				System.out.println();
//				mainMenu();
//				break;
//		}
//	 }
//	public void fileSave(){
//		 StringBuilder sb = new StringBuilder();
//		 String text = "";
//		 while(true) {
//			 System.out.println("파일에 저장할 내용을 입력하세요.");
//			 System.out.println("ex끝it  이라고 입력하면 종료됩니다.");
//			 System.out.print("내용 : ");
//			 text = sc.next();
//			 if(text.equals("ex끝it")==false) {
//				 break;
//			 }
//			 sb.append(text);
//			 sb.append("\n");
//		 }
//		 sc.nextLine();
//		 while(true) {
//			 System.out.println("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
//			 String title = sc.next();
//			 sc.nextLine();
//			 if(title.equals(title)) {
//				 System.out.println("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)");
//				 String answer = sc.next();
//				 if(answer.equals("y")) {
//					 fc.fileSave(title, sb);
//					 break;
//				 } else if(answer.equals("n")) {
//					 
//				 }
//			 } else {
//				 fc.fileSave(title, sb);
//				 break;
//			 }
//		 }
//	mainMenu();
//	}
//	public void fileOpen(){ 
//		System.out.print("열 파일 명 : ");
//		String title = sc.next();
//		fc.checkName(title);
//	} 
//	public void fileEdit(){ 
//
//	}
//}