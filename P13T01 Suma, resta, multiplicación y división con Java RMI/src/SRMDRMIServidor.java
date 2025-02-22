import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class SRMDRMIServidor {
	public static void main(String args[]) {
		int puertoRegistroRMI = 3000;
		String direccionIPServidor = "localhost";
		String rutaDelObjetoEnElRegistroRMI = "/SumaRestaMultiplicacionDivision";
		String urlObjeto = "rmi://"+direccionIPServidor+":"+puertoRegistroRMI+rutaDelObjetoEnElRegistroRMI;
		
		try {
			LocateRegistry.createRegistry(puertoRegistroRMI);
			System.out.println("Registro RMI creado en el servidor ("+direccionIPServidor+") en el puerto "+puertoRegistroRMI);
			SRMDRMIImplementacion objetoRemotoServidor = new SRMDRMIImplementacion();
			Naming.rebind(urlObjeto, objetoRemotoServidor);
			System.out.println("Objeto remoto registrado en el servidor en la ruta: "+ urlObjeto);


		}
		catch (Exception excepcion) {
			System.out.println("En HolaServidor se ha producido la excepcion: "+excepcion);
		}
	}
}
