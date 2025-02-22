package P09T01;

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
			
			while(true) {
			
				String mensaje = JOptionPane.showInputDialog("Introduzca mensaje para PB");
				byte[] datos=mensaje.getBytes();
				DatagramPacket paqueteEnviaPA = new DatagramPacket(datos, datos.length,InetAddress.getByName("localhost"), puertoD);
				SocketPA.send(paqueteEnviaPA);
				byte[] almacen = new byte[1024];
				DatagramPacket paqueteEnPA=new DatagramPacket(almacen, almacen.length);
				SocketPA.receive(paqueteEnPA);
				String mensajeB = new String(paqueteEnPA.getData(), 0, paqueteEnPA.getLength());
				String message = String.format("mensaje recibido de PB;\n %s", mensajeB);
				JOptionPane.showMessageDialog(null, message);
			}
	}	catch (SocketException e) {

		}
	}
}
