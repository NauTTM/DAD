package P05T02;

import java.util.Scanner;

public class P05T02 {

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
        if (n == 0) {
        	return 1;
        }
        else {
		return n * calculaFactorial(n-1);
        }
	}
	

}
