package P14T04;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class SRMDSocketsCliente {
	public static void main(String[] args) {
		try {
			int puertoD = 3000;
			int puertoE = 2000;
			DatagramSocket SocketCliente = new DatagramSocket(puertoE);
			Scanner scanner = new Scanner(System.in);
			String mensaje, operacion;
			
			while(true) {

				System.out.println("--------------------------------------------------------------");
				System.out.print("Dime cuantos numeros quieres sumar (entre 2 y 5) : ");
				int n = scanner.nextInt();
				if (n > 5 || n < 2) {
					System.out.println("Numero no valido");
				}
			
				float[] numero = new float[n];
			
				for(int i = 0; i < n ; i++) {
					System.out.print("Dime el numero " + (i + 1 )+ " de " + n + ": ");
					numero[i + 1] = scanner.nextFloat();
					
				}
                System.out.println("tonto");
                
				if(n == 2) {
					
					operacion = "suma";
				
					mensaje = operacion+","+n+","+numero[1]+","+numero[2];
				
				
					byte[] datos = mensaje.getBytes();
					DatagramPacket paqueteEnviaCliente = new DatagramPacket(datos, datos.length, InetAddress.getByName("localhost"), puertoD);
					SocketCliente.send(paqueteEnviaCliente);
					System.out.println("El cliente envia " + mensaje);
				
				
					byte[] almacen = new byte[1024];
					DatagramPacket paqueteEnCliente=new DatagramPacket(almacen, almacen.length);
					SocketCliente.receive(paqueteEnCliente);
					String mensajeCliente = new String(paqueteEnCliente.getData(), 0, paqueteEnCliente.getLength());
					System.out.println("Proceso Cliente recibe: "+mensajeCliente);
				}
				
				if(n == 3) {
					operacion = "suma";
				
					mensaje = operacion+","+n+","+numero[1]+","+numero[2]+","+numero[3];
				
				
					byte[] datos = mensaje.getBytes();
					DatagramPacket paqueteEnviaCliente = new DatagramPacket(datos, datos.length, InetAddress.getByName("localhost"), puertoD);
					SocketCliente.send(paqueteEnviaCliente);
				
				
					byte[] almacen = new byte[1024];
					DatagramPacket paqueteEnCliente=new DatagramPacket(almacen, almacen.length);
					SocketCliente.receive(paqueteEnCliente);
					String mensajeCliente = new String(paqueteEnCliente.getData(), 0, paqueteEnCliente.getLength());
					System.out.println("Proceso Cliente recibe: "+mensajeCliente);
				}
				
				if(n == 4) {
					operacion = "suma";
				
					mensaje = operacion+","+n+","+numero[1]+","+numero[2]+","+numero[3]+","+numero[4];
				
				
					byte[] datos = mensaje.getBytes();
					DatagramPacket paqueteEnviaCliente = new DatagramPacket(datos, datos.length, InetAddress.getByName("localhost"), puertoD);
					SocketCliente.send(paqueteEnviaCliente);
				
				
					byte[] almacen = new byte[1024];
					DatagramPacket paqueteEnCliente=new DatagramPacket(almacen, almacen.length);
					SocketCliente.receive(paqueteEnCliente);
					String mensajeCliente = new String(paqueteEnCliente.getData(), 0, paqueteEnCliente.getLength());
					System.out.println("Proceso Cliente recibe: "+mensajeCliente);
				}
				
				if(n == 5) {
					operacion = "suma";
				
					mensaje = operacion+","+n+","+numero[1]+","+numero[2]+","+numero[3]+","+numero[4]+","+numero[5];
				
				
					byte[] datos = mensaje.getBytes();
					DatagramPacket paqueteEnviaCliente = new DatagramPacket(datos, datos.length, InetAddress.getByName("localhost"), puertoD);
					SocketCliente.send(paqueteEnviaCliente);
				
				
					byte[] almacen = new byte[1024];
					DatagramPacket paqueteEnCliente=new DatagramPacket(almacen, almacen.length);
					SocketCliente.receive(paqueteEnCliente);
					String mensajeCliente = new String(paqueteEnCliente.getData(), 0, paqueteEnCliente.getLength());
					System.out.println("Proceso Cliente recibe: "+mensajeCliente);
				}
			}
		}
		
		catch(Exception ex){
			
		}
	}
	
}
