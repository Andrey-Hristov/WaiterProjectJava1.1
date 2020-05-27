package com.company;

public class Dishes {

    private String dishType;
    private double dishPrice;
    private String dishName;

    public Dishes(String dishType, double dishPrice, String dishName) {
        this.dishType = dishType;
        this.dishPrice = dishPrice;
        this.dishName = dishName;
    }

    public String getDishType() {
        return dishType;
    }

    public double getDishPrice() {
        return dishPrice;
    }

    public String getDishName() {
        return dishName;
    }

    @Override
    public String toString () {
        return String.format(getDishName() + "  " + getDishType() + "  price: " + getDishPrice() + "\n");
    }
}
