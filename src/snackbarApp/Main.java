package snackbarApp;

import java.text.DecimalFormat;

public class Main 
{
    private static void workingWithData()
    {
        System.out.println("Java snackbar program running...");
        System.out.println();

        // instantiate 2 customers
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        // System.out.println(jane);
        // System.out.println(bob);

        // instantiate 3 vending machines

        VendingMachine foodVendingMachine = new VendingMachine("Food");
        VendingMachine drinkVendingMachine = new VendingMachine("Drink");
        VendingMachine officeVendingMachine = new VendingMachine("Office");

        // System.out.println(foodVendingMachine);
        // System.out.println(drinkVendingMachine);
        // System.out.println(officeVendingMachine);

        // instantiate 5 snacks 
        //public Snack(String name, int quantity, double cost, int vendingMachineid)
        Snack chips = new Snack("Chips", 36, 1.75, foodVendingMachine.getId());
        Snack chocolateBar = new Snack("Chocalate Bar", 36, 1.00, foodVendingMachine.getId());
        Snack pretzel = new Snack("Pretzel", 30, 2.00, foodVendingMachine.getId());

        Snack soda = new Snack("Soda", 24, 2.50, drinkVendingMachine.getId());
        Snack water = new Snack("Water", 20, 2.75, drinkVendingMachine.getId());

        // System.out.println(chips);
        // System.out.println(chocolateBar);
        // System.out.println(pretzel);
        // System.out.println(soda);
        // System.out.println(water);

        // Processing

        // Jane buy's 3 units of soda
        jane.buySnacks(soda.totalCost(3));
        soda.buySnack(3);
        System.out.println("Jane cash on hand $" + jane.getCashOnHand());
        System.out.println("Quanitity of Soda is " + soda.getQuantity());
        System.out.println();

        // Jane buys 1 unit of Pretzels
        jane.buySnacks(pretzel.totalCost(1));
        pretzel.buySnack(1);
        System.out.println("Jane cash on hand $" + jane.getCashOnHand());
        System.out.println("Quanitity of Pretzils is " + pretzel.getQuantity());
        System.out.println();

        // Customer 2 (Bob) buys 2 of snack 4 (Soda).
        bob.buySnacks(soda.totalCost(2));
        soda.buySnack(2);
        System.out.println("Bob cash on hand $" + bob.getCashOnHand());
        System.out.println("Quanitity of Soda is " + soda.getQuantity());
        System.out.println();
        
        // Customer 1 (Jane) finds $10.
        jane.addToCashOnHand(10);
        System.out.println("Jane cash on hand $" + jane.getCashOnHand());
        System.out.println();

        // Customer 1 (Jane) buys 1 of snack 2 (Chocolate Bar).
        jane.buySnacks(chocolateBar.totalCost(1));
        chocolateBar.buySnack(1);
        System.out.println("Jane cash on hand $" + jane.getCashOnHand());
        System.out.println("Quanitity of Chocolate Bar is " + chocolateBar.getQuantity());
        System.out.println();

        // Add 12 more items to snack 3 (Pretzel).
        pretzel.addToQuantity(12);
        System.out.println("Quanitity of Pretzils is " + pretzel.getQuantity());
        System.out.println();

        // Customer 2 (Bob) buys 3 of snack 3 (Pretzel).
        bob.buySnacks(pretzel.totalCost(3));
        pretzel.buySnack(3);
        System.out.println("Bob cash on hand $" + bob.getCashOnHand());
        System.out.println("Quanitity of Pretzils is " + pretzel.getQuantity());
        System.out.println();

        /*
        STRECTH GOALS:
            1. Display each snack with:
                Name
                Vending Machine Name
                Quantity on hand
                Total cost of all of the quantities of this snack on hand

            2. Format all dollar amount like $1,234.56:
                Starts with a dollar sign
                comma separating group of 3 numbers
                rounded to the nearest cents, hundredths place
         */

        // 1. Display each snack with all params available for that snack

        System.out.println(chips);
        System.out.println();
        System.out.println(chocolateBar);
        System.out.println();
        System.out.println(pretzel);
        System.out.println();
        System.out.println(soda);
        System.out.println();
        System.out.println(water);
    
    }
    public static void main(String[] args) 
    {
        workingWithData();
    }

}