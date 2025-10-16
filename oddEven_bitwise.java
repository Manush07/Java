import java.util.Scanner;

public class oddEven_bitwise {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = input.nextInt();

    if((n&1)==0){
      System.out.println("number is even");
    }
    else{
      System.out.println("number is odd");
    }

  input.close();
  }
}
