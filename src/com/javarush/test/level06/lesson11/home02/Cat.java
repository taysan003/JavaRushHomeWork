package com.javarush.test.level06.lesson11.home02;

import java.util.ArrayList;

/* Статические коты
1. В классе Cat добавь public статическую переменную cats (ArrayList<Cat>).
2. Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется этот новый кот. Создать 10 объектов Cat.
3. Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.
*/

public class Cat {
    public Cat() {
    }
    //напишите тут ваш код
    public static ArrayList<Cat> cats = new ArrayList<Cat>();

    public static void main(String[] args) {
        //Создай тут 10 котов
       Cat c1 = new Cat();
        cats.add(c1);
        Cat c2 = new Cat();
        cats.add(c2);
        Cat c3 = new Cat();
        cats.add(c3);
        Cat c4 = new Cat();
        cats.add(c4);
        Cat c5 = new Cat();
        cats.add(c5);
        Cat c6 = new Cat();
        cats.add(c6);
        Cat c7 = new Cat();
        cats.add(c7);
        Cat c8 = new Cat();
        cats.add(c8);
        Cat c9 = new Cat();
        cats.add(c9);
        Cat c10 = new Cat();
        cats.add(c10);
        printCats();
    }

    public static  void printCats() {
        //Добавь свой код для пункта 3 тут
        for (Cat c: cats)
        {
            System.out.println(c);
        }

    }
}
