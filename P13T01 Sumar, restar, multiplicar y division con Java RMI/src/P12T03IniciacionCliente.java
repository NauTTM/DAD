import java.rmi.*;
import java.util.Scanner;
public class P12T03IniciacionCliente {
	public static void main(String args[]) {
		float mensajeRecibir1, mensajeRecibir2, mensajeRecibir3, mensajeRecibir4;
		String direccionIPServidor="localhost";
		int numero1, numero2, numero3;
		Scanner scanner = new Scanner(System.in);
		int puertoRegistroRMI=3000;
		String rutaDelObjetoEnElRegistroRMI="/SumaRestaMultiplicacionDivision";
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
				mensajeRecibir1=referenciaObjetoRemoto.sumar(numero1, numero2);
				mensajeRecibir2=referenciaObjetoRemoto.restar(numero1, numero2);
				mensajeRecibir3=referenciaObjetoRemoto.multiplicar(numero1, numero2);
				mensajeRecibir4=referenciaObjetoRemoto.dividir(numero1, numero2);
				System.out.println("La suma de : "+numero1 + " y el numero: " +numero2+ " es: "+mensajeRecibir1);
				System.out.println("La resta de : "+numero1 + " y el numero: " +numero2+ " es: "+mensajeRecibir2);
				System.out.println("La multiplicacion de : "+numero1 + " y el numero: " +numero2+ " es: "+mensajeRecibir3);
				System.out.println("La division de : "+numero1 + " y el numero: " +numero2+ " es: "+mensajeRecibir4);
			}//fin while
		} //fin try
		catch (Exception excepcion) {
			System.out.println("En HolaCliente se ha producido la excepcion " + excepcion);
		}
	} //fin main()
}//fin clase