package P09T05;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.JOptionPane;

public class PA {
	public static void main( String[] args )throws IOException {
		try {
			int puertoE = 2000;
			int puertoD = 3000;
			DatagramSocket SocketPA = new DatagramSocket();
			Hilo hilo = new Hilo(puertoE);
			hilo.start();
			while(true) {
				String mensaje = JOptionPane.showInputDialog("Introduzca mensaje para PB");
				byte[] datos=mensaje.getBytes();
				DatagramPacket paqueteEnviaPA = new DatagramPacket(datos, datos.length,InetAddress.getByName("localhost"), puertoD);
				SocketPA.send(paqueteEnviaPA);
			}
	}	catch (SocketException e) {

		}
	}
}
