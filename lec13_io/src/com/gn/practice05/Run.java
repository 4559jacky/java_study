package com.gn.practice05;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Run {
	public static void main(String[] args) {
		File dir = new File("C:\\test\\sub");
		File file = new File(dir, "sample1.dat");
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			byte[] arr = new byte[(int)file.length()];
			byte[] stand = new byte[10];
			int idx = 0;
			while(true) {
				int data = fis.read(stand);
				if(data == -1) break;
				System.arraycopy(stand, 0, arr, idx, data);
				idx += data;
			}
			String str = new String(arr);
			System.out.println(str);
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) fis.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
