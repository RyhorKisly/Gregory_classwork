package com.kisly.lesson_5.phone;

public class Main {
    public static void main(String[] args) {

            Phone Iphone = new Phone(8, "Iphone", 260);
            Phone Samsung = new Phone(10, "Samsung", 200);
            Phone Honor = new Phone(11, "Honor", 321);
            Iphone.print();
            Samsung.print();
            Honor.print();
            Phone[] phones = {Iphone, Samsung, Honor};



    }

}
