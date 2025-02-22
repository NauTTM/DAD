import java.rmi.*;
import java.util.Scanner;
public class P12T01IniciacionCliente {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		String nombreEnviar;
		String mensajeRecibir;
		String direccionIPServidor="localhost";
		int puertoRegistroRMI=2000;
		String rutaDelObjetoEnElRegistroRMI="/ObjetoContadorCaracteres";
		String urlObjetoRemoto = "rmi://"+direccionIPServidor+":"+puertoRegistroRMI+rutaDelObjetoEnElRegistroRMI;
		try {
			System.out.println("El cliente va a utilizar el objeto remoto registrado en: "+urlObjetoRemoto);
			P12T01IniciacionInterface referenciaObjetoRemoto = (P12T01IniciacionInterface)Naming.lookup(urlObjetoRemoto);
			System.out.println("El cliente ha completado la obtencion de la referencia al objeto remoto");
			while (true) {
				System.out.println("--------------------------------------------------------------");
				System.out.print("Dime tu nombre: ");
				nombreEnviar=entrada.nextLine();
				mensajeRecibir=referenciaObjetoRemoto.metodoRemotoContarCaracteres(nombreEnviar);
				System.out.println("El cliente obtiene, con la ejecución del metodo remoto, el objeto String: "+mensajeRecibir);
			}//fin while
		} //fin try
		catch (Exception excepcion) {
			System.out.println("En HolaCliente se ha producido la excepcion " + excepcion);
		}
	} //fin main()
}//fin clase