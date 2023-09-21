import java.util.*;
public class function2 {
    public static int multiply( int a,int b){
     int product=a*b;
     return product;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in );
    System.out.println("enter first number");
    int a=sc.nextInt();
    System.out.println("enter the second number");
    int b=sc.nextInt();
    int value =multiply(a, b);
    System.out.println("the product of the numbers is " + value);
    sc.close();   
    }
}
