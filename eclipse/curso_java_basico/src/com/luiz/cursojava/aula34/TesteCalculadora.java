package com.luiz.cursojava.aula34;

public class TesteCalculadora {
	
	static int resultSoma;

	public static void main(String[] args) {

		resultSoma = MinhaCalculadora.soma(1, 2);
		
		// MinhaCalculadora calc = new Calculadora();
		
		soma2Valores(1, 2);

	}
	
	static int soma2Valores(int num1, int num2) {
		return MinhaCalculadora.soma(num1, num2)
	}

}
