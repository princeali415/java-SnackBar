package snackbarApp;

public class VendingMachine
{
    //intialize feilds
    private static int maxId = 0;
    private int id;
    private String name;

    //constructor
    public VendingMachine(String name)
    {
        maxId++;
        id = maxId;
        this.name = name;
    }

    //getters
    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    //setters
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString()
    {
        String tmpString = "Vending Machine name is " + name + " and has a id of " + id;
        return tmpString;
    }    
}