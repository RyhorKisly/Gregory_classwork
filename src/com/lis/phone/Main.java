package com.lis.phone;

import com.lis.phone.Phone;

public class Main {
    public static void main(String[] args) {
        Phone nokia = new Phone(10, "3310", 10500);
        Phone samsung = new Phone(15, "tab", 1800);
        Phone simens = new Phone(8, "relax", 190);

        nokia.print();
        simens.print();
        samsung.print();

        Phone[] phones = {nokia , samsung , simens};
        for (int i = 0; i < phones.length ; i++) {
            if (phones[i].getNumber() == 15){
                System.out.println(i);
            }

        }
    }

}
