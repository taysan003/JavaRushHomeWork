package com.javarush.test.level06.lesson08.task01;

/* Класс Cat и статическая переменная catCount
Создать статическую переменную int catCount в классе Cat. Создай конструктор [public Cat()], в котором увеличивай данную переменную на 1.
*/

public class Cat
{
    public Cat()
    {
        catCount++;
    }

    //напишите тут ваш код
    public static int catCount = 0;

}
