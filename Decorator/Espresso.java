
public class Espresso implements IBeverage{
    private double cost;

    Espresso(){
        cost = 2.0;
    }
    public double getCost(){
        return cost;
    };
    public String toString(){
        return "An Espresso";
    };
}