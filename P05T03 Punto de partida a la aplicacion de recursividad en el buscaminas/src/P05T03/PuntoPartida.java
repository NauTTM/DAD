package P05T03;

import java.util.Scanner;

public class PuntoPartida {

	public static void main(String[] args) {
		int numeroFila;
		int numeroColumna;
		try (Scanner input = new Scanner (System.in)) {
			System.out.println("Introduzca un numero de fila (0-6): ");
			numeroFila = input.nextInt();
			System.out.println("Introduzca un numero de columna (0-6): ");
			numeroColumna = input.nextInt();
		}
		mostrarArray(matrizMinas);
		procesarMatrizMinas(numeroFila, numeroColumna);
		mostrarArray(matrizMinas);
	}
    public static void mostrarArray(char[][] matriz) { 
    	System.out.println("Matriz de Minas:");
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int columna = 0; columna < matriz.length; columna++) {
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println();
        }
    
    }
	public static int contarMinas(int fila, int columna) {
    	int x = 0;
        for (int i = fila - 1; i <= fila + 1; i++) {
            for (int j = columna - 1; j <= columna + 1; j++) {
                if (i >= 0 && i < matrizMinas.length && j >= 0 && j < matrizMinas[0].length) {
                    if (matrizMinas[i][j] == '#') {
                        x++;
                    }
                }
            }
        }
		return x;
	}
	
	public static void procesarMatrizMinas(int fila, int columna) {
		if(matrizMinas[fila][columna] == '#') {
			return;
		}
		else {
			int i = contarMinas(fila, columna);
			char caracter = Integer.toString(i).charAt(0);
			matrizMinas[fila][columna] = caracter;
		}
	}
	
    private static final char[][] matrizMinas = {
            { '.', '.', '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '#', '.', '.' },
            { '.', '.', '#', '#', '#', '.', '.' },
            { '.', '.', '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '.', '.', '.' }
        };

}
