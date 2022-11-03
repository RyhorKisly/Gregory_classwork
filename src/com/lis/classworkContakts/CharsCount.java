package com.lis;

import java.util.HashMap;
import java.util.Map;

public class CharsCount {

    //Реализовать функцию подсчета количества разных символов в строке -
    //public Map<Character, Integer> getCharsCount(String s)
    //Пример: строка “baaccc” и результат: ‘b’ -1, ‘a’ - 2, ‘c’ - 3
    public static void main(String[] args) {
        String s = "I love java!";
        System.out.println(
                getCharsCount(s)
        );
    }

    public static Map<Character, Integer> getCharsCount(String s) {
        Map<Character, Integer> result = new HashMap<>();
        for (Character c : s.toCharArray()) {
            Integer tempCount = result.get(c);
            if (tempCount == null) {
                result.put(c, 1);
            } else {
                result.put(c, ++tempCount);
            }
        }
        return result;
    }
}
