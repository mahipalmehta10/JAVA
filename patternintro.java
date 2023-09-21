public class patternintro {
    public static void main(String[] args) {
        for(int lines=1;lines<=5;lines++){
            //only prints a single line
           for(int stars=1;stars<=lines;stars++){
               System.out.print("*");
           }
           //printing in the next line(to print next line)
           System.out.println();
        }
    }
}
