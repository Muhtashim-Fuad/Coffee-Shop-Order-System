package Decorator;

import Coffee.Coffee;

public class SugarDecorator extends Decorator
{
    public SugarDecorator(Coffee decoratedCoffee)
    {
        super(decoratedCoffee);
        this.name = "Extra Sugar";
        this.price = 0.25;
    }
}
