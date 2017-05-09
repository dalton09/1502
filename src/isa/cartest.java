package isa;

import static org.junit.Assert.*;

import org.junit.Test;

public class cartest {
	
	@Test
	public void test() {
		Car car3=new Car(20);
		assertEquals(20,car3.getEngineCapacity());
		
	}

}
