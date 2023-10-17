import java.util.Scanner;
import Coffee.*;
import Decorator.*;

public class App
{
    public static void main(String[] args) throws Exception
    {
        String orderList = "";
        double totalCost = 0.0;

        while (true)
        {
            Scanner scanner = new Scanner(System.in);
        
            Coffee coffee = getCoffeeData(scanner);
            
            if (coffee == null)
            {
                System.out.println("Invalid Choice! Please Try again!");
                continue;
            }

            Coffee decoratatedCoffee = getDecoratedCoffee(scanner, coffee);
            
            orderList += decoratatedCoffee.getString();
            totalCost += decoratatedCoffee.getPrice();

            System.out.print("Would you like to order anything else? (y/N): ");
            String userChoice = scanner.nextLine().toLowerCase();
            if (userChoice.equals("y")) continue;
            
            System.out.println("\nOrder Placement is Successful!");
            System.out.println("------------------------------");
            System.out.println("--------------------");
            System.out.println(orderList + "\n");
            System.out.println("--------------------");
            System.out.println("Total Cost: $" + totalCost);
            System.out.println("--------------------\n");
            break;
        }
        
    }

    private static Coffee getCoffeeData(Scanner scanner)
    {
        displayCoffeeMenu();
        System.out.print("Enter Your Order (a/b/c/d): ");
        String userChoice = scanner.nextLine().toLowerCase();

        Coffee coffee;

        switch (userChoice)
        {
            case "a":
                coffee = new Americano();
                break;
            
            case "b":
                coffee = new Cappuccino();
                break;
            
            case "c":
                coffee = new Espresso();
                break;

            case "d":
                coffee = new Latte();
                break;

            default:
                coffee = null;
                break;
        }

        return coffee;
    }

    private static Coffee getDecoratedCoffee(Scanner scanner, Coffee coffee)
    {
        displayDecoratorMenu();
        System.out.print("Enter Additional Decorations (You can choose multiple options): ");
        String userChoice = scanner.nextLine().toLowerCase();

        Coffee decoratoredCoffee = coffee;

        for(int i = 0; i < userChoice.length(); i++)
        {
            switch (userChoice.charAt(i))
            {
                case 'a':
                    decoratoredCoffee = new MilkDecorator(decoratoredCoffee);
                    break;

                case 'b':
                    decoratoredCoffee = new SugarDecorator(decoratoredCoffee);
                    break;
                case 'c':
                    decoratoredCoffee = new VanillaDecorator(decoratoredCoffee);
                    break;
                case 'd':
                    decoratoredCoffee = new CaramelDecorator(decoratoredCoffee);
                    break;
                case 'e':
                    decoratoredCoffee = new CreamDecorator(decoratoredCoffee);
                    break;
                default:
                    continue;
            }
        }

        return decoratoredCoffee;
    }

    private static void displayDecoratorMenu()
    {
        System.out.println("\n-------------------");
        System.out.println("Decorations:");
        System.out.println("(a) Milk ($0.50)");
        System.out.println("(b) Sugar ($0.25)");
        System.out.println("(c) Vanilla ($0.75)");
        System.out.println("(d) Caramel ($0.50)");
        System.out.println("(e) Cream ($0.75)");
        System.out.println("-------------------");
    }
    private static void displayCoffeeMenu()
    {
        System.out.println("\n-----------------------");
        System.out.println("Coffee Shop Menu:");
        System.out.println("(a) Americano ($3.00)");
        System.out.println("(b) Cappuccino ($3.00)");
        System.out.println("(c) Espresso ($2.50)");
        System.out.println("(d) Latte ($3.50)");
        System.out.println("-----------------------");
    }
}
