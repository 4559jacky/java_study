package com.gn.homework04.run;

import com.gn.homework04.model.vo.GalaxyS24;
import com.gn.homework04.model.vo.Iphone15;
import com.gn.homework04.model.vo.SmartPhone;

public class Run {
	public static void main(String[] args) {
		SmartPhone[] sp = new SmartPhone[2];
		sp[0] = new GalaxyS24();
		sp[1] = new Iphone15();
		for(SmartPhone s : sp) {
			s.printMaker();
			s.makeCall();
			s.takeCall();
			s.touch();
			s.charge();
			s.picture();
			System.out.println();
		}
	}
}
