package com.gn.practice;

import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String str1 = scan.nextLine();
	    // "aabbbddff
	    int count = 0;
	    String str2 = str1;
	    char[] arr = str2.toCharArray();
	    while(true) {
	    	if (str2.isEmpty()) {
	            break; // str2가 빈 문자열이면 루프 종료
	        }
	    	count = 0;	    	
	    	char c = str2.charAt(0); // a
	    	if(!Character.isLowerCase(c)) {
	    		break;
	    	}
	    	char[] charArr = str2.toCharArray();
	    	// ['a', 'a', 'b', 'b', 'b', 'd', 'd', 'f', 'f']
	    	str2 = "";
	    	for(int i=0; i<charArr.length; i++) {
	    		if(Character.isLowerCase(c)) {
	    			if(c==charArr[i]) {
			            count++;
			            continue;
			        }
			        str2 += charArr[i];
		    	} else {
		    		break;
		    	}
		    }
	    		System.out.println(c+":"+count+"개");
	    }
	}

}
