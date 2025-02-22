package P05T01;

import java.util.Scanner;

public class P05t01 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			int numeroFactorial;
			System.out.println("Introduce el numero deseado: ");
			numeroFactorial = input.nextInt();
			int Factor = calculaFactorial(numeroFactorial);
			System.out.println("El factorial es: " + Factor);
		}
	}
	
	public static int calculaFactorial(int n) {
        
		int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
	}
	

}
