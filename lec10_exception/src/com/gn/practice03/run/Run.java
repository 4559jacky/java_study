package com.gn.practice03.run;

import java.util.Scanner;

import com.gn.practice03.controller.LoginManager;
import com.gn.practice03.exception.InvalidCredentialsException;

public class Run {
	public static void main(String[] args) {
//		
		LoginManager lm = new LoginManager();
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();
		try {
			lm.login(id, pwd);
		} catch(InvalidCredentialsException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
		
	}
}
