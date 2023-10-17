package Decorator;
import Coffee.Coffee;

public class VanillaDecorator extends Decorator
{
    public VanillaDecorator(Coffee decoratedCoffee)
    {
        super(decoratedCoffee);
        this.name = "Vanilla";
        this.price = 0.75;
    }
}
