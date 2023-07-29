import java.util.*;
public class greatest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>=b && a>=c){
            System.out.println("the greatest is :" + a);
        }
        else if(b>=c){
            System.out.println("the largest is :" + b);
        }
        else{
            System.out.println("the largest is :" + c);
        }
      sc.close();
    }
}
