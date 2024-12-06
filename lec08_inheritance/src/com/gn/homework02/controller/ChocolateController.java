package com.gn.homework02.controller;

import com.gn.homework02.model.vo.Chocolate;

public class ChocolateController {
	
	public String bakeChocolateCake(double flour,
			double cream, int cherry, int chip) {
//		c.setFlour(flour);
//		c.setCream(cream);
//		c.setCherry(cherry);
//		c.setChip(chip);
		Chocolate c = new Chocolate(flour, cream, cherry, chip);
		return c.toString();
	}
}
