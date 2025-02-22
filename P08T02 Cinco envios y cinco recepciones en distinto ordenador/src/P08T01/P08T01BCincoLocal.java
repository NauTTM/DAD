package P08T01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class P08T01BCincoLocal {
	public static void main(String[] args) {
		try {
			int puertoE = 3000;
			DatagramSocket SocketB = new DatagramSocket(puertoE);
		
			for(int i = 1; i<=5; i++) {
				String respuesta = "Mensaje " +i+ " enviado desde B hasta A";
				
				byte[] almacen = new byte[1024];
				DatagramPacket paqueteEnB=new DatagramPacket(almacen, almacen.length);
				SocketB.receive(paqueteEnB);
				String mensajeA = new String(paqueteEnB.getData(), 0, paqueteEnB.getLength());
				System.out.println("Proceso B recibe: "+mensajeA);
				
				byte[] datos=respuesta.getBytes();
				DatagramPacket paqueteEnviaB = new DatagramPacket(datos, datos.length, paqueteEnB.getAddress(), paqueteEnB.getPort());
				SocketB.send(paqueteEnviaB);
				System.out.println("Proceso B envia: "+respuesta);
			}
		}
		
		catch(Exception ex){
			
		}
	}
	
}
