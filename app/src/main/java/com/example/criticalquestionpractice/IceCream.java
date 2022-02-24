package com.example.criticalquestionpractice;

public class IceCream {
    private String flavor;
    private String toppings;
    private String container;
    private String name;

    public IceCream(String flavor, String toppings, String container, String name)
    {
        this.flavor = flavor;
        this.toppings = toppings;
        this.container = container;
        this.name = name;
    }
    public String getFlavor()
    {
        return flavor;
    }
    public String getToppings()
    {
        if(toppings.equalsIgnoreCase("both"))
            return "both";
        else
            return toppings;
    }
    public String getContainer()
    {
        return container;
    }
    public String toString()
    {
        return name;
    }
}
