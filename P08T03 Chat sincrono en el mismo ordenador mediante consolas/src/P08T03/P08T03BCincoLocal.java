package P08T03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Scanner;

public class P08T03BCincoLocal {
	public static void main(String[] args) {
		try {
			int puertoE = 3000;
			DatagramSocket SocketB = new DatagramSocket(puertoE);
		
			for(int i = 1; i<=5; i++) {
				byte[] almacen = new byte[10];
				DatagramPacket paqueteEnB=new DatagramPacket(almacen, almacen.length);
				SocketB.receive(paqueteEnB);
				String mensajeA = new String(paqueteEnB.getData(), 0, paqueteEnB.getLength());
				System.out.println("Proceso B recibe: "+mensajeA);
				
				System.out.println("B: Introduzca el mensaje para enviar a A:");
				Scanner input = new Scanner(System.in);
				String mensajeB = input.nextLine();
				String respuesta = "Proceso B envia el mensaje: " +mensajeB+"\n";
				System.out.println(respuesta);
				byte[] datos=mensajeB.getBytes();
				DatagramPacket paqueteEnviaB = new DatagramPacket(datos, datos.length, paqueteEnB.getAddress(), paqueteEnB.getPort());
				SocketB.send(paqueteEnviaB);
				System.out.println(respuesta);
			}
		}
		
		catch(Exception ex){
			
		}
	}
	
}
