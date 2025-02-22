import java.rmi.*;
import java.rmi.server.*;
public class P12T03IniciacionImplementacion extends UnicastRemoteObject implements P12T03IniciacionInterface {
	private static final long serialVersionUID = 1L;
	public P12T03IniciacionImplementacion() throws RemoteException {
			super();
		}
	public float sumar(int numero1, int numero2) throws RemoteException {
		System.out.println("El servidor atiente a la suma de " + numero1 + "y de " +numero2);
		return numero1 + numero2;
 	} 
	public float restar(int numero1, int numero2) throws RemoteException {
		System.out.println("El servidor atiente a la resta de " + numero1 + "y de " +numero2);
		return numero1 - numero2;
 	}
	public float multiplicar(int numero1, int numero2) throws RemoteException {
		System.out.println("El servidor atiente a la division de " + numero1 + "y de " +numero2);
		return numero1 * numero2;
 	}
	public float dividir(int numero1, int numero2) throws RemoteException {
		System.out.println("El servidor atiente a la multiplicacion de " + numero1 + "y de " +numero2);
		if(numero1 == 0) {
			return 0;
		}else{
			return numero1 % numero2;
		}
 	}
} 
