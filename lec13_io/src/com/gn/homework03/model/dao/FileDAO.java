//package com.gn.homework03.model.dao;
//
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class FileDAO {
//	public boolean checkName(String title){ 
//		boolean result = false;
//		File file = new File(title);
//		if(file.exists()==true) {
//			result = true;
//		}
//		return result;
//	}
//	public void fileSave(String title, String text){
//		File dir = new File("C:\\test\\sub");
//		File file = new File(dir, title);
//		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
//			bw.write(text);
//		} catch(IOException e) {
//			e.printStackTrace();
//		}
//	} 
//	public StringBuilder fileOpen(String file){ 
//		
//	} 
//	public void fileEdit(String file, String s){ 
//		
//
//	} 
//}
