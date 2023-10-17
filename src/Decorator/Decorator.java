package Decorator;
import Coffee.Coffee;

public class Decorator extends Coffee
{
    Coffee decoratedCoffee;

    public Decorator(Coffee decoratedCoffee)
    {
        this.decoratedCoffee = decoratedCoffee;
    }

    public String getString()
    {
        return decoratedCoffee.getString() + "\n + " + this.name + " $" + price;
    }

    public double getPrice()
    {
        return this.price + decoratedCoffee.getPrice();
    }
}
