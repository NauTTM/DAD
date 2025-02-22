package P06T04;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class P05T04ReceptorEmisor {
	
	public static void main(String[] args) {
		
		int puertoEscucha=2000;
		int puertoDestino = 2001;
		try{
			DatagramSocket socketReceptor = new DatagramSocket(puertoEscucha);
			String mensaje="Si y tambien molan los laboratorios de DAD";
			byte[] datos=mensaje.getBytes();
			byte[] almacen = new byte[25];
			DatagramPacket paqueteEnReceptor=new DatagramPacket(almacen, almacen.length);
			DatagramPacket paqueteAEnviar = new DatagramPacket(datos, datos.length, InetAddress.getByName("localhost"), puertoDestino);
			System.out.println("R1: Soy el ReceptorEmisor y me pongo a escuchar en el puerto "+puertoEscucha);
			socketReceptor.receive(paqueteEnReceptor);
			System.out.println("R4: Soy el ReceptorEmisor y el mensaje recibido es "+ new String(almacen));
			//Thread.sleep(500);
			System.out.println("R5: Soy el ReceptorEmisor y voy a enviar al puerto: "+puertoDestino+" el mensaje"+mensaje);		
			socketReceptor.send(paqueteAEnviar);
			socketReceptor.close();
		} 
		
		catch (Exception ex){
			ex.printStackTrace();
		}
	}
}
