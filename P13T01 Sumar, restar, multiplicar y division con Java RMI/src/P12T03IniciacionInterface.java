import java.rmi.*;

public interface P12T03IniciacionInterface extends Remote {
	public float sumar(int numero1, int numero2) throws java.rmi.RemoteException;
	public float restar(int numero1, int numero2) throws java.rmi.RemoteException;
	public float dividir(int numero1, int numero2) throws java.rmi.RemoteException;
	public float multiplicar(int numero1, int numero2) throws java.rmi.RemoteException;
} //end interface

