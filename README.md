# Coffee Ordering System

This Java project provides a console-based interface for ordering coffee with various customizations. Users can choose from a menu of coffee options and add decorations like milk, sugar, vanilla, caramel, and cream. The system calculates the total cost of the order and displays the final receipt.

## Features

- Interactive console-based interface.
- Menu options for different types of coffee.
- Customizable with various decorations.
- Utilizes the Decorator design pattern for extensibility.

## Usage

1. Compile and run the `App.java` file.
2. Follow the prompts to select your coffee and add decorations.
3. Review the order and total cost.

## Coffee Menu

- (a) Americano ($3.00)
- (b) Cappuccino ($3.00)
- (c) Espresso ($2.50)
- (d) Latte ($3.50)

## Decorations

- (a) Milk ($0.50)
- (b) Sugar ($0.25)
- (c) Vanilla ($0.75)
- (d) Caramel ($0.50)
- (e) Cream ($0.75)

## Example

  Enter Your Order (a/b/c/d): b
  Enter Additional Decorations (You can choose multiple options): acd

  Would you like to order anything else? (y/N): n
  Order Placement is Successful!

  Cappuccino with Milk, Vanilla, Caramel
  Total Cost: $4.75
