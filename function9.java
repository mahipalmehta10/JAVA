public class function9 {

    public static void dectobin(int decnum){
    int rem=0;
    int mynum =decnum;
    int pow=0;
    int binnum=0;
    while(decnum>0){
     rem =decnum%2;
     binnum=binnum+rem*(int)Math.pow(10,pow);
     pow++;
     decnum=decnum/2;
    }
    System.out.println("binary form of "+ mynum + " = " + binnum);
    }
    public static void main(String[] args) {
    dectobin(8);
    }
}
