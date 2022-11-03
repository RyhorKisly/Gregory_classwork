package com.lis.phone;

public class Phone {
    private int number;
    private final String model;
    private final int weight;

    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
     public void print() {
        System.out.println("number: " + number + "model: " + model + "weight: " + weight);
     }

    public int getNumber() {
        return number;
    }
}
