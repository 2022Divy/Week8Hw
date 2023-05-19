import java.util.Scanner;

public class Sum12 {
    //12. Write a programme to input any number and check if it is prime or not.

    public static void main(String[] args) {
        multi();

    }
    public static void multi(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number :");
        int z = sc.nextInt();

        boolean a = false;
        for (int i = 2; i <= z / 2; ++i) {

            if (z % i == 0) {
                a = true;
                break;
            }
        }

        if (!a)
            System.out.println(z + " is a prime number.");
        else
            System.out.println(z + " is not a prime number.");
    }
}




