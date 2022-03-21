//package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/*
Нам повторы не нужны
*/

public class Solution1 {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();
        map.put("Krotov", "Krot");
        map.put("Krutov", "Krut");
        map.put("Ivanov", "Ivan");
        map.put("Kotov", "Kot");
        map.put("Krotov2", "Krot2");
        map.put("Krotov0", "Krot");
        map.put("Krotov3", "Krot3");
        map.put("Krotov8", "Krot");
        map.put("Krotov9", "Krot");
        map.put("Krotov4", "Krot4");
        return map ;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> s : copy.entrySet())
        {
            for (Map.Entry<String, String> s2 : copy.entrySet())
            {
                if(s.getValue().equals(s2.getValue()) && !s.getKey().equals(s2.getKey()))
                    removeItemFromMapByValue(map,s.getValue());
            }
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());

            }
        }
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        System.out.println(map);
        removeTheFirstNameDuplicates(map);
        System.out.println(map);
    }
}
