
public class SoyDecorator implements IAddonsDecorator{
    IBeverage beverage;

    SoyDecorator(IBeverage beverage){
        this.beverage = beverage;
    }
    public double getCost(){
        return beverage.getCost() + .75;
    }
    public String toString(){
        return beverage.toString() + " +Soy";
    }
}