package com.gn.practice07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Run {
	public static void main(String[] args) {
		File file = new File("C:\\test\\sub\\practice\\output.txt");
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			// 읽을 단위 지정
			char[] std = new char[3];
			// StringBuilder
			StringBuilder sb = new StringBuilder();
			int sum = 0;
			// while문
			while(true) {
				String data = br.readLine();
				if(data == null) break;
				sb.append(data+"\n");
				data = data.replace(" ", "");
				sum += data.length();
			}
			int idx = sb.lastIndexOf("\n");
			sb.deleteCharAt(idx);
			// 출력
			System.out.println(sb.toString());
			System.out.println("공백 제외 글자수 : "+sum);
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
				if(fr != null) fr.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
