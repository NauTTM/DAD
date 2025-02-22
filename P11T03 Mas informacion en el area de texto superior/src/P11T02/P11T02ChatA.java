package P11T02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import javax.swing.JOptionPane;

public class P11T02ChatA {
	public static void main(String[] args) throws IOException {
		try {
			int puertoE = 2000;
			int puertoD = 3000;

			DatagramSocket SocketPA = new DatagramSocket(puertoE);
			DatagramPacket PacketA = new DatagramPacket(new byte[0], 0, InetAddress.getByName("localhost"), puertoD);
			String nombre = JOptionPane.showInputDialog("Introduzca su nombre:");
			P11T02Ventana ventana = new P11T02Ventana(SocketPA,PacketA, nombre);
			

			ventana.configuracionVentanaChat();
			ventana.setTitle("Chat de "+nombre);	
			
			while(true) {
				byte[] almacen = new byte[1024];
				DatagramPacket paqueteEnA=new DatagramPacket(almacen, almacen.length);
				SocketPA.receive(paqueteEnA);
				String mensaje = new String(paqueteEnA.getData(), 0, paqueteEnA.getLength());
				ventana.areaDeTextoSuperior.append(mensaje + "\n");
			}
			
		}
		catch(SocketException e){
			
		}
		
	}
}


