package P10T04;

import javax.swing.JFrame;

public class P10T04Chat {
	public static void main(String[] args) {
		P10T04Ventana ventana = new P10T04Ventana();
		ventana.configuracionVentanaChat();
		ventana.escribirEnAreaDeTextoSuperior("Recibido: Mensaje 1 de prueba");
		ventana.escribirEnAreaDeTextoSuperior("Recibido: Mensaje 2 de prueba");
	}
}
