package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String name;
        Integer age;
        Boolean sex;
        Integer weight;
        Integer high;
        Boolean brak;

       public Human()
        {

        }

        public Human(String name, String age, Boolean sex, Integer weight, Integer high, Boolean brak)
        {

            this.name = name;
            this.age = Integer.valueOf(age);
            this.sex = sex;
            this.weight = weight;
            this.high = high;
            this.brak = brak;
        }
        public Human(String name, String age, Boolean sex, String weight, Integer high, Boolean brak)
        {

            this.name = name;
            this.age = Integer.valueOf(age);
            this.sex = sex;
            this.weight = Integer.valueOf(weight);
            this.high = high;
            this.brak = brak;
        }
        public Human(String name, String age, Boolean sex, String weight, String high, Boolean brak)
        {

            this.name = name;
            this.age = Integer.valueOf(age);
            this.sex = sex;
            this.weight = Integer.valueOf(weight);
            this.high = Integer.valueOf(high);
            this.brak = brak;
        }

        public Human(String name, Integer age, Boolean sex, Integer weight, Integer high, Boolean brak)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.high = high;
            this.brak = brak;
        }

        public Human(String name, Integer age, Boolean sex, Integer weight, Integer high)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.high = high;
        }

        public Human(String name, Integer age, Boolean sex, Integer weight)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
        }

        public Human(String name, Integer age, Boolean sex)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, Integer age)
        {
            this.name = name;
            this.age = age;
        }

        public Human(String name)
        {
            this.name = name;
        }


        //напишите тут ваши переменные и конструкторы
    }
}
