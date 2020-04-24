public class Driver{
    public static void main(String[] args){
        Espresso order1 = new Espresso();
        Coffee order2 = new Coffee();
        IAddonsDecorator order3 = new CaramelDecorator(new Coffee());
        IAddonsDecorator order4 = new SoyDecorator(new CaramelDecorator(new Espresso()));
        
        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);
        System.out.println(order4);
    }
}
