import java.util.*;
public class taxcalculator {
    public static void main(String[] args) 
    {   
        int tax;
        Scanner sc =new Scanner(System.in);
        int income=sc.nextInt();
        
        if(income>=1000000){
            tax= (int) (income*0.3);    
        }
        else if (income>=500000 && income <=1000000){
            tax =(int) (income*0.2);
        }
        else{
           tax =0;
        }
        System.out.println("tax payble is : " + tax);
        sc.close();
    }
    
}
