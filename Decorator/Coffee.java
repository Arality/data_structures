public class Coffee implements IBeverage{
    private double cost;

    Coffee(){
        cost = 1.0;
    }
    public double getCost(){
        return cost;
    };
    public String toString(){
        return "A Coffee";
    };
}
