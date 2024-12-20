package com.gn.homework03.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	public boolean checkName(String title){ 
		boolean result = false;
		File dir = new File("C:\\test\\sub\\practice");
		if(!dir.exists()) {
			dir.mkdirs();
		}
		File file = new File(dir, title);
		if(file.exists()==true) {
			result = true;
		}
		return result;
	}
	public void fileSave(String title, String text){
		File dir = new File("C:\\test\\sub\\practice");
		File file = new File(dir, title);
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			bw.write(text);
			bw.flush();
		} catch(IOException e) {
			e.printStackTrace();
		}
	} 
	public StringBuilder fileOpen(String title){ 
		File dir = new File("C:\\test\\sub\\practice");
		File file = new File(dir, title);
		StringBuilder sb = new StringBuilder();
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
			while(true) {
				String data = br.readLine();
				if(data == null) break;
				sb.append(data+"\n");
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		int idx = sb.lastIndexOf("\n");
		sb.deleteCharAt(idx);
		return sb;
	} 
	public void fileEdit(String title, String text){ 
		File dir = new File("C:\\test\\sub\\practice");
		File file = new File(dir, title);
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
			bw.write(text);
			bw.flush();
		} catch(IOException e) {
			e.printStackTrace();
		}
	} 
}
