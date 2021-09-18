import java.util.Scanner;
 
/**
 * @author 
 */
public class Bac2 {
    private static Scanner scanner = new Scanner(System.in);
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("Nhap a = ");
        float a = Bac2.scanner.nextFloat();
        System.out.print("Nhap b = ");
        float b = Bac2.scanner.nextFloat();
        System.out.print("Nhap c = ");
        float c = scanner.nextFloat();
        BaiTap1.giaiPTBac2(a, b, c);
    }
     
    public static void giaiPTBac2(float a, float b, float c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else {
                System.out.println("Phuong trinh co 1 nghiem: "
                        + "x = " + (-c / b));
            }
            return;
        }

        float delta = b*b - 4*a*c;
        float x1;
        float x2;

        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phuong trinh co 2 nghiem: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phuong trinh co nghiem kep: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phuong trinh vo nghiem!");
        }
    }
}
