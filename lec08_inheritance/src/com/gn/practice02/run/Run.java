package com.gn.practice02.run;

import com.gn.practice02.model.vo.Appliance;
import com.gn.practice02.model.vo.Refrigerator;
import com.gn.practice02.model.vo.WashingMachine;

public class Run {

	public static void main(String[] args) {
		Appliance app = new Appliance();
		app.turnOn();
		WashingMachine wash = new WashingMachine();
		wash.turnOn();
		Refrigerator ref = new Refrigerator();
		ref.turnOn();
	}
}
