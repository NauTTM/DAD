import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Arrays;

public class P14T06HashImplementacion extends UnicastRemoteObject implements P14T06HashInterface {

	private static final long serialVersionUID = 1L;
	public P14T06HashImplementacion() throws RemoteException {
			super();
		}
	public int funcionHash(int[][] matriz) throws RemoteException {
		int nHash = Arrays.deepHashCode(matriz);
		System.out.println("El servidor ha recibido la petición de realización de una función Hash" );
		System.out.println("El servidor devuelve el valor: " + nHash);
		return nHash;
	}
}
