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
		
//		for(int i=0; i<strArr.length; i++) {
//			for(int j=i+1; j<strArr[i].length; j++) {
//				if(i!=j) {
//					String str = strArr[i][j];
//					strArr[i][j] = strArr[j][i];
//					strArr[j][i] = str;
//				}
//			}
//		}
		
		for(int i=0; i<strArr.length; i++) {
			for(int j=0; j<strArr[i].length; j++) {
				System.out.print(strArr[j][i]+ " ");
			}
			System.out.println();
		}
	}
//	public void practice05() {
//		String[] attend = {"강건강", "남나나", "도대담", "류라라",
//							"문미미", "박보배", "송성실", "윤예의",
//							"진재주", "차천축", "피풍표", "홍하하"};
//		String[][] seat1 = new String[3][2];
//		String[][] seat2 = new String[3][2];
//		int a = 0;
//		for(int i=0; i<seat1.length; i++) {
//			for(int j=0; j<seat1[i].length; j++) {
//				seat1[i][j] = attend[a++];
//			}
//		}
//		for(int i=0; i<seat2.length; i++) {
//			for(int j=0; j<seat2[i].length; j++) {
//				seat2[i][j] = attend[a++];
//			}
//		}
//		System.out.println("== 1분단 ==");
//		for(int i=0; i<seat1.length; i++) {
//			for(int j=0; j<seat1[i].length; j++) {
//				System.out.print(seat1[i][j]+" ");
//			}
//			System.out.println();
//		}
//		System.out.println("== 2분단 ==");
//		for(int i=0; i<seat2.length; i++) {
//			for(int j=0; j<seat2[i].length; j++) {
//				System.out.print(seat2[i][j]+" ");
//			}
//			System.out.println();
//		}
//	}
	public void practice05() {
		String[] attend = {"강건강", "남나나", "도대담", "류라라",
							"문미미", "박보배", "송성실", "윤예의",
							"진재주", "차천축", "피풍표", "홍하하"};
		String[][] area1 = new String[3][2];
		String[][] area2 = new String[3][2];
		int a = 0;
		for(int i=0; i<area1.length; i++) {
			for(int j=0; j<area1[i].length; j++) {
				area1[i][j] = attend[a++];
			}
		}
		for(int i=0; i<area2.length; i++) {
			for(int j=0; j<area2[i].length; j++) {
				area2[i][j] = attend[a++];
			}
		}
		System.out.println("== 1분단 ==");
		for(int i=0; i<area1.length; i++) {
			for(int j=0; j<area1[i].length; j++) {
				System.out.print(area1[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("== 2분단 ==");
		for(int i=0; i<area2.length; i++) {
			for(int j=0; j<area2[i].length; j++) {
				System.out.print(area2[i][j]+"  ");
			}
			System.out.println();
		}
	}
	public void practice06() {
		String[] attend = {"강건강", "남나나", "도대담", "류라라",
							"문미미", "박보배", "송성실", "윤예의",
							"진재주", "차천축", "피풍표", "홍하하"};
		String[][] seat1 = new String[3][2];
		String[][] seat2 = new String[3][2];
		int a = 0;
		for(int i=0; i<seat1.length; i++) {
		for(int j=0; j<seat1[i].length; j++) {
			seat1[i][j] = attend[a++];
		}
		}
		for(int i=0; i<seat2.length; i++) {
		for(int j=0; j<seat2[i].length; j++) {
			seat2[i][j] = attend[a++];
		}
		}
		System.out.println("== 1분단 ==");
		for(int i=0; i<seat1.length; i++) {
		for(int j=0; j<seat1[i].length; j++) {
			System.out.print(seat1[i][j]+" ");
		}
		System.out.println();
		}
		System.out.println("== 2분단 ==");
		for(int i=0; i<seat2.length; i++) {
		for(int j=0; j<seat2[i].length; j++) {
			System.out.print(seat2[i][j]+" ");
		}
		System.out.println();
		}
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.nextLine();
		String[][][] allSeat = {{{"강건강", "남나나"},
									{"도대담", "류라라"},
									{"문미미", "박보배"}},
									{{"송성실", "윤예의"},
									{"진재주", "차천축"},
									{"피풍표", "홍하하"}}};
		for(int x=0; x<allSeat.length; x++) {
			for(int y=0; y<allSeat[x].length; y++) {
				for(int z=0; z<allSeat[x][y].length; z++) {
					if(allSeat[x][y][z].equals(name)) {
						String str1 = "";
						String str2 = "";
						if(y==0) {
							str1 = "첫";
						} else if(y==1) {
							str1 = "두";
						} else {
							str1 = "세";
						}
						if(z==0) {
							str2 = "왼쪽";
						} else {
							str2 = "오른쪽";
						}
						System.out.println("검색하신"+name+" 학생은 "
											+(x+1)+"분단 "+str1+" 번째 줄 "
											+str2+"에 있습니다.");
					}
				}
			}
		}
	}
}