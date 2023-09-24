public class function4 {

    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static int binomialcoeff(int n,int r){
        int a =factorial(n);
        int b =factorial(r);
        int c =factorial( n-r);
        int value = a/(b*c) ;
        return value;
    }
    public static void main(String[] args) {
    int answer = binomialcoeff(5, 3);
    System.out.println("the binomial coefficient is : " + answer );
    }
}
