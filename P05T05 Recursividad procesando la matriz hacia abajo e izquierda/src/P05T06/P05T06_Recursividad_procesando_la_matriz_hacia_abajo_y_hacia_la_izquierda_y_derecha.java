package P05T06;

import java.util.Scanner;

public class P05T06_Recursividad_procesando_la_matriz_hacia_abajo_y_hacia_la_izquierda_y_derecha {

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
		int numeroMinas = contarMinas(fila, columna);
		if(matrizMinas[fila][columna] == '#') {
			return;
		}
		if(numeroMinas == 0) {
			matrizMinas[fila][columna]='0';
			if(fila+1 < 6) {
				if(matrizMinas[fila+1][columna]=='.') procesarMatrizMinas(fila+1, columna);
			}
			if(columna+1 < 6) {
				if(matrizMinas[fila][columna+1]=='.') procesarMatrizMinas(fila, columna+1);
			}
		}
		else{
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
