package com.kisly.lesson_5.address;

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
        System.out.println("City: " + city + "; Country: " + country + "; Street: " + street + "; house: " + house);
    }

    public String getCity() {
        return city;
    }

    public static String searchCity(Address[] addresses, String city) {
        for (Address address : addresses) {
            if (address.getCity().equalsIgnoreCase(city)) {
                return city;
            }
        }
        return null;
    }


    public static void main(String[] args) {

        Address minsk = new Address("Minsk", "Belarus", "Sun", 8);
        Address moscow = new Address("Moscow", "Russia", "Petra", 14);
        Address warsaw = new Address("Warsaw", "Poland", "Shadow", 45);

        minsk.print();
        moscow.print();
        warsaw.print();

        Address[] cities = {minsk, moscow, warsaw};

        System.out.println(searchCity(cities, "Minsk"));


    }

}