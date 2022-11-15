package com.techelevator.view;

public class Items {
    private String slotId;
    private String name;
    private double price;
    private String typeOfItem;
    private int numberOfItemsLeft = 5;


    public Items(String slotId, String name, double price) {
        this.slotId = slotId;
        this.name = name;
        this.price = price;
    }

   // public abstract String printout();

    public String getSlotId() {
        return slotId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfItemsLeft() {
        return numberOfItemsLeft;
    }

    public String getTypeOfItem() {
        return typeOfItem;
    }
}
