package com.gn.homework03.model.vo;

public class Car {
	private Engine engine;
	
	public Car(Engine engine) {
		this.engine = engine;
	}
	
	public void startEngine() {
		if(engine instanceof ElectricEngine) {
			((ElectricEngine)engine).start();
		} else if(engine instanceof GasolineEngine) {
			((GasolineEngine)engine).start();
		}
		
	}
}
