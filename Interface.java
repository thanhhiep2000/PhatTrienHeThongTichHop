import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Interface extends Remote {
	public StringBuffer Reverse(String s) throws RemoteException;

	public String Up(String s) throws RemoteException;

	public int Count(String s) throws RemoteException;

}
