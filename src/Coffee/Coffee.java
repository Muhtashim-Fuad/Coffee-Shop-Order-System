package Coffee;

public abstract class Coffee
{
    protected String name;
    protected double price;

    public String getName() { return name; }
    public double getPrice() { return price; }

    public String getString()
    {
        return "\n" + name + " $" + price;
    }
}
