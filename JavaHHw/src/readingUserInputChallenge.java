import java.util.Scanner;

public class readingUserInputChallenge {
    public static void main(String[] args) {
        add();

    }
    public static void add(){
        Scanner sc = new Scanner(System.in);

        int a = 1;
        int sum = 0;

        while(a <= 10) {
            System.out.println("Enter number #" + a);

            boolean validateNumber = sc.hasNextInt();
            if(validateNumber) {
                int number = sc.nextInt();
                sum += number;
                a++;
            } else {
                System.out.println("Invalid number");
            }

            sc.nextLine();
        }
        System.out.println("Sum of all numbers = " + sum);

        sc.close();
    }

}
