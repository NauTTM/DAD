package Suma;
import java.util.Scanner;

public class Suma {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			int numero1;
			int numero2;
			int suma;
			System.out.print("Enter first integer: " );
			numero1 = input.nextInt();
			
			System.out.print("Enter second integer: " );
			numero2 = input.nextInt();
			
			suma = numero1 + numero2;
			
			System.out.printf("Sum is %d\n", suma);
		}
	}
}
