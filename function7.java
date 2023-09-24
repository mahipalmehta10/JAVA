public class function7 {

    public static boolean isprime(int n){
        if(n==2){
          return true;
        }
        boolean isprime = true;
        for(int i=2;i<=Math.sqrt(n);i++){  // for more optimised approach otherwise simply n could also be checked but it will use duplicate values 
            if(n%i==0){
                isprime=false;
            }
        }
        return isprime;
    }
    public static void primeinrange(int n){
        for(int i=2;i<=n;i++){
            if(isprime(i)==true){
             System.out.print( i + " ");
            }
        }
    }
    public static void main(String[] args) {
    primeinrange(100);
    }
}
