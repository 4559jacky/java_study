package com.gn.homework.dimensional;

import java.util.Scanner;
import java.util.Random;

public class Practice {
	Scanner sc = new Scanner(System.in);
	public void practice01() {
		int[] students = {152, 180, 165, 158, 171};
		for(int i=0; i<students.length-1; i++) {
			for(int j=i+1; j<students.length; j++) {
				if(students[i]>students[j]) {
					int temp = students[i];
					students[i] = students[j];
					students[j] = temp;
				}
			}
		}
		for(int s : students) {
			System.out.print(s + " ");
		}
	}
	public void practice02() {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int[] intArr = new int[num];
		for(int i=0; i<num; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			int n = sc.nextInt();
			intArr[i] = n;
		}
		int sum = 0;
		for(int a : intArr) {
			System.out.print(a + " ");
			sum += a;
		}
		System.out.println();
		System.out.println("총 합 : " + sum);
		
	}
	public void practice03() {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		while(true) {
			if(num%2==0) {
				System.out.println("다시 입력하세요.");
				System.out.print("정수 : ");
				num = sc.nextInt();
			} else if(num<3){
				System.out.println("다시 입력하세요.");
				System.out.print("정수 : ");
				num = sc.nextInt();
			} else {
				int[] intArr = new int[num];
				int a = 0;
				for(int i=0; i<num; i++) {
					if(i>num/2) {
						intArr[i] = --a;
					} else {
						intArr[i] = ++a;
					}
				}
				for(int s : intArr) {
					System.out.print(s + " ");
				}
				break;
			}
		}
	}
	
	public void practice05() {
		System.out.print("가위바위보 : ");
		String str = sc.nextLine();
		String[] choices = {"가위", "바위", "보"};
		Random random = new Random();
		int com_num = random.nextInt(choices.length);
		
		int game_count = 0;
		int win = 0;
		int draw = 0;
		int lose = 0;
		
		while(true) {
			if(str.equals("stop")) {
				System.out.println(game_count+"전 "+win+"승 "+draw+"무 "+lose+"패");
				break;
			} else if(str.equals("가위")) {
				if(choices[com_num].equals("가위")) {
					System.out.println("컴퓨터 : "+choices[com_num]);
					System.out.println("사용자 : "+str);
					game_count++;
					draw++;
					System.out.println("비겼습니다.");
					System.out.println();
					System.out.print("가위바위보 : ");
					str = sc.nextLine();
					random = new Random();
					com_num = random.nextInt(choices.length);
				} else if(choices[com_num].equals("바위")) {
					System.out.println("컴퓨터 : "+choices[com_num]);
					System.out.println("사용자 : "+str);
					game_count++;
					lose++;
					System.out.println("졌습니다 ㅠㅠ");
					System.out.println();
					System.out.print("가위바위보 : ");
					str = sc.nextLine();
					random = new Random();
					com_num = random.nextInt(choices.length);
				} else if(choices[com_num].equals("보")) {
					System.out.println("컴퓨터 : "+choices[com_num]);
					System.out.println("사용자 : "+str);
					game_count++;
					win++;
					System.out.println("이겼습니다 !");
					System.out.println();
					System.out.print("가위바위보 : ");
					str = sc.nextLine();
					random = new Random();
					com_num = random.nextInt(choices.length);
				}
			} else if(str.equals("바위")) {
				if(choices[com_num].equals("가위")) {
					System.out.println("컴퓨터 : "+choices[com_num]);
					System.out.println("사용자 : "+str);
					game_count++;
					win++;
					System.out.println("이겼습니다 !");
					System.out.println();
					System.out.print("가위바위보 : ");
					str = sc.nextLine();
					random = new Random();
					com_num = random.nextInt(choices.length);
				} else if(choices[com_num].equals("바위")) {
					System.out.println("컴퓨터 : "+choices[com_num]);
					System.out.println("사용자 : "+str);
					game_count++;
					draw++;
					System.out.println("비겼습니다.");
					System.out.println();
					System.out.print("가위바위보 : ");
					str = sc.nextLine();
					random = new Random();
					com_num = random.nextInt(choices.length);
				} else if(choices[com_num].equals("보")) {
					System.out.println("컴퓨터 : "+choices[com_num]);
					System.out.println("사용자 : "+str);
					game_count++;
					lose++;
					System.out.println("졌습니다 ㅠㅠ");
					System.out.println();
					System.out.print("가위바위보 : ");
					str = sc.nextLine();
					random = new Random();
					com_num = random.nextInt(choices.length);
				}
			} else if(str.equals("보")) {
				if(choices[com_num].equals("가위")) {
					System.out.println("컴퓨터 : "+choices[com_num]);
					System.out.println("사용자 : "+str);
					game_count++;
					lose++;
					System.out.println("졌습니다 ㅠㅠ");
					System.out.println();
					System.out.print("가위바위보 : ");
					str = sc.nextLine();
					random = new Random();
					com_num = random.nextInt(choices.length);
				} else if(choices[com_num].equals("바위")) {
					System.out.println("컴퓨터 : "+choices[com_num]);
					System.out.println("사용자 : "+str);
					game_count++;
					win++;
					System.out.println("이겼습니다 !");
					System.out.println();
					System.out.print("가위바위보 : ");
					str = sc.nextLine();
					random = new Random();
					com_num = random.nextInt(choices.length);
				} else if(choices[com_num].equals("보")) {
					System.out.println("컴퓨터 : "+choices[com_num]);
					System.out.println("사용자 : "+str);
					game_count++;
					draw++;
					System.out.println("비겼습니다.");
					System.out.println();
					System.out.print("가위바위보 : ");
					str = sc.nextLine();
					random = new Random();
					com_num = random.nextInt(choices.length);
				}
			} else {
				System.out.println("잘못 입력하셨습니다.");
				System.out.println();
				System.out.print("가위바위보 : ");
				str = sc.nextLine();
				random = new Random();
				com_num = random.nextInt(choices.length);
			}
		}
	}
}
