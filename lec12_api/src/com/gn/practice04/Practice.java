package com.gn.practice04;

public class Practice {
	//Run에서 코드를 실행했을 때, 출력 예시와 같은 결과가 도출될 수 있도록 Practice 클래스에 메소드를 추가하세요.
	//출력 예시 : 화이팅!
	public String deleteBlank(String str) {
		str = str.trim();
		str = str.replace(" ", "");
		return str;
	}

}
