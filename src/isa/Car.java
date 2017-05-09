package isa;

public class Car {

	int id;
	String model;
	int capacity;
	
	public Car(int i, String model, int cap) {
		this.id=i;
		this.model=model;
		this.capacity=cap;
	}

	public Car(int d) {
		this.capacity=d;
	}

	public int getEngineCapacity()
	{
		return this.capacity;
	}
}
