public class one {

    public static void bintodec(int binno){
    int decno=0;
    int pow=0;
    while(binno>0){
    int lastnum= binno%10;
    decno = decno+ lastnum*(int)Math.pow(2, pow);
    pow++;
    binno=binno/10;
    }
    System.out.println(decno);
    }

    public static void main(String[] args) {
    bintodec(1000);
    }
} 

