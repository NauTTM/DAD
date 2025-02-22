import java.rmi.*;
import java.rmi.server.*;
public class SRMDImplementacion extends UnicastRemoteObject implements SRMDInterface {
	private static final long serialVersionUID = 1L;
	public SRMDImplementacion() throws RemoteException {
			super();
		}
	public float sumar(float numero1, float numero2) throws RemoteException {
		System.out.println("El servidor atiente a la suma de " + numero1 + " y de " +numero2);
		return numero1 + numero2;
 	} 
	public float restar(float numero1, float numero2) throws RemoteException {
		System.out.println("El servidor atiente a la resta de " + numero1 + " y de " +numero2);
		return numero1 - numero2;
 	}
	public float multiplicar(float numero1, float numero2) throws RemoteException {
		System.out.println("El servidor atiente a la division de " + numero1 + " y de " +numero2);
		return numero1 * numero2;
 	}
	public float dividir(float numero1, float numero2) throws RemoteException {
		System.out.println("El servidor atiente a la multiplicacion de " + numero1 + " y de " +numero2);
		if(numero1 == 0) {
			return 0;
		}else{
			return numero1 % numero2;
		}
 	}
} 
