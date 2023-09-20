import java.util.*;
public class printn {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int value =sc.nextInt();
    int counter=1;
    while(counter<=value){
        System.out.print(counter + " ");
        counter++;
    }
    sc.close();
}
}
