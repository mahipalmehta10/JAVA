public class function3 {
    
    public static int factorial(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
    //int value=factorial(4); the other way to write the below step
    System.out.println(factorial(4));
    }
}
