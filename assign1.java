import java.util.*;
public class assign1 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num;
    int choice;
    int evensum=0;
    int oddsum=0;
    do{
       System.out.println("enter the numbers");
       num=sc.nextInt();
       if(num%2==0){
        evensum+=num;
       }else{
        oddsum+=num;
    }
    System.out.println("do you wish to continue press 1 for yes and 0 for no");
    choice =sc.nextInt();
    sc.close();
}while(choice==1);

    System.out.println(evensum);
    System.out.println(oddsum);
}
}
