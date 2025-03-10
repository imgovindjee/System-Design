package com.A.SOLID.S.SingleResponsibilityPrinciple.OneReasonToChange;

public class Marker {
    int year;
    int price;
    String name;
    String color;

//    CONSTRUCTOR
    public Marker(int year, int price, String name, String color) {
        this.year = year;
        this.price = price;
        this.name = name;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
