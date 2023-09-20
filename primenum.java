import java.util.*;
public class primenum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        boolean isprime=true;
        if(num==2){
            System.out.println("prime no");
        }
        else{
        for(int i=2; i<=num-1;i++){
            if(num%i==0){
               isprime=false;
            }
        }
        }
          if (isprime==true){
            System.out.println("THE GIVEN NO IS PRIME");
          }
           else{
            System.out.println("THE GIVEN NO IS NOT PRIME");
           }
           sc.close();
        }
    }

