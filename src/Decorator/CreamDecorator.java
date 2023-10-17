package Decorator;
import Coffee.Coffee;

public class CreamDecorator extends Decorator
{
    public CreamDecorator(Coffee decoratedCoffee)
    {
        super(decoratedCoffee);
        this.name = "Cream";
        this.price = 0.75;
    }
}
