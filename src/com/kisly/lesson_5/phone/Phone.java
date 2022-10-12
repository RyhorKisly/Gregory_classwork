package com.kisly.lesson_5.phone;

public class Phone {

    private int number;
    private final String model;
    private final int weight;

    public Phone (int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void print() {
        System.out.println("number: " + number + " model: " + model + " weight: " + weight);
    }



    public static void main(String[] args) {

        Phone phone = new Phone(8, "Iphone", 260);
        Phone phone2 = new Phone(10, "Samsung", 200);
        Phone phone3 = new Phone(11, "Honor", 321);

    }

}
