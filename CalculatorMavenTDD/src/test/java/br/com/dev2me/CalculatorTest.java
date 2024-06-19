package br.com.dev2me;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculatorTest {
	@Test
	public void shouldCalculatorSum() throws Exception {
		int a = 2;
		int b = 2;
		int sum = 0;

		Calculator calc = new CalculatorImp();
		sum = calc.sum(a, b);

		assertEquals(sum, 4);

	}
	@Test
	public void shouldCalculatorSub() throws Exception {
		int a = 4;
		int b = 3;
		int sub = 0;
		
		Calculator calc = new CalculatorImp();
		
		sub = calc.subtraction(a, b);
		
		assertEquals(sub, 1);
	}
	@Test
	public void shouldCalculatorMult() throws Exception {
		int a = 4;
		int b = 2;
		int mult = 0;
		
		Calculator calc = new CalculatorImp();
		
		mult = calc.multiplication(a, b);
		
		assertEquals(mult, 8);
	}
	@Test
	public void shouldCalculatorDiv() throws Exception {
		int a = 4;
		int b = 2;
		int div = 0;
		
		Calculator calc = new CalculatorImp();
		
		div = calc.division(a, b);
		
		assertEquals(div, 2);
	}
	@Test 
	public void shouldCalculatorEquals() throws Exception {
		int a =  2;
		int b =  2;
		
		boolean equals = false;
		Calculator calc = new CalculatorImp();
		
		equals = calc.equalsIntegers(a, b);
		
		assertTrue(equals);
	}

}
