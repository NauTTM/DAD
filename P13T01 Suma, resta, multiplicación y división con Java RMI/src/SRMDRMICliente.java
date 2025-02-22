import java.rmi.Naming;
import java.util.Scanner;

public class SRMDRMICliente {
	public static void main(String args[]) {
		float mensajeRecibir1, mensajeRecibir2, mensajeRecibir3, mensajeRecibir4;
		String direccionIPServidor="localhost";
		int numero1, numero2;
		Scanner scanner = new Scanner(System.in);
		int puertoRegistroRMI=3000;
		String rutaDelObjetoEnElRegistroRMI="/SumaRestaMultiplicacionDivision";
		String urlObjetoRemoto = "rmi://"+direccionIPServidor+":"+puertoRegistroRMI+rutaDelObjetoEnElRegistroRMI;
		try {
			System.out.println("El cliente va a utilizar el objeto remoto registrado en: "+urlObjetoRemoto);
			SRMDRMIInterface referenciaObjetoRemoto = (SRMDRMIInterface)Naming.lookup(urlObjetoRemoto);
			System.out.println("El cliente ha completado la obtencion de la referencia al objeto remoto");
			while (true) {
				System.out.println("--------------------------------------------------------------");
				System.out.print("Dime un primer numero: ");
				numero1 = scanner.nextInt();
				System.out.print("Dime un segundo numero: ");
				numero2 = scanner.nextInt();

				mensajeRecibir1=referenciaObjetoRemoto.suma(numero1, numero2);
				mensajeRecibir2=referenciaObjetoRemoto.resta(numero1, numero2);
				mensajeRecibir3=referenciaObjetoRemoto.multiplicacion(numero1, numero2);
				mensajeRecibir4=referenciaObjetoRemoto.division(numero1, numero2);
				System.out.println("El valor de la suma es: "+mensajeRecibir1);
				System.out.println("El valor de la resta es: "+mensajeRecibir2);
				System.out.println("El valor de la division es: "+mensajeRecibir3);
				System.out.println("El valor de la multiplicacion es: "+mensajeRecibir4);
				
			}
		} 
		catch (Exception excepcion) {
			System.out.println("En HolaCliente se ha producido la excepcion " + excepcion);
		}
	} //fin main()
}
