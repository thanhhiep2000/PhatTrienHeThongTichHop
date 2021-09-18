import java.util.Scanner;

public class Diem {
    private int x;
    private int y;

    Diem() {
        x = y = 0;
    }

    Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Nhap diem toa do
    public void nhapDiem(Scanner sc) {

        System.out.println("Nhap vao hoanh do x:");
        x = sc.nextInt();
        System.out.println("Nhap vao tung do y:");
        y = sc.nextInt();
    }

    // Hien thi toa do
    public void hienThi() {
        System.out.println("(" + x + "," + y + ")");
    }

    // Khoang cach
    public float khoachCach() {
        return (float) Math.sqrt(x * x + y * y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Diem A = new Diem();
        System.out.println("\nNhap vao toa do:");
        A.nhapDiem(sc);
        System.out.println("\nHien thi toa do:");
        A.hienThi();
        System.out.println("\nKhoach cach den goc toa do:" + A.khoachCach());

    }

}
