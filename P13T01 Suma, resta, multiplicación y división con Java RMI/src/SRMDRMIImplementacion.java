import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SRMDRMIImplementacion extends UnicastRemoteObject implements SRMDRMIInterface {
	
	private static final long serialVersionUID = 1L;
	
	protected SRMDRMIImplementacion() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	
		public float suma(float numero1, float numero2) throws RemoteException{
			System.out.println("Recibidos los números para sumar " + numero1 + ", " + numero2);
			float suma = numero1 + numero2;
			return suma;
			
		}
		
		public float resta(float numero1, float numero2) throws RemoteException{
			System.out.println("Recibidos los números para restar" + numero1 + ", " + numero2);
			
			float resta = numero1 - numero2;
			return resta;
			
		}
		
		public float multiplicacion(float numero1, float numero2) throws RemoteException{
			System.out.println("Recibidos los números para multiplicar " + numero1 + ", " + numero2);
			
			float multiplicacion = numero1 * numero2;
			return multiplicacion;
		}
		
		public float division(float numero1, float numero2) throws RemoteException{
			System.out.println("Recibidos los números para dividir " + numero1 + ", " + numero2);
			
			float divison = numero1 / numero2;
			return divison;
			
			
		}
}
