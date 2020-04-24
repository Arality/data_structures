public class CaramelDecorator implements IAddonsDecorator{
    IBeverage beverage;

    CaramelDecorator(IBeverage beverage){
        this.beverage = beverage;
    }
    public double getCost(){
        return beverage.getCost() + .50;
    }
    public String toString(){
        return beverage.toString() + " +Caramel";
    }
}