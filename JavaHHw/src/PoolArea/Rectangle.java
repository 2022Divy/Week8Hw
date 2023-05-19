package PoolArea;

public class Rectangle {
    //In case the width parameter is lessthan 0 it needs to set the width field value to 0.
    //In case the length parameter islessthan 0 it needsto set the length field value to 0.
    //Write the following methods (instance methods):
    //● Method named getWidth without any parameters, it needsto return the value of the width
    //field.
    //● Method named getLength without any parameters, it needsto return the value ofthe length
    //field.
    //● Method named getArea without any parameters, it needsto return the calculated area
    //(width * length).
    private double width, length;
    public Rectangle(double width, double length){
        if ((width < 0) && (length < 0)){
            this.width = 0;
            this.length = 0;
        } //else if ((width < 0) && (length > 0)) {
           // this.width = 0;
           // this.length = length;
        //}  else if ((width > 0) && (length < 0)) {
         //   this.width = width;
        //    this.length = 0;
        //}  else {
        //    this.width = width;
         //   this.length = length;
        //}
    }
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    public double getArea(){
        return (width * length);
    }
}




