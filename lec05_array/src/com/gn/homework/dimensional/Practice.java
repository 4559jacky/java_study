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
	
	public void practice04() {
		int[] lotto = new int[6];
		int n = 0;
		int a = 0;
		while(a<lotto.length) {
			n = (int)(Math.random() * 45) + 1;
			boolean isDuplicate = false;
			for (int i = 0; i < a; i++) {
			    if (lotto[i] == n) {
			        isDuplicate = true;
			        break;
			    }
			}
			if (!isDuplicate) {
			    lotto[a++] = n;
			}
		}
		for(int i=0; i<lotto.length-1; i++) {
			for(int j=i+1; j<lotto.length; j++) {
				if(lotto[i]>lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		for(int s : lotto) {
			System.out.print(s+" ");
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
	
	public void practice06() {
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt(); // 2
		String[] strArr = new String[size]; // 크기 : 2
		String[] strArr1 = {};
		String[] strArr2 = {};
		int a =0;
		String str = sc.nextLine();
		while(a<size) { // a가 0, 1 일때(size는 2니까)
			System.out.print((a+1)+"번째 문자열 : "); //1번째, 2번째
			str = sc.nextLine();
			strArr[a++] = str; //인덱스 0, 1 값 할당
		}
		System.out.print("더 값을 입력하시곘습니까?(Y/N) : ");
		String answer = sc.nextLine();
		while(true) {
			if(answer.equals("Y")||answer.equals("y")) {
				System.out.print("더 입력하고 싶은 개수 : ");
				a = size; //
				size += sc.nextInt();
				strArr1 = new String[size];
				if(strArr2.length==0) {
					for(int i=0; i<strArr.length; i++) {
						strArr1[i] = strArr[i];
					}
				} else {
					for(int i=0; i<strArr2.length; i++) {
						strArr1[i] = strArr2[i];
					}
				}
				str = sc.nextLine();
				while(a<size) { // a가 2, 3 일때(size는 2니까)
					System.out.print((a+1)+"번째 문자열 : "); //3번째, 4번째
					str = sc.nextLine();
					strArr1[a++] = str; //인덱스 2, 3 값 할당
				}
				strArr2 = new String[strArr1.length];
				for(int i=0; i<strArr1.length; i++) {
					strArr2[i] = strArr1[i];
				}
				System.out.print("더 값을 입력하시곘습니까?(Y/N) : ");
				answer = sc.nextLine();
			} else if(answer.equals("N")||answer.equals("n")) {
				for(String s : strArr1) {
					System.out.println(s);
				}
				sc.close();
				break;
			} else {
				System.out.println("입력할 수 없는 값입니다.");
				sc.close();
				break;
			}
		}
	}
	
}
