package com.gn.practice;

import java.util.Scanner;

public class Practice_01 {
	public static void main(String args[]) {
	    int[] coin = { 500, 100, 50, 10, 5, 1 };
	    int[] cnt = { 5, 5, 5, 5, 5, 5 };
	    Scanner scan = new Scanner(System.in);
	    int money = scan.nextInt();
	    int sum = 0;
	    for(int i=0; i<coin.length; i++) {
	    	sum += coin[i]*cnt[i];
	    }
	    if(money>sum) {
	    	System.out.println("동전이 부족합니다.");
	    } else if(money<=0) {
	    	System.out.println("잘못된 값을 입력하였습니다.");
	    } else {
	    	int count = 0;
	    	for(int i=0; i<coin.length; i++) {
	    		count = 0;
	    		if(money/coin[i]!=0) {
	    			count = money/coin[i];
	    			int rest = 0;
	    			if(count>=6) {
	    				rest = count-5;
	    				count = 5;
	    			}
	    			money %= coin[i];
	    			money += coin[i]*rest;
	    		}
	    		System.out.println(coin[i]+"원:"+count);
	    		cnt[i] -= count;
	    	}
	    	for(int i=0; i<cnt.length; i++) {
		    	System.out.println("남은 동전 "+coin[i]+"원:"+cnt[i]+"개");
		    }
	    }
	    
	 }
}
