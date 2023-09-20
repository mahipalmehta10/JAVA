public class p1 {
    public static void main(String[] args) {
    int num =2025;
    int rev=0;
    while(num>0){
        int lastnum= num%10;
        rev = (rev*10)+lastnum;
        num=num/10;
    }
    System.out.print(rev);
}
} 
