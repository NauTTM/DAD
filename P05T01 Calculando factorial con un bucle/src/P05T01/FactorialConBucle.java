package P05T01;

import java.util.Scanner;

public class FactorialConBucle {
	public void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			int numeroFactorial;
			System.out.println("Introduce el numero deseado: ");
			numeroFactorial = input.nextInt();
			int Factor = calculaFactorial(numeroFactorial);
			System.out.println("El factorial es: " + Factor);
		}
	}
	
	public int calculaFactorial(int i) {
		int factorial = 0;
		for(int x = i; x >0; x--) {
			factorial = x*(x-1);
		}
		return factorial;
	}
	
}
