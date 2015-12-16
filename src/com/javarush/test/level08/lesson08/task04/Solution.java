package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Ills", new Date("JUNE 1 1980"));
        map.put("Nvvv", new Date("JUNE 1 1980"));
        map.put("JJJJ", new Date("MARCH 1 1980"));
        map.put("TTTT", new Date("JUNE 1 1980"));
        map.put("Ujks", new Date("JUNE 1 1980"));
        map.put("YYY", new Date("SEPT 1 1980"));
        map.put("JKKKO", new Date("JUNE 1 1980"));
        map.put("HGT", new Date("OCTOBER 1 1980"));
        map.put("RREY", new Date("JUNE 1 1980"));


        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {

            Map.Entry<String, Date> pair = iterator.next();


            if(pair.getValue().getMonth()>4&&pair.getValue().getMonth()<8)
            iterator.remove();
        }

    }
}
