package P08T01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class P08T01BCincoLocal {
	public static void main(String[] args) {
		try {
			int puertoE = 3000;
			DatagramSocket SocketB = new DatagramSocket(puertoE);
		
			while(true) {
				int i =  0;
				String respuesta = "Mensaje " +i+ " enviado desde B hasta A";
				
				byte[] datos=respuesta.getBytes();
				DatagramPacket paqueteEnviaB = new DatagramPacket(datos, datos.length, InetAddress.getByName("192.168.56.1"), puertoE);
				SocketB.send(paqueteEnviaB);
				System.out.println("Proceso B envia: "+respuesta);
				
				i++;
			}
		}
		
		catch(Exception ex){
			
		}
	}
	
}
