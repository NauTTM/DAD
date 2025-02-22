package P07T06;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class P07T07Cliente {
	public static void main(String[] args) {
		
		int puertoDestino=3000;
		
		try{
			DatagramSocket socketCliente = new DatagramSocket();
			System.out.println("CLIENTE SOLICITUD CASILLERO: Cliente con IP "+socketCliente.getLocalAddress()+" crea socket para comunicacion en el puerto"+socketCliente.getLocalPort());
			String mensaje="fecha y hora";
			System.out.println("CLIENTE: Se enviado el mensaje "+mensaje);
			byte[] datos=mensaje.getBytes();
			DatagramPacket paqueteAEnviar = new DatagramPacket(datos, datos.length, InetAddress.getByName("255.255.255.255"), puertoDestino);
			System.out.println("CLIENTE ENVIO DATAGRAMA: Se ha enviado el mensaje: "+mensaje);
			System.out.println("CLIENTE ENVIO DATAGRAMA: Se ha enviado el mensaje desde la direccion IP: "+socketCliente.getLocalAddress()+"desde el puerto: "+socketCliente.getLocalPort());
			System.out.println("CLIENTE ENVIO DATAGRAMA: Se ha enviado el mensaje a la direccion IP: "+paqueteAEnviar.getAddress()+" y al puerto "+paqueteAEnviar.getPort()+"\n");
			socketCliente.send(paqueteAEnviar);
			
			byte[] almacen = new byte[70];
            DatagramPacket respuestaPacket = new DatagramPacket(almacen, almacen.length);
            socketCliente.receive(respuestaPacket);

            String respuesta = new String(respuestaPacket.getData(), 0, respuestaPacket.getLength());
            System.out.println("CLIENTE RECEPCION DATAGRAMA: Se ha recivido el siguiente mensaje: " + respuesta);
            System.out.println("CLIENTE RECEPCION DATAGRAMA: El anterior mensaje fue enviado desde un servidor con IP origen: " + respuestaPacket.getAddress()+" y puerto "+respuestaPacket.getPort());
            System.out.println("CLIENTE RECEPCION DATAGRAMA: El anterior mensaje ha sido enviado desde a un servidor con IP origen: " + socketCliente.getLocalAddress()+" y puerto "+socketCliente.getLocalPort()+"\n");
			socketCliente.close();
		}
		
		catch (Exception ex){
			ex.printStackTrace();
		}
	}
}
