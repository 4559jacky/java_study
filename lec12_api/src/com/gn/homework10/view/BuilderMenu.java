	package com.gn.homework10.view;

import java.util.Scanner;

import com.gn.homework10.controller.BuilderController;

public class BuilderMenu {
	private Scanner sc = new Scanner(System.in);
	private BuilderController bc = new BuilderController();
	
	public void mainMenu() {
		// 메뉴 번호 입력 받기
		System.out.println("==============================");
		System.out.println("1. 지정 문자열 사용");
		System.out.println("2. 입력 문자열 사용");
		System.out.println("9. 프로그램 끝내기");
		System.out.print("메뉴 번호 : ");
		int choice = sc.nextInt();
		switch(choice) {
			// 1. 지정 문자열 사용 -> builderMenu()
			case 1 : 
				builderMenu();
				break;
			// 2. 입력 문자열 사용 -> inputMenu()
			case 2 : 
				inputMenu();
				break;
			// 3. 프로그램 끝내기 -> "프로그램을 종료합니다." 출력 후 종료
			case 9 : 
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				break;
			// 잘못 입력하면 "잘못 입력하셨습니다. 다시 입력해주세요" 출력 후 반복
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
				mainMenu();
		}
			
	}
	public void builderMenu() {
		String str = "J a v a P r o g r a m ";
		System.out.println("띄어쓰기 제거 전 : "+str);
		// BuilderController()의 afterReplace() 반환값 활용
		// 다음의 3가지 출력
		// 1. 띄어쓰기 제거 처리 후 글자
		String step1 = bc.afterReplace(str);
		System.out.println("띄어쓰기 제거 후 : "+step1);
		// 2. 띄어쓰기 제거 처리 후 글자 개수
		System.out.println("띄어쓰기 제거 후 글자수 : "+step1.length());
		// 3. 결과를 모두 대문자로 변환 한 것
		String step2 = step1.toUpperCase();
		System.out.println("대문자로 변환 : "+step2);
		mainMenu();
	}
	public void inputMenu() {
		// 1. 문자열 입력 받기
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		// bc의 firstCap()으로 입력받은 문자열 넘기고 반환값 출력
		String step1 = bc.firstCap(str);
		System.out.println(step1);
		// 2. 문자 개수 찾기
		// bc에 findChar()로 위에 입력 받은 문자열과 방금 받은 문자 넘기기
		System.out.print("문자 입력 : ");
		char c = sc.next().charAt(0);
		int count = bc.findChar(step1, c);
		// 반환값 출력
		System.out.println(count);
		mainMenu();
	}
}
