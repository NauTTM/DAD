package P04T02;

public class mainP04T02 {
	public static void main(String[] args) {
		ventanaP04T02 ventana = new ventanaP04T02();
		ventana.configuracionVentana();
	}
	
    public static void botonIzquierdo(int fila, int columna) {
    	if (matrizMinas[fila][columna] == '#'){
    			System.out.printf("Botón IZQUIERDO pulsado: ("+fila+ "," +columna+") hay una mina\n");
    	}
    	else
    		System.out.printf("Botón IZQUIERDO pulsado: ("+fila+ "," +columna+") esta vacio\n");
    }

    public static void botonDerecho(int fila, int columna) {
        System.out.println("Se ha hecho clic DERECHO en la columna " + columna + " y en la fila " + fila);
        if(matrizDisparos[fila][columna] == '.') {
        	matrizDisparos[fila][columna] = '&';
        }
        else {
        	matrizDisparos[fila][columna] = '.';
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
    			for (int columna = 0; columna < matrizDisparos[0].length; columna++) {
                    System.out.print(matrizDisparos[fila][columna] + " ");
                }
                System.out.println();
            }
        }
}
