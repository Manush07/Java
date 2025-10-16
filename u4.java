import java.util.Scanner;

public class u4 {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    // System.out.println("Enter first number ");
    // int a = input.nextInt();

    // System.out.println("Enter second number ");
    // int b = input.nextInt();

    // int temp;
    // System.out.printf("a=%d b=%d \n",a,b);
    // temp = a;
    // a=b;

    // b=temp;
    // System.out.printf("a=%d b=%d",a,b);

    // int x = 1;
    // float y=6;
    // System.out.println(x*y);

    // //Challenge 8

    // System.out.print("Enter a float value ");
    // float a = input.nextFloat();

    // System.out.print("Enter naother float value ");
    // float b = input.nextFloat();

    // // float p= a*b;
    // System.out.printf("\n Product of those two numbers are %f",a+b);

    //Challenge 14

    // System.out.println("Enter the temp in Farenheit");
    // float F = input.nextFloat();
    
    // System.out.printf("%.2fF = %.2fC",F,((F-32)*10/18));

    // System.out.println("Welcome to Results Section");

    // System.out.print("Please Enter your age ");
    // int pert=input.nextInt();

    // if(pert<13){
    //   System.out.println("You are a child");
    // }
    // else if (pert < 20){
    //   System.out.println("You are a teenager");
    // }
    // else if(pert < 60){
    //   System.out.println("You are an adult");
    // }
    // else{
    //   System.out.println("You are a senior citizen");
    // }

    //Left Shift : num x 2^n
    long x = 1 << 5;
    System.out.println(x);
    
    input.close();
  }
}