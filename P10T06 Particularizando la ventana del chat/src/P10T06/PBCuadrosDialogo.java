package P10T06;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.JOptionPane;

public class PBCuadrosDialogo {
	public static void main( String[] args ) throws IOException {
		try {
			int puertoD = 2000;
			int puertoE = 3000;
			DatagramSocket SocketPB = new DatagramSocket(puertoE);
			P10T06Ventana ventana = new P10T06Ventana();
			String nombre = JOptionPane.showInputDialog("Introduzca su nombre:");
			ventana.configuracionVentanaChat();
			ventana.setTitle("Chat de "+nombre);
			while(true) {
				
				byte[] almacen = new byte[1024];
				DatagramPacket paqueteEnPB=new DatagramPacket(almacen, almacen.length);
				SocketPB.receive(paqueteEnPB);
				String mensajeB = new String(paqueteEnPB.getData(), 0, paqueteEnPB.getLength());
				ventana.escribirEnAreaDeTextoSuperior(mensajeB);
			
				String mensaje = JOptionPane.showInputDialog("Introduzca mensaje para enviar");
				byte[] datos=mensaje.getBytes();
				DatagramPacket paqueteEnviaPB = new DatagramPacket(datos, datos.length,InetAddress.getByName("localhost"), puertoD);
				SocketPB.send(paqueteEnviaPB);
			}

	}	catch (SocketException e) {

		}
	}
}
