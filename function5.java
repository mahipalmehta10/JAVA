public class function5 {
    public static int sum(int a,int b){
     return a+b;
    }
    public static int sum(int a,int b,int c){
     return a+b+c;
    }
    public static void main(String[] args) {
    int firstsum=sum(8, 9);
    int secondsum=sum(8, 9, 6);
    System.out.println("first sum is : "+ firstsum);
    System.out.println("second sum is : "+ secondsum);
    }
}
