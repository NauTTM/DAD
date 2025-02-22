
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;

public class P14T08HashServidor {

	public static void main(String[] args) {
		try {
			int puertoE = 3000;
			int puertoD = 2000;
			int nHash;
			DatagramSocket SocketServidor = new DatagramSocket(puertoE);
			System.out.println("El servidor en localhost/127.0.0.1 hace uso del puerto " + puertoE);
			int[][] matriz;
			while(true) {

				byte[] almacen = new byte[1024];
				DatagramPacket paqueteEnServidor=new DatagramPacket(almacen, almacen.length);
				SocketServidor.receive(paqueteEnServidor);
				String mensajeCliente = new String(paqueteEnServidor.getData(), 0, paqueteEnServidor.getLength());
				System.out.println("Proceso Servidor recibe: "+mensajeCliente);
				
				matriz = obtenerMatrizDeString(mensajeCliente);
				
				
				nHash = Arrays.deepHashCode(matriz);
				String mensajeHash = "El valor de una función hash de la matriz que calculó el servidor es: " + nHash;
				
				
        		byte[] datos = mensajeHash.getBytes();
        		DatagramPacket paqueteEnviaServidor = new DatagramPacket(datos, datos.length, InetAddress.getByName("localhost"), puertoD);
        		SocketServidor.send(paqueteEnviaServidor);
        		System.out.println(mensajeHash);
			}
		}
		catch(Exception ex){
			
		}

	}
	
	private static int[][] obtenerMatrizDeString(String mensaje) {
	    String[] partes = mensaje.split(",");
	    int filas = Integer.parseInt(partes[1]);
	    int columnas = Integer.parseInt(partes[2]);
	    int[][] matriz = new int[filas][columnas];

	    int contador = 3; 
	    for (int i = 0; i < filas; i++) {
	        for (int j = 0; j < columnas; j++) {
	            matriz[i][j] = Integer.parseInt(partes[contador]);
	            contador++;
	        }
	    }

	    return matriz;
	}

}