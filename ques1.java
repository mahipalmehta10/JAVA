import java.util.*;
public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        if (a>0){
            System.out.println("the number is positive");     
        }
        else if (a<0){
            System.out.println("entered number is negative");
        }
        sc.close();
    }
}
