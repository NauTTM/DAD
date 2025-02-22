package P07T03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class P07T03Servidor {
	public static void main(String[] args) {
		int puertoEscucha = 3000;
		
		try (DatagramSocket socketServidor = new DatagramSocket(puertoEscucha)) {
			byte[] almacen = new byte[70];
			DatagramPacket paqueteEnReceptor=new DatagramPacket(almacen, almacen.length);
			socketServidor.receive(paqueteEnReceptor);
			String receivedMessage = new String(paqueteEnReceptor.getData(), 0, paqueteEnReceptor.getLength());
			System.out.println("El mensaje recivido es: "+receivedMessage);
			System.out.println("La dirección IP desde la que se envió es: "+paqueteEnReceptor.getAddress());
			System.out.println("El puerto desde el que se envió es: "+paqueteEnReceptor.getPort());
			socketServidor.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
