import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class InterfaceImpl extends UnicastRemoteObject implements Interface {

	protected InterfaceImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public StringBuffer Reverse(String s) throws RemoteException {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer(s);
		return str.reverse();
	}

	@Override
	public String Up(String s) throws RemoteException {
		// TODO Auto-generated method stub
		return s.toUpperCase();
	}

	@Override
	public int Count(String s) throws RemoteException {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ')
				count++;
		}
		return count;
	}

}
