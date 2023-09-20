import java.util.*;
public class assignment1 {
    public static void main(String[] args) {
    int num;
    int evensum=0;
    int oddsum=0;
    for(int i=1;i<=5;i++){
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the numbers");
    num=sc.nextInt(); 
    if(num%2==0){
        evensum+=num; }
    else
    {
        oddsum+=num;
    }

}
System.out.println("sum of even number"+evensum);
System.out.println("sum of odd number"+oddsum);
}
}


