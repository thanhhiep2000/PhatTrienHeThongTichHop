import java.util.Scanner;
class SoNguyenTo
{
    public static void main(String args[])
    {
        int temp;
        boolean isPrime=true;
        Scanner scan= new Scanner(System.in);
        System.out.println("Nhap so kiem tra:");
        int num=scan.nextInt();
        scan.close();
        for(int i=2;i<=num/2;i++)
        {
            temp=num%i;
            if(temp==0)
            {
                isPrime=false;
                break;
            }
        }
        if(isPrime)
            System.out.println(num + " La so nguyen to!");
        else
            System.out.println(num + " Khong phai so nguyen to!");
    }
}