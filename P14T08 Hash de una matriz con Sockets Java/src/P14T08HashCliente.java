
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class P14T08HashCliente {
	public static void main(String[] args) {
		try {
			int puertoD = 3000;
			int puertoE = 2000;
			DatagramSocket SocketCliente = new DatagramSocket(puertoE);
			Scanner scanner = new Scanner(System.in);
			String mensaje, operacion;
			
			while(true) {

				System.out.println("--------------------------------------------------------------");
                System.out.print("Ingrese el número de filas: ");
                int filas = scanner.nextInt();
                System.out.print("Ingrese el número de columnas: ");
                int columnas = scanner.nextInt();
                
                int[][] matriz = new int[filas][columnas];
                System.out.println("Ingrese los elementos de la matriz:");
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        System.out.print("Elemento en la posición [" + i + "][" + j + "]: ");
                        matriz[i][j] = scanner.nextInt();
                    }
                }
                
                mensaje = convertirMatrizEnString(matriz);
                
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
		}
	
		
		catch(Exception ex){
			
		}
	}

	private static String convertirMatrizEnString(int[][] matriz) {
        StringBuilder mensaje = new StringBuilder("hash," + matriz.length + "," + matriz[0].length + ",");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                mensaje.append(matriz[i][j]);
                if (i != matriz.length - 1 || j != matriz[0].length - 1) {
                    mensaje.append(",");
                }
            }
        }
        return mensaje.toString();
	}
	
}