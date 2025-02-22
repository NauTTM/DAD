package P04T04;

public class mainP04T04 {
	static ventanaP04T04 ventana;
	public static void main(String[] args) {
		ventana = new ventanaP04T04();
		ventana.configuracionVentana();
	}
	
    public static void botonIzquierdo(int fila, int columna) {
    	if (matrizMinas[fila][columna] == '#'){
    			System.out.printf("Botón IZQUIERDO pulsado: ("+fila+ "," +columna+") hay una mina\n");
    	}
    	else
    		System.out.printf("Botón IZQUIERDO pulsado: ("+fila+ "," +columna+") esta vacio\n");
    		int i = contarMinas(fila, columna);
    		System.out.println("Hay " + i + " minas cerca");
    }

    public static void botonDerecho(int fila, int columna) {
        System.out.println("Se ha hecho clic DERECHO en la columna " + columna + " y en la fila " + fila);
        if(matrizDisparos[fila][columna] == '.') {
        	matrizDisparos[fila][columna] = '&';
        	ventana.ponerBandera(fila, columna);
        }
        else {
        	matrizDisparos[fila][columna] = '.';
        	ventana.ponerInicial(fila, columna);
        }
        mostrarMatriz();
    }
    
    private static final char[][] matrizMinas = {
            { '.', '.', '.', '.', '.', '.', '#' },
            { '#', '#', '.', '.', '.', '.', '#' },
            { '#', '.', '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '.', '.', '#' },
            { '.', '.', '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '.', '.', '.' }
        };
    private static final char[][] matrizDisparos= {
            { '.', '.', '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '.', '.', '.' }
        };
    
    public static void mostrarMatriz() { 
    	System.out.println("Matriz de Dsiparos:");
    		for (int fila = 0; fila < matrizDisparos.length; fila++) {
    			for (int columna = 0; columna < matrizDisparos.length; columna++) {
                    System.out.print(matrizDisparos[fila][columna] + " ");
                }
                System.out.println();
            }
        }
    public static int contarMinas(int fila, int columna){
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
}
