
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SRMDSocketsServidor {

	public static void main(String[] args) {
		try {
			int puertoE = 3000;
			int puertoD = 2000;
			DatagramSocket SocketServidor = new DatagramSocket(puertoE);
			while(true) {

				byte[] almacen = new byte[1024];
				DatagramPacket paqueteEnServidor=new DatagramPacket(almacen, almacen.length);
				SocketServidor.receive(paqueteEnServidor);
				String mensajeCliente = new String(paqueteEnServidor.getData(), 0, paqueteEnServidor.getLength());
				System.out.println("Proceso Servidor recibe: "+mensajeCliente);
				

                String[] partes = mensajeCliente.split(",");
                String operacionA = partes[0];
                int n = Integer.parseInt(partes[1]);

                
                
                if(n == 2) {
                	if (operacionA.equals("suma")) {
                        float numero1 = Float.parseFloat(partes[2]);
                        float numero2 = Float.parseFloat(partes[3]);
                        
                		float operacion = numero1 + numero2;
                		String mensajeOperacion = "La suma de " + numero1 + " y " + numero2 + " es : " + operacion;
                		byte[] datos = mensajeOperacion.getBytes();
                		DatagramPacket paqueteEnviaServidor = new DatagramPacket(datos, datos.length, InetAddress.getByName("localhost"), puertoD);
                		SocketServidor.send(paqueteEnviaServidor);
                		System.out.println("El servidor envia: "+mensajeOperacion);
    				
                	}
                }
                
                if(n == 3) {
                	if (operacionA.equals("suma")) {
                        float numero1 = Float.parseFloat(partes[2]);
                        float numero2 = Float.parseFloat(partes[3]);
                        float numero3 = Float.parseFloat(partes[4]);
                		float operacion = numero1 + numero2 + numero3;
                		String mensajeOperacion = "La suma de " + numero1 + " , " + numero2 + " y " + numero3 + " es : " + operacion;
                		byte[] datos = mensajeOperacion.getBytes();
                		DatagramPacket paqueteEnviaServidor = new DatagramPacket(datos, datos.length, InetAddress.getByName("localhost"), puertoD);
                		SocketServidor.send(paqueteEnviaServidor);
                		System.out.println("El servidor envia: "+mensajeOperacion);
    				
                	}
                }
                
                if(n == 4) {
                	if (operacionA.equals("suma")) {
                		
                        float numero1 = Float.parseFloat(partes[2]);
                        float numero2 = Float.parseFloat(partes[3]);
                        float numero3 = Float.parseFloat(partes[4]);
                        float numero4 = Float.parseFloat(partes[5]);
                	
                		float operacion = numero1 + numero2 + numero3 + numero4;
                		String mensajeOperacion = "La suma de " + numero1 + " y " + numero2 + " , " + numero3 + " y " + numero4 + " es : " + operacion;
                		byte[] datos = mensajeOperacion.getBytes();
                		DatagramPacket paqueteEnviaServidor = new DatagramPacket(datos, datos.length, InetAddress.getByName("localhost"), puertoD);
                		SocketServidor.send(paqueteEnviaServidor);
                		System.out.println("El servidor envia: "+mensajeOperacion);
    				
                	}
                }
                if(n == 5){
                	
                	 float numero1 = Float.parseFloat(partes[2]);
                     float numero2 = Float.parseFloat(partes[3]);
                     float numero3 = Float.parseFloat(partes[4]);
                     float numero4 = Float.parseFloat(partes[5]);
                     float numero5 = Float.parseFloat(partes[6]);
                     
            		float operacion = numero1 + numero2 + numero3 + numero4 + numero5;
            		String mensajeOperacion = "La suma de " + numero1 + " y " + numero2 + " , " + numero3 + " , " + numero4 + " y " + numero5 + " es : " + operacion;
            		byte[] datos = mensajeOperacion.getBytes();
            		DatagramPacket paqueteEnviaServidor = new DatagramPacket(datos, datos.length, InetAddress.getByName("localhost"), puertoD);
            		SocketServidor.send(paqueteEnviaServidor);
            		System.out.println("El servidor envia: "+mensajeOperacion);
                }
			}
		}
		
		catch(Exception ex){
			
		}

	}

}