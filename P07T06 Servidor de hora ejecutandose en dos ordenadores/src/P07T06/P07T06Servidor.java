package P07T06;

import java.net.DatagramPacket;

import java.net.DatagramSocket;
import java.util.Date;

public class P07T06Servidor {
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
				if(receivedMessage.equals("fecha y hora")) {
					System.out.println("SERVIDOR: El mensaje a enviar es: "+fecha+"\n");
					String fechaHora = new Date().toString();
					byte[] datos = fechaHora.getBytes();
					DatagramPacket paqueteAEnviar = new DatagramPacket(datos, datos.length, paqueteEnReceptor.getAddress(), paqueteEnReceptor.getPort());
					socketServidor.send(paqueteAEnviar);
				}
				else {
					System.out.println("SERVIDOR: El mensaje a enviar es: no entiendo\n");
					String palabra = "no entiendo";
					byte[] mensaje = palabra.getBytes();
					DatagramPacket paqueteAEnviar2 = new DatagramPacket(mensaje, mensaje.length, paqueteEnReceptor.getAddress(), paqueteEnReceptor.getPort());
					socketServidor.send(paqueteAEnviar2);
				}
				
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
