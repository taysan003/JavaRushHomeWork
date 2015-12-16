package com.javarush.test.level05.lesson05.task05;

/* Провести три боя  попарно между котами
Создать три кота используя класс Cat.
Провести три боя попарно между котами.
Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
Результат каждого боя вывести на экран.
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat1 = new Cat("Vaska", 10, 150, 2);
        Cat cat2 = new Cat("Petka", 12, 70, 1);
        Cat cat3 = new Cat("Kolka", 13, 120, 3);
        boolean f1 = cat1.fight(cat2);
        if (f1==true)
            System.out.println("Win Ca1");
        else
            System.out.println("Win Cat2");
        boolean f2 = cat1.fight(cat2);
        if (f2==true)
            System.out.println("Win Ca1");
        else
            System.out.println("Win Cat3");
        boolean f3 = cat2.fight(cat3);
        if (f3==true)
            System.out.println("Win Ca2");
        else
            System.out.println("Win Cat3");



    }

    public static class Cat {

        public static int count = 0;
        public static int fightCount = 0;

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            count++;

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            fightCount++;

            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}