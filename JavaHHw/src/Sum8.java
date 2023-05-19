import java.util.Scanner;

public class Sum8 {
    //8. Display right angle triangle of @ using nested for loops

    public static void main(String[] args) {
        has();

    }

        public static void has(){


    		Scanner sc = new Scanner(System.in);

    		System.out.print("Enter number of Rows = ");
    		int a = sc.nextInt();

    		System.out.println("Printing Right Angled Triangle Pattern of @");
    		int m = 1, n ;

    		do
    		{
    			n = 1 ;
    			do
    			{
    				System.out.print("@");
    			} while(++n <= m ) ;
    			System.out.println();
    	} while( ++m <= a );
    	}
    }


