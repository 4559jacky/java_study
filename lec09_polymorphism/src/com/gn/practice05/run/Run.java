package com.gn.practice05.run;

import com.gn.practice05.model.vo.Car;
import com.gn.practice05.model.vo.Machine;
import com.gn.practice05.model.vo.Vehicle;

public class Run {
	public static void main(String[] args) {
		Machine car1 = new Car();
		Vehicle car2 = new Car();
		car1.turnOn();
		car1.turnOff();
		car2.speedUp();
		car2.speedDown();
	}
}
