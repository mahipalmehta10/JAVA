import java.util.*;
public class factorial {
    public static void main(String[] args) {
    int fact =1;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number whose factorial you want");
    int num =sc.nextInt();
    for(int i=1;i<=num;i++){
        fact=fact*i;
    }
    sc.close();
    System.out.println(fact);    
    }
}
