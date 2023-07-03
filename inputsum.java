import java.util.Scanner;
public class inputsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        //enter the first number
        System.out.println("enter the first number");
        int a=sc.nextInt();
        //enter the second number
        System.out.println("enter the second number");
        int b=sc.nextInt();
        //sum of two numbers
        sum=a+b;
        System.out.println(sum);
        sc.close();
    }
}
