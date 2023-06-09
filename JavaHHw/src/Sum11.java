public class Sum11 {
    //11. Even Digit Sum
    //Write a method named getEvenDigitSum with one parameter of type int called number.
    //The method should return the sum of the even digits within the number.
    //If the number is negative,the method should return -1 to indicate an invalid value.
    //EXAMPLE INPUT/OUTPUT:
    //* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
    //* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
    //* getEvenDigitSum(-22); → should return -1 since the number is negative

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(-22)); ;

    }
    public static int getEvenDigitSum(int number){
        int digit;
        int sum = 0;
        int p = -1;
        if(number<0){
            System.out.println("invalid number");
            return p;
        }
        while(number != 0)
        {
            digit = number % 10;

            if(digit % 2 == 0)
                sum = sum + digit;

            number = number / 10;

        }
        return sum;


    }



    }

