public class function6 {

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
    public static void main(String[] args) {
    System.out.println(isprime(8));
    System.out.println(isprime(17));
    }
}
