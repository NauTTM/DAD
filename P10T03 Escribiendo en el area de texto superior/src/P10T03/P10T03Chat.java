package P10T03;

import javax.swing.JFrame;

public class P10T03Chat {
	public static void main(String[] args) {
		P10T03Ventana ventana = new P10T03Ventana();
		ventana.configuracionVentanaChat();
		ventana.escribirEnAreaDeTextoSuperior("Recibido: Mensaje 1 de prueba");
		ventana.escribirEnAreaDeTextoSuperior("Recibido: Mensaje 2 de prueba");
	}
}
