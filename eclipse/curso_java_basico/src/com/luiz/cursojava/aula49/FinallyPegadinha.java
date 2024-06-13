package com.luiz.cursojava.aula49;

public class FinallyPegadinha {

	public static void main(String[] args) {

		int[] numeros = {4, 6, 16, 32, 64, 128};
		int[] denom = {2, 0, 4, 8, 0};
		
		for(int i =0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + " / " + denom[i] + " = "	+ (numeros[i] / denom[i]));
			} catch(ArithmeticException e) {
				System.out.println("Erro ao dividir por 0");
				System.exit(0);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Posição do array inválida");
				System.exit(0);
			} finally {
				System.out.println("Essa linha é impressa sempre apos o try e o catch");
				System.out.println("");
			}
		
		}

	}
	
}
