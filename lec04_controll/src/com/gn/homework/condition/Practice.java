package com.gn.homework.condition;

import java.util.Scanner;

public class Practice {
	public void practice01() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 놀이동상 입장료 계산하기===");
		System.out.print("나이 : ");
		int age = sc.nextInt();
		String money = "";
		if(age>=65) {
			money = "무료";
		} else if(age>=19) {
			money = "30000원";
		} else if(age>=13) {
			money = "20000원";
		} else if(age>=3) {
			money = "10000원";
		} else {
			money = "무료";
		}
		System.out.println("당신의 놀이동산 요금은 " + money + "입니다.");
	}
	
	public void practice02() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 일기예보 ===");
		System.out.print("월 : ");
		int month = sc.nextInt();
		
		System.out.print("기온 : ");
		int temp = sc.nextInt();
		
		String season = "";
		String alarm = "";
		
		if(month==1||month==2||month==12) {
			season = "겨울";
			if(temp <= -15) {
				alarm = "한파 경보";
			} else if(temp <= -12) {
				alarm = "한파 주의보";
			}
		} else if(month==3||month==4||month==5) {
			season = "봄";
		} else if(month==6||month==7||month==8) {
			season = "여름";
			if(temp >= 35) {
				alarm = "폭염 경보";
			} else if(temp >= 33) {
				alarm = "폭염 주의보";
			}
		} else if(month==9||month==10||month==11) {
			season = "가을";
		} else {
			season = "해당하는 계절이 없습니다.";
		}
		System.out.println(season + " " + alarm);
	}
	
	public void practice03() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 세개의 정수 비교하기 ===");
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		System.out.print("세 번째 정수 : ");
		int num3 = sc.nextInt();
		
		int min = num1 < num2 ? (num1 < num3 ? num1 : num3) : (num2 < num3 ? num2 : num3);
		
		System.out.println("세 수 중에서 가장 작은 수는 " + min + "입니다.");
	}
	
	public void practice04() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 철수네 공장 ===");
		System.out.print("수집된 코드 : ");
		int code = sc.nextInt();
		
		String message = "";
		
		switch(code) {
			case 400 : 
				message = "잘못된 요청입니다.";
				break;
			case 404 : 
				message = "요청하신 서비스를 찾을 수 없습니다.";
				break;
			case 500 : 
				message = "처리 방법을 알 수 없는 문제가 발생했습니다.";
				break;
			case 503 : 
				message = "일시적인 서버 오류가 발생하였습니다.";
				break;
			default :
				message = "알 수 없는 오류가 발생하였습니다.";
				break;
		}
		System.out.println(message);
	}
	
	public void practice05() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 헬스 마니아 철수 ===");
		System.out.println("1. 스쿼트");
		System.out.println("2. 데드리프트");
		System.out.println("3. 벤치 프레스");
		System.out.println("4. 풀업");
		System.out.println("5. 종료");
		int routine = sc.nextInt();
		
		String message = "";
		
		if(routine>0) {
			if(routine==1) {
				message = "스쿼트 운동 시간입니다.";
			} else if(routine==2) {
				message = "데드리프트 운동 시간입니다.";
			} else if(routine==3) {
				message = "벤치 프레스 운동 시간입니다.";
			} else if(routine==4) {
				message = "풀업 운동 시간입니다.";
			} else if(routine==5) {
				message = "오늘도 수고하셨습니다. ";
			} else {
				message = "목록에 있는 숫자만 입력해주세요.";
			}
		} else {
			message = "양수만 입력해주세요. ";
		}
		System.out.println(message);
	}
	
	public void practice06() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 합격인가? 불합격인가? ===");
		System.out.println("각 과목의 점수를 입력하세요.");
		System.out.print("소프트웨어설계 점수 : ");
		int sub1 = sc.nextInt();
		
		System.out.print("소프트웨어개발 점수 : ");
		int sub2 = sc.nextInt();
		
		System.out.print("데이터베이스구축 점수 : ");
		int sub3 = sc.nextInt();
		
		System.out.print("프로그래밍언어활용 점수 : ");
		int sub4 = sc.nextInt();
		
		System.out.print("정보시스템구축관리 점수 : ");
		int sub5 = sc.nextInt();
		
		int sum = (sub1+sub2+sub3+sub4+sub5)/5;
		
		String fail_sub = "";
		
		if(sub1>=40&&sub2>=40&&sub3>=40&&sub4>=40&&sub5>=40) {
			if(sum>=60) {
				System.out.println("합격을 축하합니다.");
			} else {
				System.out.println("평균 점수 60점 미만으로 불합격입니다.");
			}
		} else {
			if(sub1<40) {
				fail_sub += "소프트웨어설계 과목 ";
			}
			if(sub2<40) {
				fail_sub += "소프트웨어개발 과목 ";
			}
			if(sub3<40) {
				fail_sub += "데이터베이스구축 과목 ";
			}
			if(sub4<40) {
				fail_sub += "프로그래밍언어활용 과목 ";
			}
			if(sub5<40) {
				fail_sub += "정보시스템구축관리 과목 ";
			}
			System.out.println(fail_sub+"과락으로 불합격입니다.");
		}
	}
}
