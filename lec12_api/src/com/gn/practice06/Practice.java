package com.gn.practice06;

public class Practice {
	public String newWords() {
		StringBuilder sb = new StringBuilder("WELCOME TO JAVA");
		sb.append("!");
		sb.insert(0, "<<");
		int idx = sb.indexOf(" ");
		sb.delete(idx, idx+3);
		sb.reverse();
		return sb.toString();
	}
	// 문장 끝에 느낌표
	// 문장 앞에 <<
	// 가운데 단어 제거
	// 마지막으로 모든 문자를 뒤집은 결과 리턴
	
}
