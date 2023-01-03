package com.lis;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class DataTraining {

    static LocalDate birthDate = LocalDate.of(2020, 3, 12);

    public static void main(String[] args) {

//        Date current = new Date();
//        System.out.println(current);
//        Date myBirthDay = new Date(93, 7, 13, 6, 30, 00);
//        System.out.println(myBirthDay);
//        long time = current.getTime();
//        System.out.println(time);


//        Calendar current = Calendar.getInstance();
//        Calendar myBirthDay = new GregorianCalendar(1993, 07, 13, 06, 30, 00);
//        System.out.println(current.getTime());
//        System.out.println(myBirthDay.getTime());


//        LocalDate current = LocalDate.now();
//        System.out.println("Дата в моей зоне: " + current);
////        Список имен всех часовых поясов (time zone) можно найти в интернете.
//        ZoneId timeZone = ZoneId.of("Asia/Shanghai");
//        LocalDate currentInShanghai = LocalDate.now(timeZone);
//        System.out.println("Дата в шанхае: " + currentInShanghai);
//        LocalDate myBirthDay = LocalDate.of(1993, 8, 13);
//        System.out.println("Мой день рождения: " + myBirthDay);
//        LocalDate myBirthDayByDay = LocalDate.ofYearDay(1993, 225);
//        System.out.println("День моего рождения: " + myBirthDayByDay.getDayOfYear());
//        LocalDate birthday = LocalDate.of(2019, 2, 28);
//        LocalDate current2 = LocalDate.ofEpochDay(18181);
//        System.out.println(current2);


//        System.out.println(getDayOfWeek(birthDate));

    }

    static String getDayOfWeek(LocalDate date) {
        return date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("ru"));
    }

}
