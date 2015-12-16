package com.javarush.test.level08.lesson08.task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
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

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) throws IOException
    {
        //напишите тут ваш код

        int s = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {

            String value = pair.getValue();
            if(value.equals(name))
                s++;


        }
        return s;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya) throws IOException
    {
        //напишите тут ваш код

        int s = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {

            String key = pair.getKey();
            if(key.equals(familiya))
                s++;


        }
        return s;


    }
}
