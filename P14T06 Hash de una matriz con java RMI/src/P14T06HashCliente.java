import java.rmi.Naming;
import java.util.Scanner;

public class P14T06HashCliente {
	public static void main(String args[]) {
		String direccionIPServidor="localhost";
		Scanner scanner = new Scanner(System.in);
		int puertoRegistroRMI=3000;
		String rutaDelObjetoEnElRegistroRMI="/Hash";
		String urlObjetoRemoto = "rmi://"+direccionIPServidor+":"+puertoRegistroRMI+rutaDelObjetoEnElRegistroRMI;
		try {
			System.out.println("El cliente va a utilizar el objeto remoto registrado en: "+urlObjetoRemoto);
			P14T06HashInterface referenciaObjetoRemoto = (P14T06HashInterface)Naming.lookup(urlObjetoRemoto);
			System.out.println("El cliente ha completado la obtencion de la referencia al objeto remoto");
			while (true) {
				System.out.println("--------------------------------------------------------------");
				System.out.print("Dime cuantos numero de columnas : ");
				int columnas = scanner.nextInt();
				System.out.print("Dime cuantos numero de filas : ");
				int filas = scanner.nextInt();
				
				int[][] matriz = new int[filas][columnas];
				
		        for (int i = 0; i < filas; i++) {
		            for (int j = 0; j < columnas; j++) {
		                System.out.print("Número en la posición [" + i + "][" + j + "]: ");
		                matriz[i][j] = scanner.nextInt();
		            }
		        }
		        
		       int nHash = referenciaObjetoRemoto.funcionHash(matriz);
		       System.out.println("El valor de una funcion has de la matriz es: " + nHash);
			
			}
		}//fin try
		catch (Exception excepcion) {
			System.out.println("En HolaCliente se ha producido la excepcion " + excepcion);
		}
	}
}


