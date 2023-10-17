package Decorator;
import Coffee.Coffee;

public class CaramelDecorator extends Decorator
{
    public CaramelDecorator(Coffee decoratedCoffee)
    {
        super(decoratedCoffee);
        this.name = "Caramel";
        this.price = 0.50;
    }
}
