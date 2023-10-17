package Decorator;
import Coffee.Coffee;

public class MilkDecorator extends Decorator
{
    public MilkDecorator(Coffee decoratedCoffee)
    {
        super(decoratedCoffee);
        this.name = "Milk";
        this.price = 0.50;
    }
}
