package com.lis.classworkContakts;

import java.util.HashMap;
import java.util.Map;

public class ListTasks {

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 2, 1, 1, 10, 6, 3, 3};
        String[] arrayStrings = {"a", "bb", "A", "a"};
        System.out.println(
                arrayToMap(array)
        );
        // 1=3// 2=2// 3=3// 4=1// 10=1// 6=1
        System.out.println(
                arrayToMap(arrayStrings)
        );
        // a=2 // bb=1 // A=1
    }

    // Напишите метод, который получает на вход массив элементов типа
    // К (Generic) и возвращает Map<K, Integer>, где K — значение
    // из массива, а Integer — количество вхождений в массив.
    public static <K> Map<K, Integer> arrayToMap(K[] ks) {
        Map<K, Integer> result = new HashMap<>();
        for (K element: ks) {
            Integer tempCount = result.get(element);
            if(tempCount == null) {
                result.put(element, 1);
            } else {
                result.put(element, ++tempCount);
            }
        }
        return result;
    }

}
