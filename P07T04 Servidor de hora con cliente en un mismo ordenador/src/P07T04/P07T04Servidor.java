package P07T04;

import java.net.DatagramPacket;

import java.net.DatagramSocket;
import java.util.Date;

public class P07T04Servidor {
	public static void main(String[] args) {
		int puertoEscucha = 3000;
		Date fecha = new Date();
		
		try (DatagramSocket socketServidor = new DatagramSocket(puertoEscucha)) {
			byte[] almacen = new byte[70];
			while(true) {
				DatagramPacket paqueteEnReceptor=new DatagramPacket(almacen, almacen.length);
				socketServidor.receive(paqueteEnReceptor);
				String receivedMessage = new String(paqueteEnReceptor.getData(), 0, paqueteEnReceptor.getLength());
				System.out.println("SERVIDOR: El mensaje recivido es: "+receivedMessage);
				System.out.println("SERVIDOR: La dirección IP desde la que se envió es: "+paqueteEnReceptor.getAddress());
				System.out.println("SERVIDOR: El puerto desde el que se envió es: "+paqueteEnReceptor.getPort());
				System.out.println("SERVIDOR: El mensaje a enviar es: "+fecha);
				String fechaHora = new Date().toString();
                byte[] datos = fechaHora.getBytes();
				DatagramPacket paqueteAEnviar = new DatagramPacket(datos, datos.length, paqueteEnReceptor.getAddress(), paqueteEnReceptor.getPort());
				socketServidor.send(paqueteAEnviar);
				socketServidor.close();
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
