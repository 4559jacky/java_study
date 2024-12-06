package com.gn.homework02.controller;

import com.gn.homework02.model.vo.GreenTea;

public class GreenTeaController {
	
	public String bakeGreenTeaCake(double flour,
			double cream, double powder, int cheese) {
//		return "밀가루 : "+flour+"(g)\n"+
//				"크림 : "+cream+"(g)\n"+
//				"녹차 파우더 : "+powder+"(g)\n"+
//				"치즈 큐브 : "+cheese+"(개)\n"+
//				"녹차 케이크가 완성되었습니다.";
//		gt.setFlour(flour);
//		gt.setCream(cream);
//		gt.setPowder(powder);
//		gt.setCheese(cheese);
		GreenTea gt = new GreenTea(flour, cream, powder, cheese);
		return gt.toString();
	}
}
