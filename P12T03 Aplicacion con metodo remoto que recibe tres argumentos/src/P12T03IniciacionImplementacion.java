import java.rmi.*;
import java.rmi.server.*;
public class P12T03IniciacionImplementacion extends UnicastRemoteObject implements P12T03IniciacionInterface {
	private static final long serialVersionUID = 1L;
	public P12T03IniciacionImplementacion() throws RemoteException {
			super();
		}//fin P12T01IniciacionImplementacion()
	public double raizDeMultiplicar(int numero1, int numero2, int numero3) throws RemoteException {
		
        System.out.println("Recibidos los números " + numero1 + ", " + numero2 + ", " + numero3);

		int multiplicacion1 = numero1 * numero2;
		int multiplicacion2 = multiplicacion1 * numero3;
		double raiz = Math.sqrt(multiplicacion2);
		return raiz;
 	} //fin metodoRemotoContarCaracteres()
} //fin clase
