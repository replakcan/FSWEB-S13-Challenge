package org.example.enums;

public enum Plan {
    BASIC("Alper", 60);

    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    Plan(String name, int price){
        this.name = name;
        this. price = price;
    }

    @Override
    public String toString() {
        return "Plan{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}