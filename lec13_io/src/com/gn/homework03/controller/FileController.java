package com.gn.homework03.controller;

import com.gn.homework03.model.dao.FileDAO;

public class FileController {
	
	private FileDAO fd = new FileDAO();
	
	public boolean checkName(String title){
		return fd.checkName(title);
	} 
	public void fileSave(String title, StringBuilder sb){
		String text = sb.toString();
		fd.fileSave(title, text);
	} 
	public StringBuilder fileOpen(String title){
		return fd.fileOpen(title);
	} 
	public void fileEdit(String title, StringBuilder sb){
		String text = sb.toString();
		fd.fileEdit(title, text);
	} 
}
