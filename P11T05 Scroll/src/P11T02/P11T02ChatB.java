package P11T02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import javax.swing.JOptionPane;

public class P11T02ChatB {
	public static void main(String[] args) throws IOException{
		try {
			int puertoD = 2000;
			int puertoE = 3000;
			
			
			DatagramSocket SocketPB = new DatagramSocket(puertoE);
			DatagramPacket PacketB = new DatagramPacket(new byte[0], 0, InetAddress.getByName("localhost"), puertoD);
			String nombre = JOptionPane.showInputDialog("Introduzca su nombre:");

			P11T02Ventana ventana = new P11T02Ventana(SocketPB, PacketB, nombre);
			ventana.configuracionVentanaChat();
			ventana.setTitle("Chat de "+nombre);
			
			
			while(true) {
				byte[] almacen = new byte[1024];
				DatagramPacket paqueteEnA=new DatagramPacket(almacen, almacen.length);
				SocketPB.receive(paqueteEnA);
				String mensaje = new String(paqueteEnA.getData(), 0, paqueteEnA.getLength());
				ventana.areaDeTextoSuperior.append(mensaje + "\n");
			}
		}
		catch (SocketException e){
		}
	}
}
