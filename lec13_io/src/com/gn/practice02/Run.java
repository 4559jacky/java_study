package com.gn.practice02;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class Run {
	public static void main(String[] args) {
		
		File dir = new File("C:\\test\\sub");
		String uuid = UUID.randomUUID().toString();
		uuid = uuid.replace("-", "");
		File file = new File(dir, uuid+".txt");
		try {
			if(!file.exists()) {
				file.createNewFile();
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
