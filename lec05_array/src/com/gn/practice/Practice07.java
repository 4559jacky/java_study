package com.gn.practice;

import java.util.*;

public class Practice07 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("입력 : ");
	    String str1 = scan.nextLine();
	    // "aabbbddff"
	    // "bbbddffaa"
	    int count = 0;
	    String str2 = str1;
	    char[] arr = str2.toCharArray();
	    Arrays.sort(arr);
	    str2 = new String(arr);
	    int nu = 0;
	    for(int i=0; i<arr.length; i++) {
	    	if(!(97<=(int)arr[i]&&(int)arr[i]<=122)||arr[i]==' ') {
	    		nu++;
	    	}
	    }
	    
	    if(nu==0) {
	    	while(true) {
		    	if (str2.isEmpty()) {
		            break; // str2가 빈 문자열이면 루프 종료
		        }
		    	count = 0;	    	
		    	char c = str2.charAt(0); // b
		    	char[] charArr = str2.toCharArray();
		    	// ['a', 'a', 'b', 'b', 'b', 'd', 'd', 'f', 'f']
		    	// ['b', 'b', 'b', 'd', 'd', 'f', 'f', 'a', 'a']
		    	str2 = "";
		    	for(int i=0; i<charArr.length; i++) {
                    if(c==charArr[i]) {
                        count++;
                        continue;
                    }
                    str2 += charArr[i];
			    }
		    	System.out.println(c+":"+count+"개");
		    }
	    }
    }
}
