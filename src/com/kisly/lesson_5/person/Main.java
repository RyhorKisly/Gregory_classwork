package com.kisly.lesson_5.person;

public class Main {
    public static void main(String[] args) {
        Person director = new Person("Sasha", 19, "man");
        Person manager = new Person("Anton", 22, "man");
        Person driver = new Person("Katia", 33, "woman");

        director.print();
        manager.print();
        driver.print();

        Person[] personal = {director, manager, driver};

        System.out.println(countBySex(personal, "man"));
        System.out.println(countBySex(personal, "woman"));

    }

    private static int countBySex(Person[] people, String sex) {
        int result = 0;
        for (Person person : people) {
            if (person.getSex().equals(sex)) {
                result++;
            }
        }
        return result;
    }


}
