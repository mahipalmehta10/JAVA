public class one2 {

    public static int dectobin(int decnum){
    int rem=0;
    int binnum=0;
    int pow=0;
    while(decnum>0){
        rem=decnum%2;
        binnum=binnum+(rem*(int)Math.pow(10, pow));
        pow++;
        decnum=decnum/2;
    }
    return binnum;
    }
    public static void main(String[] args) {
    System.out.println(dectobin(8));  
    }
}
