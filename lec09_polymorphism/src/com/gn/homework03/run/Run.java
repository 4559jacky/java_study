package com.gn.homework03.run;

import com.gn.homework03.model.vo.Car;
import com.gn.homework03.model.vo.ElectricEngine;
import com.gn.homework03.model.vo.GasolineEngine;

public class Run {
	public static void main(String[] args) {
		GasolineEngine ge = new GasolineEngine();
		ElectricEngine ee = new ElectricEngine();
		Car c1 = new Car(ge);
		Car c2 = new Car(ee);
		c1.startEngine();
		c2.startEngine();
	}
}
