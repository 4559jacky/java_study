package com.gn.practice09.run;

import java.util.HashMap;
import java.util.Map;

import com.gn.practice09.model.vo.Information;

public class Run {
	public static void main(String[] args) {
		Map<String, Information> employer = new HashMap<>();
		employer.put("John", new Information("123-456-7890", 3800000));
		employer.put("Emma", new Information("987-654-3210", 2300000));
		employer.put("Tom", new Information("555-123-4567", 4600000));
		System.out.println("변경전 : "+employer);
//		employer.put("John", new Information("123-456-7890", 4100000));
		employer.get("John").setSalary(4100000);
		System.out.println("변경후 : "+employer);
		// Emma가 전화번호를 바꿨어요. -> Emma 정보 출력
		// 111-111-1111
//		===== Emma의 정보 =====
//		전화번호 : 111-1111-1111
//		월급 : 2300000
		employer.get("Emma").setPhone("111-111-1111");
		System.out.println("===== Emma의 정보 =====");
		System.out.println("전화번호 : "+employer.get("Emma").getPhone());
		System.out.println("월급 : "+employer.get("Emma").getSalary());
		
		
	}
}
