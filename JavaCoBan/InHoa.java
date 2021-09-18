import java.util.Scanner;
class InHoa {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String message;
    System.out.println("\n\nNhap vao chuoi: ");
    message = sc.nextLine();
    char[] charArray = message.toCharArray();
    for(int i = 0; i < charArray.length; i++) {
      if(charArray[i] >= 97 && charArray[i] <= 122){
        charArray[i] -= 32;
      }
    }
    message = String.valueOf(charArray);
    System.out.println("In hoa: \n" + message);
  }
}