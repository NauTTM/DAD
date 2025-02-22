import java.rmi.*;
import java.rmi.registry.*;
public class P12T03IniciacionServidor{
	public static void main(String args[]) {
		String direccionIPServidor="localhost";
		int puertoRegistroRMI=2000;
		String rutaDelObjetoEnElRegistroRMI="/objetoTarea3";
		String urlObjeto = "rmi://"+direccionIPServidor+":"+puertoRegistroRMI+rutaDelObjetoEnElRegistroRMI;

		try {
			//Se crea un Registro RMI en el Servidor:
			LocateRegistry.createRegistry(puertoRegistroRMI);
			//Información que se sacará por consola del servidor:
			System.out.println("Registro RMI creado en el servidor ("+direccionIPServidor+") en el puerto "+puertoRegistroRMI);
			//Se instancia un objeto en el servidor para llamarle remotamente:
			P12T03IniciacionImplementacion objetoRemotoServidor = new P12T03IniciacionImplementacion();
			//Registra el objeto remoto en el registro RMI en una determinada ruta
			Naming.rebind(urlObjeto, objetoRemotoServidor);
			//Información que se sacará por consola del servidor:
			System.out.println("Objeto remoto registrado en el servidor en la ruta: "+ urlObjeto);
		}// end try
		catch (Exception excepcion) {
			System.out.println("En HolaServidor se ha producido la excepcion: "+excepcion);
		} // end catch
	} // end main
} // end class
