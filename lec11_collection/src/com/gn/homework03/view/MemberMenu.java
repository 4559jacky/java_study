package com.gn.homework03.view;

import java.util.Scanner;

import com.gn.homework03.controller.MemberController;
import com.gn.homework03.model.vo.Member;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public void mainMenu() {
		
		System.out.println("(주)가남에 오신것을 환영합니다.");
		// 원하시는 업무의 번호를 선택하세요.
		System.out.println("원하시는 메뉴의 번호를 입력하세요.");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 같은 이름 회원 찾기");
		System.out.println("9. 종료");
		// 메뉴 선택 :
		System.out.print("메뉴 선택 : ");
		int choice = sc.nextInt();
		// 숫자 입력 받아서 기능 수행하기
		switch(choice) {
			case 1 : 
				joinMember();
				break;
			case 2 : 
				login();
				memberMenu();
				break;
			case 3 : 
				sameName();
				break;
			case 9 : 
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				break;
			// 만일 1,2,3,9 외의 숫자 입력하면 -> "잘못 입력하였습니다. 다시 입력해주세요." 출력
			default :
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
				mainMenu();
				break;
		}
	}
	public void memberMenu() {
		// 1. 로그아웃전까지 메뉴 화면 반복 실행
		// 2. 각 메뉴 번호 입력하면 해당 메소드로 이동
		// 3. 잘못 입력하였을 경우 "잘못 입력하였습니다. 다시 입력해주세요." 출력
		// ***** 회원 메뉴 *****
		// 회원 메뉴는 회원만 접근할 수 있습니다.
		// 먼저 회원가입, 로그인을 해주세요.
		// 1. 비밀번호 바꾸기 -> changePassword()실행
		// 2. 이름 바꾸기 -> changeName() 실행
		// 3. 로그아웃 -> "로그아웃 되었습니다." 출력 후 mainMenu로 돌아가기
		// (이전에 수행된 메소드로 돌아가려면 break; 대신 return; 코드를 사용)	
		System.out.println("(주)가남에 오신것을 환영합니다.");
		// 원하시는 업무의 번호를 선택하세요.
		System.out.println("원하시는 메뉴의 번호를 입력하세요.");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 같은 이름 회원 찾기");
		System.out.println("9. 종료");
		// 메뉴 선택 :
		System.out.print("메뉴 선택 : ");
		int choice = sc.nextInt();
		// 숫자 입력 받아서 기능 수행하기
		switch(choice) {
			case 1 : 
				joinMember();
				break;
			case 2 : 
				login();
				memberMenu();
				break;
			case 3 : 
				sameName();
				break;
			case 9 : 
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				break;
			// 만일 1,2,3,9 외의 숫자 입력하면 -> "잘못 입력하였습니다. 다시 입력해주세요." 출력
			default :
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
				mainMenu();
				break;
		}
		
		mainMenu();
	}
	public void joinMember() {
		// 1. 회원가입에 필요한 아이디, 비밀번호, 이름 입력 받음
		System.out.println("===== 1. 회원가입 =====");
		while(true) {
			System.out.print("아이디 : ");
			String id = sc.next();
			sc.nextLine();
			System.out.print("비밀번호 : ");
			String password = sc.next();
			sc.nextLine();
			System.out.print("이름 : ");
			String name = sc.next();
			// 2. 비밀번호와 이름은 Member 객체에 담음
			Member m = new Member(password, name);
			// 3. id와 Member 객체를 MemberController(mc)의 joinMember()로 보내기
			// (mc의 joinMember()를 호출하라는 이야기)
			boolean success = mc.joinMember(id, m);
			// 4. mc의 joinMember()로부터 받은 결과에 따라 다른 문장 출력
			// -> true : "성공적으로 회원가입 완료하였습니다."
			// -> false : "중복된 아이디입니다. 다시 입력해주세요." 
			if(success) {
				System.out.println("성공적으로 회원가입 완료했습니다.");
				break;
			} else {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
				// (false일 경우 회원가입이 완료될때까지 반복)
			}
		}
		mainMenu();
	}
	public void login() {
		// 1. 아이디와 비밀번호를 사용자로부터 입력 받음
		System.out.println("===== 2. 로그인 =====");
		while(true) {
			System.out.print("아이디 : ");
			String id = sc.next();
			sc.nextLine();
			System.out.print("비밀번호 : ");
			String password = sc.next();
			// 2. mc의 logIn() 메소드로 넘겨줌
			String success = mc.login(id, password);
			// 3. 반환 값이 있으면 "OOO님, 환영합니다!" 출력
			if(!(success==null)) {
				System.out.println("OOO님, 환영합니다!");
				// -> 그 다음 로그인 화면(memberMenu() 메소드 호출)으로 이동
				// -> memberMenu 호출은 mainMenu() 메소드에서 수행
				break;
			} else {
				// -> "틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요."출력
				// -> 올바른 아이디와 비밀번호를 입력할때까지 반복
				System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
			}
		}
		
		
		// 4. 반환 값이 없으면 
		
	}
	public void changePassword() {
		// 1. 아이디와 기존 비밀번호, 변경할 비밀번호 입력 받음
		System.out.println("=== 1. 비밀번호 바꾸기 ===");
		while(true) {
			System.out.print("아이디 : ");
			String id = sc.next();
			sc.nextLine();
			System.out.print("현재 비밀번호 : ");
			String password = sc.next();
			sc.nextLine();
			System.out.print("새로운 비밀번호 : ");
			String newPassword = sc.next();
			// 2. mc의 changePassword()로 보내기
			boolean success = mc.changePassword(id, password, newPassword);
			// 3. mc의 changePassword로부터 받은 결과값이 true
			// -> "비밀번호 변경에 성공했습니다." 출력
			// 4. mc의 changePassword로부터 받은 결과값이 false
			// -> "비밀번호 변경에 실패했습니다. 다시 입력해주세요." 출력
			if(success) {
				System.out.println("비밀번호 변경에 성공했습니다.");
				break;
			} else {
				System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
				// -> 비밀번호 변경에 성공할 때까지 반복
			}
		}
		memberMenu();
	}
	
	public void changeName() {
		// 1. 아이디와 비밀번호를 입력 받음
		System.out.println("=== 2. 이름 바꾸기 ===");
		while(true) {
			System.out.print("아이디 : ");
			String id = sc.next();
			sc.nextLine();
			System.out.print("비밀번호 : ");
			String password = sc.next();
			// 2. mc의 login()으로 아이디, 비밀번호 전달해서 현재 저장되어 있는 이름 받음
			String name = mc.login(id, password);
			// 3. mc.login()에서 전달받은 문자열이 null이 아닌 경우
			// 3-1.사용자에게 현재 저장되어 있는 이름을 출력해서 보여줌
			if(name!=null) {
				System.out.println("현재 설정된 이름 : "+name);
				// 사용자로부터 변경할 이름을 입력 받음
				System.out.print("변경할 이름 : ");
				String newName = sc.nextLine();
				// mc의 changeName()으로 id와 함께 넘김
				mc.changeName(id, newName);
				// "이름 변경에 성공하였습니다."출력
				System.out.println("이름 변경에 성공했습니다.");
			} else {
				// 3-2. 만일 logIn()으로부터 저장되어 있는 이름을 받지 못했다면
				// "이름 변경에 실패했습니다. 다시 입력해주세요"출력
				System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요");
				// logIn logIn()으로부터 저장되어 있는 이름을 받을 때까지 반복
			}
		}
	}
	
	public void sameName() {
		// 1. 검색할 이름을 받고 mc의 sameName()메소드로 넘김. 
		System.out.println("=== 3. 같은 이름 회원 찾기 ===");
		System.out.print("검색할 이름 : ");
		String searchName = sc.nextLine(); 
		// -> mc의 sameName()은 TreeMap<String,String>을 리턴
		mc.sameName(searchName);
		// 2. 반환 값을 가지고 entrySet()을 이용하여 ‘이름-아이디’ 형식으로 출력
		
		
	}
	
}
