import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.util.Scanner;
import java.rmi.RemoteException;

public class Server {
	public static void main(String[] args) {

		Registry re;
		System.out.println("nhap so port");
		try {
			re = LocateRegistry.createRegistry(new Scanner(System.in).nextInt());
			System.out.println("Tao cong ket noi thanh cong!!!");
			re.rebind("kq", new InterfaceImpl());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
