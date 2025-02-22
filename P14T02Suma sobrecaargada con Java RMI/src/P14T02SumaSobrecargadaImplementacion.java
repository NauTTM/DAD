import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class P14T02SumaSobrecargadaImplementacion extends UnicastRemoteObject implements P14T02SumaSobrecargadaInterface {

	private static final long serialVersionUID = 1L;
	public P14T02SumaSobrecargadaImplementacion() throws RemoteException {
			super();
		}
	public float suma(float numero1, float numero2) throws RemoteException {
		System.out.println("El servidor atiente a la suma de 2 números");
		float suma = numero1 + numero2;
		return suma;
	}
	
	public float suma(float numero1, float numero2, float numero3) throws RemoteException {
		System.out.println("El servidor atiente a la suma de 3 números");
		float suma = numero1 + numero2 + numero3;
		return suma;
	}
	
	public float suma(float numero1, float numero2, float numero3, float numero4) throws RemoteException {
		System.out.println("El servidor atiente a la suma de 4 números");
		float suma = numero1 + numero2 + numero3 + numero4;
		return suma;
	}
	
	public float suma(float numero1, float numero2, float numero3, float numero4, float numero5) throws RemoteException {
		System.out.println("El servidor atiente a la suma de 5 números");
		float suma = numero1 + numero2 + numero3 + numero4 + numero5;
		return suma;
	}
}

