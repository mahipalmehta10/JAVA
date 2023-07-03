import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        //using the scanner class
        Scanner sc = new Scanner(System.in);
        int a,b,product;
        //taking the input of a and b from the user
        System.out.println("enter the first number");
        a=sc.nextInt();
        System.out.println("enter the second number");
        b=sc.nextInt();
        //calculating the product and displaying it
        product=a*b;
        System.out.println("product is:"+ product); 
        sc.close();    
    }
    
}
