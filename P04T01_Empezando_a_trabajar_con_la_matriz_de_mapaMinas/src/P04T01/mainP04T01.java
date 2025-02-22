package P04T01;

public class mainP04T01 {
	public static void main(String[] args) {
		ventanaP04T01 ventana = new ventanaP04T01();
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
        matrizDisparos[fila][columna] = '&';
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
    public void mostrarMatriz() {
    	System.out.println(matrizDisparos);
    }
}
