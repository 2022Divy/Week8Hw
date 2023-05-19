package CarpetCostCalculator;

public class Calculator {

    Floor floor;
    Carpet carpet;
    public Calculator(Floor floor, Carpet carpet){

        //    public int TotalCost(){
        //        return this.costperSq* RD.Area();

        this.floor=floor;
        this.carpet=carpet;
    }
    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();

    }

}
