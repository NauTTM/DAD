package P07T05;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class P07T05Cliente {
	public static void main(String[] args) {
		
		int puertoDestino=3000;
		
		try{
			DatagramSocket socketCliente = new DatagramSocket();
			String mensaje="fecha y hora";
			System.out.println("CLIENTE: Se enviado el mensaje "+mensaje);
			byte[] datos=mensaje.getBytes();
			DatagramPacket paqueteAEnviar = new DatagramPacket(datos, datos.length, InetAddress.getByName("localhost"), puertoDestino);
			socketCliente.send(paqueteAEnviar);
			
			byte[] almacen = new byte[70];
            DatagramPacket respuestaPacket = new DatagramPacket(almacen, almacen.length);
            socketCliente.receive(respuestaPacket);

            String respuesta = new String(respuestaPacket.getData(), 0, respuestaPacket.getLength());
            System.out.println("CLIENTE: Se ha recivido el siguiente mensaje: " + respuesta);
			socketCliente.close();
		}
		
		catch (Exception ex){
			ex.printStackTrace();
		}
	}
}
