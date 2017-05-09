package isa;

public class Car {

	int id;
	String model;
	double capacity;
	
	public Car(int i, String model, double cap) {
		this.id=i;
		this.model=model;
		this.capacity=cap;
	}

	public double getEngineCapacity()
	{
		return this.capacity;
	}
}
