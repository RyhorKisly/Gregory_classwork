package com.kisly.lesson_5.day;

public enum Day {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private final int dayNumber;

    Day(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public static int getNumberByName(String name) {
        for (Day day : values()) {
            if (day.name().equalsIgnoreCase(name)) {
                return day.dayNumber;
            }
        }
        return -1;
    }

    public static String getDayNameByNumber(int number) {
        for (Day day : values()) {
            if (day.dayNumber == number) {
                return day.name();
            }
        }
        return null;
    }

    public static void main(String[] args) {

        System.out.println(getNumberByName("SATURDAY"));
        System.out.println(getDayNameByNumber(3));

    }

}
