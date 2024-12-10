package com.gn.homework03.controller;

import com.gn.homework03.exception.CharCheckException;

public class CharacterController {
	public CharacterController() {}
	
	public int countAlpha(String s) throws CharCheckException {
		if(s.contains(" ")) {
			throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
		} else {
			char[] c = s.toCharArray();
			String answer = "";
			for(int i=0; i<c.length; i++) {
				if((65<=c[i]&&c[i]<=90)||(97<=c[i]&&c[i]<=122)) {
					answer += c[i];
				}
			}
			return answer.length();
		}
	}
}
