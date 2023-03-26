package object_creation;

public class Car {
	
	//Characteristic
	
	String model;
	int price;
	String color;
	String type;
	int speed;
	
	//Behaviour
	
	public void start() {
		System.out.println("Engine is started");
		
	}
	
	public void stop() {
		System.out.println("engine is stopped");
	}
	
	public void Accelerate() {
		
	}
	
	public void carSpeedMax(int maxSpeed) {
		System.out.println("Max Speed is " + maxSpeed);
	}
	
	public void carSpeedMin(int minSpeed) {
		System.out.println("minimum Speed is " + minSpeed);
	}

}
