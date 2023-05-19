import java.util.Scanner;

public class Sum7 {
    //7. First And Last Digit Sum
    //Write a method named sumFirstAndLastDigit with one parameter of type int called number.
    //The method needsto find the first and the last digit of the parameter number passed to the method,
    //using a loop and return the sum of the first and the last digit of that number.
    //If the number is negative then the method needsto return -1 to indicate an invalid value.

    public static void main(String[] args) {
        Sum7 z = new Sum7();
        z.sumFirstAndLastDigit();
    }

    public void sumFirstAndLastDigit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int number = sc.nextInt();

        int a = 0;
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        while (number>0){
            if (number < 0){
                System.out.println("Invalid Number");
            } else if (number >0 && number < 10) {
                System.out.println(number);

            } else if (number>=10 && number <100) {
                a = number % 10;
                num1 = number/10;
                sum = a + num1;

                System.out.println(sum);
            }else if (number>=100 && number <999) {
                a = number % 10;
                num1 = number/100;
                sum = a + num1;

                System.out.println(sum);
            }
            break;
        }
    }
}
