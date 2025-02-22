package P07T06;

import java.net.DatagramPacket;

import java.net.DatagramSocket;
import java.util.Date;

public class P07T07Servidor {
	public static void main(String[] args) {
		int puertoEscucha = 3000;
		Date fecha = new Date();
		
		try (DatagramSocket socketServidor = new DatagramSocket(puertoEscucha)) {
			byte[] almacen = new byte[70];
			while(true) {
				DatagramPacket paqueteEnReceptor=new DatagramPacket(almacen, almacen.length);
				socketServidor.receive(paqueteEnReceptor);
				String receivedMessage = new String(paqueteEnReceptor.getData(), 0, paqueteEnReceptor.getLength());
				System.out.println("SERVIDOR SOLICITUD CASILLERO: Servidor con IP"+socketServidor.getLocalAddress()+"y puerto"+socketServidor.getLocalPort());
				System.out.println("SERVIDOR RECEPCION DATAGRAMA: El mensaje recivido es: "+receivedMessage);
				System.out.println("SERVIDOR RECEPCION DATAGRAMA: El anterior mensaje fue enviado desde un servidor con IP origen"+paqueteEnReceptor.getAddress()+" y puerto"+paqueteEnReceptor.getPort());
				System.out.println("ERVIDOR RECEPCION DATAGRAMA: El anterior mensaje fue enviado a un servidor con IP origen"+socketServidor.getLocalAddress()+" y puerto"+socketServidor.getLocalPort()+"\n");
				
				System.out.println("SERVIDOR ENVIO DATAGRAMA: El mensaje a enviar es: "+fecha);
				System.out.println("SERVIDOR RECEPCION DATAGRAMA: El anterior mensaje ha sido enviado desde un servidor con IP origen"+socketServidor.getLocalAddress()+" y puerto"+socketServidor.getLocalPort());
				System.out.println("ERVIDOR RECEPCION DATAGRAMA: El anterior mensaje fue enviado a un servidor con IP origen"+paqueteEnReceptor.getAddress()+" y puerto"+paqueteEnReceptor.getPort()+"\n");
				String fechaHora = new Date().toString();
				byte[] datos = fechaHora.getBytes();
				DatagramPacket paqueteAEnviar = new DatagramPacket(datos, datos.length, paqueteEnReceptor.getAddress(), paqueteEnReceptor.getPort());
				socketServidor.send(paqueteAEnviar);
				
				
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
