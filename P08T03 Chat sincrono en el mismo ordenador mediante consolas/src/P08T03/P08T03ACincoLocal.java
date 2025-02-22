package P08T03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class P08T03ACincoLocal {

	public static void main(String[] args) {
		try {
			int puertoD = 3000;
			int puertoE = 2000;
			DatagramSocket SocketA = new DatagramSocket(puertoE);
			for(int i = 1; i<=5; i++) {
				System.out.println("A: Introduzca el mensaje para enviar a B:");
				Scanner input = new Scanner(System.in);
				String mensajeA = input.nextLine();
				String respuesta = "Proceso A envia el mensaje " +mensajeA+"\n";
				
				byte[] datos=mensajeA.getBytes();
				DatagramPacket paqueteEnviaA = new DatagramPacket(datos, datos.length,InetAddress.getByName("localhost"), puertoD);
				SocketA.send(paqueteEnviaA);
				System.out.println(respuesta);
				
				byte[] almacen = new byte[10];
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
