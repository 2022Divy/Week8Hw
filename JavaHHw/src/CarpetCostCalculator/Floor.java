package CarpetCostCalculator;

public class Floor {
    //Carpet Cost Calculator
    //The Carpet Company has asked you to write an application that calculates the price of carpeting for
    //rectangular rooms. To calculate the price, you multiply the area of the floor (width times length) by
    //the price persquare meter of carpet. For example, the area of the floorthat is 12 meterslong and 10
    //meters wide is 120 square meters. To cover the floor with a carpet that costs $8 per square meter
    //would cost $960.
    //


    double width, length;
    public void floor(double width, double length){
        this.width=width;
        this.length=length;
        if (width<0 && length<0){
            this.width=0.0;
            this.length=0.0;
        }else {
            this.width=width;
            this.length=length;
        }
    }
    public double getArea(){
        return this.length* this.width;

    }
}
