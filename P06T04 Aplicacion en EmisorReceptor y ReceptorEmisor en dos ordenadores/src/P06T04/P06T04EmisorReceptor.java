package P06T04;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class P06T04EmisorReceptor {
	
	public static void main(String[] args) {
		
		int puertoDelDestino=2000;
		int puertoEscucha = 2001;
		try{
			DatagramSocket socketEmisor = new DatagramSocket();
			String mensaje="Molan las clases de DAD";
			byte[] datos=mensaje.getBytes();
			byte[] almacen = new byte[25];
			DatagramPacket paqueteAEnviar = new DatagramPacket(datos, datos.length, InetAddress.getByName("localhost"), puertoDelDestino);
			DatagramPacket paqueteEmisor=new DatagramPacket(almacen, almacen.length);
			System.out.println("R2: Soy el EmisorReceptor, abro un socket en el puerto"+puertoEscucha+", y voy a enviar al puerto"+puertoDelDestino+" el mensaje: "+mensaje);
			socketEmisor.send(paqueteAEnviar);
			System.out.println("R3: Soy el EmisorReceptor y me pongo a escuchar el puerto "+puertoEscucha);
			
			socketEmisor.receive(paqueteEmisor);
			System.out.println("R6: Soy el EmisorReceptor y el mensaje recibido es "+ new String(almacen));
			socketEmisor.close();
		}
		
		catch (Exception ex){
			ex.printStackTrace();
		}
	}
}
