package com.gn.study.capsule;

import com.gn.study.capsule.closed.Account2;
import com.gn.study.capsule.open.Account1;

public class Run {
	public static void main(String[] args) {
		Student s = new Student(25);
//		System.out.println(s.studentNo);
		// setter
//		s.setStudentNo(15);
		// getter
		int num = s.getStudentNo();
		System.out.println(num);
		
		System.out.println(s.getStudentNo());
		
		System.out.println("===============뱅크================");
		// 캡슐화(X)
		Account1 a1 = new Account1("김철수", 2000);
		a1.balance -= 5000;
		System.out.println(a1.balance);
		
		Account2 a2 = new Account2("김철수", 2000);
//		a2.balance -= 5000;
//		System.out.println(a2.balance);
		a2.setBalance(a2.getBalance()-5000);
		System.out.println(a2.getBalance());
//		String user = a2.getUser();
//		System.out.println(user);
		
		
		
	}
}
