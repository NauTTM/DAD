import java.rmi.*;

public interface SRMDInterface extends Remote {
	public float sumar(float numero1, float numero2) throws java.rmi.RemoteException;
	public float restar(float numero1, float numero2) throws java.rmi.RemoteException;
	public float dividir(float numero1, float numero2) throws java.rmi.RemoteException;
	public float multiplicar(float numero1, float numero2) throws java.rmi.RemoteException;
} //end interface

