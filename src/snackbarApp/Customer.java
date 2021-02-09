package snackbarApp;

public class Customer
{
    // info about a customer (fields)
    private static int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;


    // state => setting a value for the feilds above
    public Customer(String name, double cashOnHand)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.cashOnHand = cashOnHand;
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

    public double getCashOnHand()
    {
        return cashOnHand;
    }

    // setters

    public void setName(String name)
    {
        this.name = name;
    }

    // add cash to cash on hand method

    public void addToCashOnHand(double cashToAdd)
    {
        this.cashOnHand += cashToAdd;
    }

    // buy snacks method given total cosat of snacks to be purchased
    public void buySnacks(double totalCostOfSnacks)
    {
        this.cashOnHand -= totalCostOfSnacks;
    }


    @Override
    public String toString()
    {
        String tmpString = "Customer: " + name + " has $" + cashOnHand;
        return tmpString;
    }    
}