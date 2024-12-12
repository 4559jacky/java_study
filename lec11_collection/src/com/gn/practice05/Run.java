package com.gn.practice05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Run {
	public static void main(String[] args) {
		Set<Song> songSet1 = new HashSet<>();
		Set<Song> songSet2 = new HashSet<>();
		
		songSet1.add(new Song("APT.", "로제"));
		songSet1.add(new Song("Whiplash", "에스파"));
		songSet1.add(new Song("POWER", "G-DRAGON"));
		songSet2.add(new Song("Whiplash", "에스파"));
		songSet2.add(new Song("HAPPY", "DAY6"));
		songSet2.add(new Song("해삐", "DAY6"));
		
		
		
		System.out.println(songSet1);
		System.out.println(songSet2);
		
//		Set<Integer> num = new HashSet<>();
//		num.add(2);
//		num.add(3);
//		num.add(1);
//		num.add(5);
//		num.add(4);
//		System.out.println(num);
//		List<Integer> num1 = new ArrayList<>();
//		num1.add(2);
//		num1.add(3);
//		num1.add(1);
//		num1.add(5);
//		num1.add(4);
//		System.out.println(num1);
		
		
	}
}
