package com.gn.practice03.exception;

public class InvalidCredentialsException extends Exception {
	// 기본 생성자
	public InvalidCredentialsException() {}
	// 매개변수 생성자
	public InvalidCredentialsException(String msg) {
		super(msg);
	}
}
