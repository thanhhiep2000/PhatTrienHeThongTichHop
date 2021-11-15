import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.Naming;
import java.util.Scanner;

public class Client {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		System.out.println("nhap dia chi IP");
		String ip = sc.nextLine();

		System.out.println("nhap so port");
		sc.hasNextLine();
		String port = sc.nextLine();
		Interface in = (Interface) Naming.lookup("rmi://" + ip + ":" + port + "/kq");
		boolean isContinue = true;
		do {
			System.out.println("       MENU");
			System.out.println("------------------");
			System.out.println("1:Dao nguoc ki tu.");
			System.out.println("2:Viet hoa toan bo.");
			System.out.println("3:Dem so tu");
			System.out.println("Chon cong viec:");
			int choose = sc.nextInt();
			System.out.println("Moi ban nhap vao xau:");
			sc.nextLine();
			String s = sc.nextLine();
			switch (choose) {
			case 1:
				System.out.println(in.Reverse(s));
				break;
			case 2:
				System.out.println(in.Up(s));
				break;
			case 3:
				System.out.println(in.Count(s));
				break;
			}
			System.out.println("EXIT de thoat");
			if (sc.nextLine().equalsIgnoreCase("exit"))
				isContinue = false;
		} while (isContinue);

	}
}
