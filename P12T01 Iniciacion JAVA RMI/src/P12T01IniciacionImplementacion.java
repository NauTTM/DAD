import java.rmi.*;
import java.rmi.server.*;
public class P12T01IniciacionImplementacion extends UnicastRemoteObject implements P12T01IniciacionInterface {
	private static final long serialVersionUID = 1L;
	public P12T01IniciacionImplementacion() throws RemoteException {
			super();
		}//fin P12T01IniciacionImplementacion()
	public String metodoRemotoContarCaracteres(String nombre) throws RemoteException {
		//Información que se sacará por consola del servidor:
		System.out.println ("El servidor ejecuta una una peticion remota con nombre "+ nombre);
		//Implementación del método:
		return "Hola "+nombre+", tu nombre tiene "+ nombre.length()+" caracteres";
 	} //fin metodoRemotoContarCaracteres()
} //fin clase
