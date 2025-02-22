package P03T07;

public class mainP03T07 {
	public static void main(String[] args) {
		ventanaP03T07 ventana = new ventanaP03T07();
		ventana.configuracionVentana();
	}
	
    public static void botonIzquierdo(int fila, int columna) {
        System.out.println("Se ha hecho clic IZQUIERDO en la columna " + columna + " y en la fila " + fila);
    }

    public static void botonDerecho(int fila, int columna) {
        System.out.println("Se ha hecho clic DERECHO en la columna " + columna + " y en la fila " + fila);
    }
}
