import java.util.Scanner;

class Sum
{
    public static void main(String[] args) {
        float sum = 0, number;
        int n;
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Nhap vao so n:");
        n = scanner.nextInt();  
        for (int i = 1; i <= n; i++){
            System.out.println("Nhap vao so thuc:");
            number = scanner.nextFloat();
            if(number > 0)
                sum += number;
        }

        System.out.println("Tong so duong = " + sum);
    }
}