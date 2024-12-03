package com.gn.practice;

public class Practice06 {
	public static void main(String[] args) {
		// "(0,0)""(0,1)""(0,2)"
		// "(1,0)""(1,1)""(1,2)"
		String[][] arr = new String[2][3];
//		arr[0][0] = "(0,0)"; 
//		arr[0][1] = "(0,1)"; 
//		arr[0][2] = "(0,2)"; 
//		arr[1][0] = "(1,0)"; 
//		arr[1][1] = "(1,1)"; 
//		arr[1][2] = "(1,2)"; 
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = "(" + i + "," + j + ")";
				System.out.print(arr[i][j]);
			}
			if(i == arr.length-1) {
				break;
			}
			System.out.print("\n");
		}
	}
}
