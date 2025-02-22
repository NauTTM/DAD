import java.rmi.*;
import java.util.Scanner;
public class P12T03IniciacionCliente {
	public static void main(String args[]) {
		double mensajeRecibir;
		String direccionIPServidor="localhost";
		int numero1, numero2, numero3;
		Scanner scanner = new Scanner(System.in);
		int puertoRegistroRMI=2000;
		String rutaDelObjetoEnElRegistroRMI="/objetoTarea3";
		String urlObjetoRemoto = "rmi://"+direccionIPServidor+":"+puertoRegistroRMI+rutaDelObjetoEnElRegistroRMI;
		try {
			System.out.println("El cliente va a utilizar el objeto remoto registrado en: "+urlObjetoRemoto);
			P12T03IniciacionInterface referenciaObjetoRemoto = (P12T03IniciacionInterface)Naming.lookup(urlObjetoRemoto);
			System.out.println("El cliente ha completado la obtencion de la referencia al objeto remoto");
			while (true) {
				System.out.println("--------------------------------------------------------------");
				System.out.print("Dime un primer numero: ");
				numero1 = scanner.nextInt();
				System.out.print("Dime un segundo numero: ");
				numero2 = scanner.nextInt();
				System.out.print("Dime un tercero numero: ");
				numero3 = scanner.nextInt();
				mensajeRecibir=referenciaObjetoRemoto.raizDeMultiplicar(numero1, numero2, numero3);
				System.out.println("El cliente obtiene, con la ejecución del metodo remoto y los numeros introducidos, el numero: "+mensajeRecibir);
			}//fin while
		} //fin try
		catch (Exception excepcion) {
			System.out.println("En HolaCliente se ha producido la excepcion " + excepcion);
		}
	} //fin main()
}//fin clase