package com.gn.homework02;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Practice {
	
	public void method1(File dir) {
		File file = new File(dir, "나비야1.dat");
		try(FileInputStream fis = new FileInputStream(file)) {
			int idx = 0;
			int data = 0;
			// (1) 파일 크기만한 비어있는 배열
			byte[] arr = new byte[(int)file.length()];
			while(true) {
				data = fis.read();
				if(data == -1) break;
				arr[idx++] = (byte)data;
			}
			String str = new String(arr);
			System.out.println(str);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void method2(File dir) {
		File file = new File(dir, "나비야2.dat");
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))) {
			int idx = 0;
			int data = 0;
			byte[] arr = new byte[(int)file.length()];
			byte[] std = new byte[5];
			while(true) {
				data = bis.read(std);
				if(data == -1) break;
				System.arraycopy(std, 0, arr, idx, data);
				idx += data;
			}
			String str = new String(arr);
			System.out.println(str);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
