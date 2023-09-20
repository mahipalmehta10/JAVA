import java.util.*;
public class breakques {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     while(true){
     System.out.println("enter number");
     int num=sc.nextInt();
     if(num%10==0){
        break;
     }
     System.out.println(num);
     }  
     sc.close();
    }
}
