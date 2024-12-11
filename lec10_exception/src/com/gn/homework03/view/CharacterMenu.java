package com.gn.homework03.view;

import java.util.Scanner;

import com.gn.homework03.controller.CharacterController;
import com.gn.homework03.exception.CharCheckException;

public class CharacterMenu {
	public void menu() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		CharacterController cc = new CharacterController();
		
		try {
			int a = cc.countAlpha(str);
			System.out.println(str+"에 포함된 영문자 개수 : "+a);
		} catch(CharCheckException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
}
