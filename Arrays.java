import java.util.Scanner;
public class Arrays {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("How many numbers do you want to enter?");
    int size = input.nextInt();

    int sum=0;
    int[] myNum = new int[size];

    for(int i=0;i<size;i++){
      System.out.print("\nEnter the number: ");
      myNum[i]=input.nextInt();
    }

    for(int num : myNum){
      sum+=num;
    }

    float avg = (float) sum/size;
    System.out.printf("The sum of lsit of number is %d and its avg is %.2f",sum,avg);

    input.close();
  }
  
}
