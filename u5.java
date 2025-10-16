import java.util.Scanner;

public class u5 {

  public static int sum(int a,int b){
    return a+b ;
  }

  public static int inputData(){
    Scanner input = new Scanner(System.in);

    System.out.println("Hello user");
    System.out.print("Enter two number: ");
    int x = input.nextInt() , y=input.nextInt();
    System.out.println(y);
    input.close();

    return x;
  }

  public static int fact(int n){
    int p=1;
    while(n>0){
      p=p*n;
      n--;
    }
    return p;
  }

  public static int LCM(int a,int b){
    int gcd=0;
    for(int i=1;i<=a;i++){
      if(a%i == 0 && b%i==0 ){
        gcd=i;
      }
    }
    return (a*b)/gcd;
  }

  public static void main(String[] args){

    Scanner input = new Scanner(System.in);


    // "/** */" it is java document comment

    //while loop

    // int i=1; // initialization
    // while(i<=10000){ // condition
    //   System.out.println("hello"); //actual work
    //   i++; // updation
    // }

    // Functions/Methods
    // System.out.print("the sum of two numbers is "+sum(2,3));
    // int num =inputData();
    // System.out.print("Your number is "+num);

    //CHALLENGES

    //Q1: Write a function that calculates the factorial of a given number.
    // System.out.print("Enter the number whose factorial you want to know");
    // int n= input.nextInt();
    // System.out.printf("The fact of %d is %d.",n,fact(n)); 

    //Q2: LCM of 2 numbers
    System.out.println("Enter two number whose LCM you want to calculate: ");
    int x = input.nextInt() , y = input.nextInt();
    System.out.printf("The LCM of %d and %d is %d",x,y,LCM(x,y));
  

    input.close();
  }
}
