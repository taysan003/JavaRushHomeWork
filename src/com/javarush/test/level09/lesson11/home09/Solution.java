package com.javarush.test.level09.lesson11.home09;

import java.util.*;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {

        Map<String,Cat> catMap = new HashMap<String, Cat>();

        catMap.put("Петя", new Cat("Петя"));
        catMap.put("Вася", new Cat("Петя"));
        catMap.put("Коля", new Cat("Петя"));
        catMap.put("Миша", new Cat("Петя"));
        catMap.put("Игорь", new Cat("Петя"));
        catMap.put("Сева", new Cat("Петя"));
        catMap.put("Русик", new Cat("Петя"));
        catMap.put("Сер", new Cat("Петя"));
        catMap.put("Маси", new Cat("Петя"));
        catMap.put("Фед", new Cat("Петя"));
        //напишите тут ваш код
        return catMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {

        Set<Cat> cats = new HashSet<Cat>();

        Iterator<Map.Entry<String, Cat>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {

            Map.Entry<String, Cat> pair = iterator.next();
            Cat p= pair.getValue();
            cats.add(p);
        }



        //напишите тут ваш код
        return cats;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
