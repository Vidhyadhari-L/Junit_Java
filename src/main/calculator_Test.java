package main;

import org.junit.jupiter.api.Test;

public class calculator_Test {
	calculator obj=new calculator();
	@Test
	public void addTest() {
		obj.add(10, 20);
		
	}
	@Test
public void subTest() {
		obj.sub(20, 30);
		
	}
	@Test
public void prdtTest() {
		obj.prdt(5, 3);
	
}

}
