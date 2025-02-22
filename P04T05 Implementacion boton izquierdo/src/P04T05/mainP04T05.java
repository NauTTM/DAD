package P04T05;


public class mainP04T05 {
	static ventanaP04T05 ventana;
	public static void main(String[] args) {
		ventana = new ventanaP04T05();
		ventana.configuracionVentana();
	}
	
    public static void botonIzquierdo(int fila, int columna) {
    	if (matrizMinas[fila][columna] == '#'){
    			System.out.printf("Botón IZQUIERDO pulsado: ("+fila+ "," +columna+") hay una mina\n");
    	}
    	if (matrizMinas[fila][columna] == '.') {
    		System.out.printf("Botón IZQUIERDO pulsado: ("+fila+ "," +columna+") esta vacio\n");
    		int i = contarMinas(fila, columna);
    		System.out.print("Hay " + i + " minas cerca\n");
    		ventana.ponerImagenNumero(fila, columna, i);
    		matrizMinas[fila][columna] = (char) i ;
    		mostrarMatriz();
    		mostrarMatrizMinas();
    		//verificandoFinalExitoso();
    	}
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
    	System.out.println("Matriz de Disparos:");
    		for (int fila = 0; fila < matrizDisparos.length; fila++) {
    			for (int columna = 0; columna < matrizDisparos.length; columna++) {
                    System.out.print(matrizDisparos[fila][columna] + " ");
                }
                System.out.println();
            }
        }
    public static void mostrarMatrizMinas() { 
    	System.out.println("Matriz de minas:");
    		for (int fila = 0; fila < matrizMinas.length; fila++) {
    			for (int columna = 0; columna < matrizMinas.length; columna++) {
                    System.out.print(matrizMinas[fila][columna] + " ");
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
    /*public static void verificandoFinalExitoso() {
    	for(int fila = 0; fila < matrizMinas[0].length; fila++) {
    		for(int columna = 0; fila < matrizMinas[0].length; columna++) {
    			if(matrizMinas[fila][columna] == '#' && matrizDisparos[fila][columna] == '&') {
    				JOptionPane.showMessageDialog(null, "Enhorabuena, qué listo eres!!!!!!!!");
    				System.exit(0);
    			}
    		}
    	}
    }*/
}
