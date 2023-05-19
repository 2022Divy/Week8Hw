package CarpetCostCalculator;

public class Carpet {

    //In case the cost parameter islessthan 0 it needsto set the cost field value to 0.


    double cost;

    public Carpet(double cost){
        if (cost<0){
            this.cost=0.0;
        }else {
            this.cost=cost;
        }
    }

    public double getCost(){
        return this.cost;
    }
}
