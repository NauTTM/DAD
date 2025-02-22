package P06T03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class P05T03Receptor {
	
	public static void main(String[] args) {
		
		int puertoEscucha=2000;
		
		try{
			DatagramSocket socketReceptor = new DatagramSocket(puertoEscucha);
			byte[] almacen = new byte[25];
			DatagramPacket paqueteEnReceptor=new DatagramPacket(almacen, almacen.length);
			System.out.println("R1: Soy el RECEPTOR y me pongo a escuchar en el puerto "+puertoEscucha);
			socketReceptor.receive(paqueteEnReceptor);
			System.out.println("R2: Soy el RECEPTOR y el mensaje recibido es "+ new String(almacen));
			socketReceptor.close();
		} 
		
		catch (Exception ex){
			ex.printStackTrace();
		}
	}
}
