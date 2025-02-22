package P10T06;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.JOptionPane;

public class PACuadrosDialogo {
	public static void main( String[] args ) throws IOException {
		try {
			int puertoE = 2000;
			int puertoD = 3000;
			DatagramSocket SocketPA = new DatagramSocket(puertoE);
			P10T06Ventana ventana = new P10T06Ventana();
			String nombre = JOptionPane.showInputDialog("Introduzca su nombre:");
			ventana.configuracionVentanaChat();
			ventana.setTitle("Chat de "+nombre);
			
			while(true){
				String mensaje = JOptionPane.showInputDialog("Introduzca mensaje para enviar");
				byte[] datos=mensaje.getBytes();
				DatagramPacket paqueteEnviaPA = new DatagramPacket(datos, datos.length,InetAddress.getByName("localhost"), puertoD);
				SocketPA.send(paqueteEnviaPA);
				
				byte[] almacen = new byte[1024];
				DatagramPacket paqueteEnPA=new DatagramPacket(almacen, almacen.length);
				SocketPA.receive(paqueteEnPA);
				String mensajeA = new String(paqueteEnPA.getData(), 0, paqueteEnPA.getLength());
				ventana.escribirEnAreaDeTextoSuperior(mensajeA);
			}
	}	catch (SocketException e) {

		}
	}
}
