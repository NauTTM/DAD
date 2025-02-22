package P08T01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class P08T01ACincoLocal {

	public static void main(String[] args) {
		try {
			int puertoD = 3000;
			int puertoE = 2000;
			DatagramSocket SocketA = new DatagramSocket(puertoE);
			for(int i = 1; i<=5; i++) {
				String respuesta = "Mensaje " +i+ " enviado desde A hasta B";
				
				byte[] datos=respuesta.getBytes();
				DatagramPacket paqueteEnviaA = new DatagramPacket(datos, datos.length,InetAddress.getByName("192.168.50.134"), puertoD);
				SocketA.send(paqueteEnviaA);
				System.out.println("Proceso A envia: "+respuesta);
				
				byte[] almacen = new byte[1024];
				DatagramPacket paqueteEnA=new DatagramPacket(almacen, almacen.length);
				SocketA.receive(paqueteEnA);
				String mensajeB = new String(paqueteEnA.getData(), 0, paqueteEnA.getLength());
				System.out.println("Proceso A recibe: "+mensajeB);
				
			}
		}
		
		catch(Exception ex){
			
		}

	}

}
