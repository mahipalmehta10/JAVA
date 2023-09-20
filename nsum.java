import java.util.*;
public class nsum {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int value = sc.nextInt();
    int sum =0;
    int counter=0;
    while(counter<=value){
        sum=sum+counter;
        counter++;
    }
    System.out.println(sum);
    sc.close();
    }
}
