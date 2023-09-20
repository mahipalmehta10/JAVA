public class breaker {
  public static void main(String[] args) {
    for( int i=1;i<=6;i++){
      if (i==3){
         break;
      }
     System.out.println(i);
    }
    System.out.println("out of the loop");
  }
}
