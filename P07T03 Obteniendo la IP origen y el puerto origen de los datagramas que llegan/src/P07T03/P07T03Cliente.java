package P07T03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class P07T03Cliente {
	public static void main(String[] args) {
		
		int puertoDestino=3000;
		
		try{
			DatagramSocket socketEmisor = new DatagramSocket();
			String mensaje="Ya estamos en el ecuador de la asignatura";
			byte[] datos=mensaje.getBytes();
			DatagramPacket paqueteAEnviar = new DatagramPacket(datos, datos.length, InetAddress.getByName("localhost"), puertoDestino);
			socketEmisor.send(paqueteAEnviar);
			socketEmisor.close();
		}
		
		catch (Exception ex){
			ex.printStackTrace();
		}
	}
}
