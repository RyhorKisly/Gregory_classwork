package com.kisly.lesson_5.adress;

public class Address {

    private final String city;
    private final String country;
    private final String street;
    private final int house;

    public Address(String city, String country, String street, int house) {
        this.city = city;
        this.country = country;
        this.street = street;
        this.house = house;
    }

    public void print() {
        System.out.println("City: " + city + " Country: " + country + " Street: " + street + " house: " + house);
    }

    public static void main(String[] args) {

        Address minsk = new Address("Minsk", "Belarus", "Nalibokskaya", 8);
        Address moscow = new Address("Moscow", "Russia", "Petra", 14);
        Address warsaw = new Address("Warsaw", "Poland", "Temnaya", 45);

        minsk.print();
        moscow.print();
        warsaw.print();


        }

    }

}
