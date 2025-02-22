
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class SRMDSocketsCliente {
	public static void main(String[] args) {
		int puertoD = 3000;
		int puertoE = 2000;
		Scanner scanner = new Scanner(System.in);
		String mensaje, operacion;
		
		try {

			DatagramSocket SocketCliente = new DatagramSocket(puertoE);


			
			while(true) {

				System.out.println("--------------------------------------------------------------");
				System.out.print("Dime cuantos numeros quieres sumar (entre 2 y 5) : ");
				int n = scanner.nextInt();

			
				float[] numero = new float[n];
				
				if (n <= 1 || n >= 6) {
					System.out.println("ERROR");
				}else {
			
					for(int i = 0; i < n ; i++) {
						System.out.print("Dime el numero " + (i + 1 )+ " de " + n + ": ");
						numero[i] = scanner.nextFloat();
					
					}

					if(n == 2) {
					
						operacion = "suma";
				
						mensaje = operacion+","+n+","+numero[0]+","+numero[1];
				
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
				
						mensaje = operacion+","+n+","+numero[0]+","+numero[1]+","+numero[2];
				
				
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
				
						mensaje = operacion+","+n+","+numero[0]+","+numero[1]+","+numero[2]+","+numero[3];
				
				
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
				
						mensaje = operacion+","+n+","+numero[0]+","+numero[1]+","+numero[2]+","+numero[3]+","+numero[4];
				
				
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
		}
		
		catch(Exception ex){
			
		}
	}
	
}