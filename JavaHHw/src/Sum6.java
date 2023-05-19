import java.util.Scanner;

public class Sum6 {

        //6. Write a program in Java to display the pattern like a triangle with a number.
        //For eg.
        //Input number of rows: 10

        public static void main(String[] args) {
                row();

        }

        public static void row() {
                int a, b, n;
                System.out.print("Input number of rows : ");
                Scanner in = new Scanner(System.in);
                n = in.nextInt();

                for (a = 1; a <= n; a++) {
                        for (b = 1; b <= a; b++)
                                System.out.print(b);

                        System.out.println("");
                }
        }
}


