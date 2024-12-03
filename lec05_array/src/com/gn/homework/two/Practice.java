package com.gn.homework.two;

import java.util.Random;
import java.util.Scanner;

public class Practice {
	Scanner sc = new Scanner(System.in);
	public void practice01() {
		int[][] intArr = new int[4][4];
		int a = 1;
		for(int i=0; i<intArr.length; i++) {
			for(int j=0; j<intArr[i].length; j++) {
				intArr[i][j] = a++;
			}
		}
		for(int i=intArr.length-1; i>=0; i--) {
			for(int j=intArr[i].length-1; j>=0; j--) {
				System.out.print(intArr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void practice02() {
		int[][] intArr = new int[4][4];
		for(int i=0; i<intArr.length; i++) {
			for(int j=0; j<intArr[i].length; j++) {
				intArr[i][j] = (int)(Math.random()*10+1);
			}
		}
		for(int i=0; i<intArr.length; i++) {
			for(int j=0; j<intArr[i].length; j++) {
				System.out.print(intArr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void practice03() {
		System.out.print("행 : ");
		int haeng = sc.nextInt();
		while(true) {
			if(!(1<=haeng&&haeng<=10)) {
				System.out.println("반드시 1~10  사이의 정수를 입력해야 합니다.");
				System.out.print("행 : ");
				haeng = sc.nextInt();
			} else {
				break;
			}
		}
		System.out.print("열 : ");
		int yeol = sc.nextInt();
		while(true) {
			if(!(1<=yeol&&yeol<=10)) {
				System.out.println("반드시 1~10  사이의 정수를 입력해야 합니다.");
				System.out.print("열 : ");
				yeol = sc.nextInt();
			} else {
				break;
			}
		}
		char[][] intArr = new char[haeng][yeol];
		for(int i=0; i<intArr.length; i++) {
			for(int j=0; j<intArr[i].length; j++) {
				intArr[i][j] = (char)((int)(Math.random()*(90-65+1))+65);
			}
		}
		for(int i=0; i<intArr.length; i++) {
			for(int j=0; j<intArr[i].length; j++) {
				System.out.print(intArr[i][j] + " ");
			}
			System.out.println();
		}
	}
	public void practice04() {
		String[][] strArr 
		= new String[][] {{"이", "까", "왔", "앞", "힘"}, 
		{"차", "지", "습", "으", "냅"}, 
		{"원", "열", "니", "로", "시"}, 
		{"배", "심", "다", "좀", "다"}, 
		{"열", "히", "! ", "더", "!! "}};
		
		for(int i=0; i<strArr.length; i++) {
			for(int j=i+1; j<strArr[i].length; j++) {
				if(i!=j) {
					String str = strArr[i][j];
					strArr[i][j] = strArr[j][i];
					strArr[j][i] = str;
				}
			}
		}
		for(int i=0; i<strArr.length; i++) {
			for(int j=0; j<strArr[i].length; j++) {
				System.out.print(strArr[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
	public void practice05() {
		String[] attend = {"강건강", "남나나", "도대담", "류라라",
							"박보배", "송성실", "윤예의", "진재주",
							"문미미", "차천축", "피풍표", "홍하하"};
	}
	public void practice06() {
		
	}
	
}