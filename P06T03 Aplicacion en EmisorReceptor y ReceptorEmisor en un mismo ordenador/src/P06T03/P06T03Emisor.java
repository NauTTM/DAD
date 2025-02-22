package P06T03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class P06T03Emisor {
	
	public static void main(String[] args) {
		
		int puertoDelDestino=2000;
		
		try{
			DatagramSocket socketEmisor = new DatagramSocket();
			String mensaje="Molan las clases de DAD";
			byte[] datos=mensaje.getBytes();
			DatagramPacket paqueteAEnviar = new DatagramPacket(datos, datos.length, InetAddress.getByName("192.168.56.1"), puertoDelDestino);
			socketEmisor.send(paqueteAEnviar);
			socketEmisor.close();
			System.out.println("E1: Soy el emisor, y he enviado el mensaje: "+mensaje);
		}
		
		catch (Exception ex){
			ex.printStackTrace();
		}
	}
}
