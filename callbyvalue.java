public class callbyvalue {
    public static void swap(int a,int b){
        int temp=a; //temp ke andar a ki value gayi a is now empty
        a=b; // a ke andar b ki value gayi
        b=temp; // b ke andar gayi temp ki value
        System.out.println("a is :"+a);
        System.out.println("b is :"+b);
    }
    public static void main(String[] args) {
        int a=5;
        int b=10;
        swap(a, b);
    }
}
