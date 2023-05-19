import java.util.Scanner;

public class MwQ1 {
    static boolean Y,N;
    public static void main(String[] args) {
        total();

    }
    public static void total(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 number :");
        int a = sc.nextInt();

        System.out.println("Enter 2 number :");
        int b = sc.nextInt();

        System.out.println("Enter Symbol(+,-,/,*) :");
        String meth = sc.next();

        if (meth.equals("+")){
            int sum = a+b;
            System.out.println("Addition is :"+sum);
        } else if (meth.equals("-")) {
            int sub = b-a;
            System.out.println("Subtraction is :"+sub);

        } else if (meth.equals("*")) {
            int mult = a * b;
            System.out.println("Subtraction is :" + mult);
        } else if (meth.equals("/")) {
            float div = a / b;
            System.out.println("Subtraction is :" + div);
        } else {
            System.out.println("Please enter valid symbol");
        }

        System.out.println("would you like to do more calculation Please enter Y or N: ");
        while (Y){
            System.out.println("Enter First Number");

        }
        while (N){
            break;
        }


    }

}
