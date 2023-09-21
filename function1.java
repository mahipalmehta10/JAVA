import java.util.*;
public class function1 {
    public static int addition(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int value = addition(a, b); //transferring the returned sum value of the function into an another variable
        System.out.println("SUM IS :"+ value);
        sc.close();
   } 
}
