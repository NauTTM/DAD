package P09T05;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.JOptionPane;

public class PB {
	public static void main( String[] args ) throws IOException {
		try {
			int puertoD = 2000;
			int puertoE = 3000;
			int x = 100;
			int y = 100;
			DatagramSocket SocketPB = new DatagramSocket();
			Hilo hilo = new Hilo(puertoE);
			hilo.start();
			while(true) {
				String mensaje = JOptionPane.showInputDialog("PB: Introduzca mensaje para PA");
				byte[] datos=mensaje.getBytes();
				DatagramPacket paqueteEnviaPB = new DatagramPacket(datos, datos.length,InetAddress.getByName("localhost"), puertoD);
				SocketPB.send(paqueteEnviaPB);
			}
				
	}	catch (SocketException e) {

		}
	}
}
