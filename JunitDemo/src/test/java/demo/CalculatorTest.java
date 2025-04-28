package demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
		int expected=30;
		Calculator c = new Calculator();
		int actual=c.add(10, 20);
		assertEquals(expected,actual);
	}
	@Test
	void testDiv() {
//		int expected=2;
//		int actual=new Calculator().div(10, 0);
		Calculator c = new Calculator();
		assertThrows(ArithmeticException.class, ()-> c.div(10,0));
	}

}
