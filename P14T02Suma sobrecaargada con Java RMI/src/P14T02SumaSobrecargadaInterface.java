import java.rmi.*;
public interface P14T02SumaSobrecargadaInterface extends Remote {

	public float suma(float numero1, float numero2) throws java.rmi.RemoteException;
	public float suma(float numero1, float numero2,float numero3) throws java.rmi.RemoteException;
	public float suma(float numero1, float numero2, float numero3, float numero4) throws java.rmi.RemoteException;
	public float suma(float numero1, float numero2, float numero3, float numero4, float numero5) throws java.rmi.RemoteException;
		
}