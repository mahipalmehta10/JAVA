public class primeno {
   public static void main(String[] args) {
    int i;
    int n=11;
    for(i=2;i<=n-1;i++);
    {
        if(n%i==0)
        {
            System.out.println(n+" " +"is not prime");
        }
        else
        {
           System.out.println(n+"is  prime"); 
        }

    }
   }
}
