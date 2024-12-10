package com.gn.homework04.controller;

import com.gn.homework04.exception.NumRangeException;

public class NumberController {
	public NumberController() {}
	
	public boolean checkDouble(int num1, int num2) throws NumRangeException {
		if((1<=num1&&num1<=100)&&(1<=num2&&num2<=100)) {
			if(num1%num2==0) {
				return true;
			} else {
				return false;
			}
		} else {
			throw new NumRangeException("1부터 100사이의 값이 아닙니다.");
		}
	}
}
