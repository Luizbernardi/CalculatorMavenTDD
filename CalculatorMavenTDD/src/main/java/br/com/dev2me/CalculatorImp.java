package br.com.dev2me;

public class CalculatorImp implements Calculator {

	@Override
	public int sum(int a, int b) {
		return a + b;
	}

	@Override
	public int subtraction(int a, int b) {
		return a - b;
	}

	@Override
	public int multiplication(int a, int b) {
		return a * b;
	}

	@Override
	public int division(int a, int b) {
		return a / b;
	}

	@Override
	public boolean equalsIntegers(int a, int b) {
		return a == b;
	}

}
