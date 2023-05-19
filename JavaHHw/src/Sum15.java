import java.util.Scanner;

public class Sum15 {
    //15. Display left angle triangle of * using nested for loops

    public static void main(String[] args) {
        put();

    }
    public static void put(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows = ");
        int v = sc.nextInt();

        System.out.println("Printing Right Angled Triangle Pattern of *");
        int p = 1, q ;

        do
        {
            q = 1 ;
            do
            {
                System.out.print("*");
            } while(++q <= p ) ;
            System.out.println();
        } while( ++p <= v );
    }


}
