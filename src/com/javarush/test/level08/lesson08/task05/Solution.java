package com.javarush.test.level08.lesson08.task05;

import java.util.*;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        Map<String,String> nf = new HashMap<String, String>();
        {
            nf.put("Иванов", "Иван");
            nf.put("Петров", "Сергей");
            nf.put("Сидоров", "Иван");
            nf.put("Сергеев", "Петя");
            nf.put("Шпаков", "Иван");
            nf.put("Васильев", "Коля");
            nf.put("Дупаков", "Коля");
            nf.put("Пиздаков", "Иван");
            nf.put("Матюков", "Дурак");
            nf.put("Мудаков", "Иван");
        }
        return (HashMap<String, String>) nf;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (String value : copy.values())
            if (Collections.frequency(copy.values(), value) > 1)
                removeItemFromMapByValue(map, value);

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
