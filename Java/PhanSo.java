import java.util.Scanner;

public class PhanSo {

    private int tuSo;
    private int mauSo;

    public PhanSo() {
        tuSo = 0;
        mauSo = 1;
    }

    public PhanSo(int tuSo, int mauSo) {
        if (mauSo == 0) {
            System.out.println("Mau so khong duoc bang 0");
            tuSo = 0;
            mauSo = 1;
        } else {
            this.tuSo = tuSo;
            this.mauSo = mauSo;
        }
    }

    // Nhap phan so
    public void nhapPS(Scanner sc) {
        int ts, ms;
        do {
            System.out.print("\tNhap vao tu so: ");
            ts = sc.nextInt();
            System.out.print("\tNhap vao mau so: ");
            ms = sc.nextInt();

            if (ms == 0) {
                System.out.println("Nhap lai thong tin cho phan so!");
            }
        } while (ms == 0);
        tuSo = ts;
        mauSo = ms;
    }

    // Hien thi phan so
    public void hienThi() {
        if (tuSo * mauSo < 0) {
            System.out.println("-" + Math.abs(tuSo) + "/" + Math.abs(mauSo));
        } else {
            System.out.println(Math.abs(tuSo) + "/" + Math.abs(mauSo));
        }
    }

    // Cong 2 phan so
    public PhanSo cong(PhanSo ps2) {
        int ts = tuSo * ps2.mauSo + ps2.tuSo * mauSo;
        int ms = mauSo * ps2.mauSo;
        return new PhanSo(ts, ms);
    }

    // Tru 2 phan so
    public PhanSo tru(PhanSo ps2) {
        int ts = tuSo * ps2.mauSo - ps2.tuSo * mauSo;
        int ms = mauSo * ps2.mauSo;
        return new PhanSo(ts, ms);
    }

    // Nhan 2 phan so
    public PhanSo nhan(PhanSo ps2) {
        int ts = tuSo * ps2.tuSo;
        int ms = mauSo * ps2.mauSo;
        return new PhanSo(ts, ms);
    }

    // Nghich dao phan so
    public void nghichDao() {
        int tg = tuSo;
        tuSo = mauSo;
        mauSo = tg;
    }

    // Chia 2 phan so
    public PhanSo chia(PhanSo ps2) {

        int tg = ps2.tuSo;
        ps2.tuSo = ps2.mauSo;
        ps2.mauSo = tg;

        int ts = tuSo * ps2.tuSo;
        int ms = mauSo * ps2.mauSo;
        return new PhanSo(ts, ms);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PhanSo ps1 = new PhanSo();
        PhanSo ps2 = new PhanSo();
        PhanSo psTong;
        PhanSo psThuong;
        PhanSo psHieu;
        PhanSo psTich;

        System.out.println("Nhap du lieu cho phan so 1:");
        ps1.nhapPS(sc);
        System.out.println("Nhap du lieu cho phan so 2:");
        ps2.nhapPS(sc);

        System.out.println("Phan so 1 vua nhap la:");
        ps1.hienThi();
        System.out.println("Phan so 2 vua nhap la:");
        ps2.hienThi();

        psTong = ps1.cong(ps2);
        psHieu = ps1.tru(ps2);
        psTich = ps1.chia(ps2);
        psThuong = ps1.nhan(ps2);

        System.out.println("Tong hai phan so la:");
        psTong.hienThi();
        System.out.println("Hieu hai phan so la:");
        psHieu.hienThi();
        System.out.println("Thuong hai phan so la:");
        psThuong.hienThi();
        System.out.println("Tich hai phan so la:");
        psTich.hienThi();
        sc.close();
    }
}
