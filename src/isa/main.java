package isa;

public class main {

	public static void main(String[] args) {
		Car car1 = new Car(1,"Ford",15);
		Car car2 = new Car(2,"Maruti",25);
		Car car4 = new Car(25);
		
		System.out.println(car1.getEngineCapacity());
		System.out.println(car2.getEngineCapacity());
	}

}
