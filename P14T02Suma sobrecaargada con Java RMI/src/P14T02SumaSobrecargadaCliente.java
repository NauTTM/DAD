import java.rmi.Naming;
import java.util.Scanner;

public class P14T02SumaSobrecargadaCliente {
	public static void main(String args[]) {
		float mensajeRecibir1, mensajeRecibir2, mensajeRecibir3, mensajeRecibir4;
		String direccionIPServidor="localhost";
		float numero1, numero2, numero3;
		Scanner scanner = new Scanner(System.in);
		int puertoRegistroRMI=3000;
		String rutaDelObjetoEnElRegistroRMI="/SumaSobrecargada";
		String urlObjetoRemoto = "rmi://"+direccionIPServidor+":"+puertoRegistroRMI+rutaDelObjetoEnElRegistroRMI;
		try {
			System.out.println("El cliente va a utilizar el objeto remoto registrado en: "+urlObjetoRemoto);
			P14T02SumaSobrecargadaInterface referenciaObjetoRemoto = (P14T02SumaSobrecargadaInterface)Naming.lookup(urlObjetoRemoto);
			System.out.println("El cliente ha completado la obtencion de la referencia al objeto remoto");
			while (true) {
				System.out.println("--------------------------------------------------------------");
				System.out.print("Dime cuantos numeros quieres sumar (entre 2 y 5) : ");
				int n = scanner.nextInt();
				if (n > 5 && n < 2) {
					System.out.println("Numero no valido");
				}
			
				float[] numero = new float[n];
			
				for(int i = 0; i < n ; i++) {
					int x = i + 1;
					System.out.print("Dime el numero " + x + " de " + n + ": ");
					numero[i] = scanner.nextFloat();
				}
			
				if( n == 2) {
					mensajeRecibir1=referenciaObjetoRemoto.suma(numero[0], numero[1]);
					System.out.println("La suma de " + numero[0] + " y " + numero[1] + " es: " + mensajeRecibir1); 
				}
				if( n == 3) {
					mensajeRecibir1=referenciaObjetoRemoto.suma(numero[0], numero[1], numero[2]);
					System.out.println("La suma de " + numero[0] + " y " + numero[1] + " y  " + numero[2] + " es: " + mensajeRecibir1); 
				}
			
				if( n == 4) {
					mensajeRecibir1=referenciaObjetoRemoto.suma(numero[0], numero[1], numero[2], numero[3]);
					System.out.println("La suma de " + numero[0] + " y " + numero[1] + " y  " + numero[2] + " y  " + numero[3] +  " es: " + mensajeRecibir1); 
				}
			
				if( n == 5) {
					mensajeRecibir1=referenciaObjetoRemoto.suma(numero[0], numero[1], numero[2], numero[3], numero[4]);
					System.out.println("La suma de " + numero[0] + " y " + numero[1] + " y  " + numero[2] + " y  " + numero[3] + " y  " + numero[4] + " es: " + mensajeRecibir1); 
				}
			
			}
		}//fin try
		catch (Exception excepcion) {
			System.out.println("En HolaCliente se ha producido la excepcion " + excepcion);
		}
	}
}


