public class SimpleCalculator {

    double firstNumber;
    double secondNumber;

    public static void main(String[] args) {
        SimpleCalculator cal = new SimpleCalculator();
        cal.setFirstNumber(5.0);
        cal.setSecondNumber(4);
        System.out.println("add= " + cal.getAdditionResult());
        System.out.println("subtract= " + cal.getSubtractionResult());
        cal.setFirstNumber(5.25);
        cal.setSecondNumber(0);
        System.out.println("multiply= " + cal.getMultiplicationResult());
        System.out.println("divide= " + cal.getDivisionResult());
    }
    public double getFirstNumber(){
        return firstNumber;
    }

    public double getSecondNumber(){
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult(){
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult(){
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult(){
        return firstNumber * secondNumber;
    }

    public double getDivisionResult () {

        if (secondNumber == 0) {

            return this.secondNumber = 0;

        } else {

            return firstNumber / secondNumber;

        }

    }
}
