package com.gn.practice03;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Run {
	public static void main(String[] args) {
		// 1. 디렉토리 생성
		File dir = new File("C:\\test\\sub");
		
		// 2. 파일 생성
		File file = new File(dir, "애국가1.dat");
		
		// 3. FileOutputStream 생성
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(file);
			// 4. 출력할 데이터 구성
			String song = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사"
					+ "\n우리나라 만세 무궁화 삼천리 화려강산"
					+ "\n대한사람 대한으로 길이 보전하세";
			byte[] str = song.getBytes();
			// 5. 출력
			out.write(str);
			System.out.println(file.length()+"크기의 "+file.getParent()+" 파일 생성");
			// 6. 플러싱
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(out != null) {
					out.close();
				}
			} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
