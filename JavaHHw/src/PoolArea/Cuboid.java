package PoolArea;

import java.awt.Rectangle;

public class Cuboid extends Rectangle {
    //The class needsto have one constructor with three parameters width, length, and height all of type
    //double. It needsto call the parent constructor and initialize a height field.
    //In case the height parameter islessthan 0 it needsto set the height field value to 0.
    //Write the following methods (instance methods):
    //● Method named getHeight without any parameters, it needsto return the value of height
    //field.
    //● Method named getVolume without any parameters, it needsto return the calculated volume.
    //To calculate volume, multiply the area with height.
    private double height;

    public Cuboid(double width, double length, double height){
        super();
        if(height < 0){
            this.height = 0;
        }else{
            this.height = height;
        }
    }

    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return getVolume();

         }

}
