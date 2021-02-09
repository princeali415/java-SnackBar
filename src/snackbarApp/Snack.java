package snackbarApp;

public class Snack
{
    // intialize feilds(variables)
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineid;

    //constructor
    public Snack(String name, int quantity, double cost, int vendingMachineid)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost; 
        this.vendingMachineid = vendingMachineid;
    }

    // getters
    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public double getCost()
    {
        return cost;
    }

    public int getVendingMachineId()
    {
        return vendingMachineid;
    }

    // setters
    public void setName(String name)
    {
        this.name = name;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    // method: add quantity wehn given how many to add
    public void addToQuantity(int quantityToAdd)
    {
        this.quantity += quantityToAdd;
    }

    //method: buy snack when given how much to buy
    public void buySnack(int quantityToBuy)
    {
        this.quantity -= quantityToBuy;
    }

    //method: get total cost given a quantity
    public double totalCost(int quantity)
    {
        return (this.cost * quantity);
    }

    @Override
    public String toString()
    {
        String tmpString = "Snack name: " + name + "\n Available Quantity: " + quantity + "\n Unit cost: " + cost + "\n Vending Machine Id: " + vendingMachineid;
        return tmpString;
    }    
}