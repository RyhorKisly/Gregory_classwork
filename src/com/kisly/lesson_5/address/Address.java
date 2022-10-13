package com.kisly.lesson_5.address;

public class Address {

    private String city;
    private String country;
    private String street;
    private int house;

    public Address(String city, String country, String street, int house) {
        this.city = city;
        this.country = country;
        this.street = street;
        this.house = house;
    }

    public String getCity() {
        return city;
    }

    public void print() {
        System.out.println("City: " + city + "; Country: " + country + "; Street: " + street + "; house: " + house);
    }

    public static Address[] searchCity(Address[] address, String city) {
        for (Address addresses : address) {
            if (addresses.getCity().equalsIgnoreCase(city)) {
                return address;
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

        System.out.println(searchCity(cities,"Minsk"));

    }

}