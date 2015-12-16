package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: маму, папу, сына, дочь, бабушку(мамина мама) и дедушку(папин папа).
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("дедушка ");
        String granFutherName = reader.readLine();
        System.out.println("бабушка ");
        String granMotherName = reader.readLine();
        System.out.println("папа ");
        String fatherName = reader.readLine();
        System.out.println("мама ");
        String motherName = reader.readLine();
        System.out.println("сын ");
        String sonName = reader.readLine();
        System.out.println("дочь ");
        String daughterName = reader.readLine();

        Cat catMother = new Cat(motherName);

        Cat catFather = new Cat(fatherName);

        Cat catDaughter = new Cat(daughterName, catFather, catMother);

        Cat catSon = new Cat(sonName, catFather, catMother);

        Cat catGranMother = new Cat("дедушка "+granMotherName, catMother);
        Cat catGranFuther = new Cat("бабушка "+granFutherName, catFather);


        System.out.println(catGranFuther);
        System.out.println(catGranMother);
        System.out.println(catFather);
        System.out.println("мать "+catMother);
        System.out.println("сын "+catSon);
        System.out.println("дочь "+catDaughter);

    }




    public static class Cat
    {
        private String name;
        private Cat parent;
        private Cat parent2;
        private Cat parent3;

        Cat(String name)
        {

            this.name = name;
        }

        Cat(String name, Cat parent)
        {
            this.name = name;
            this.parent = parent;
        }
        Cat(String name, Cat parent, Cat parent2)
        {
            this.name = name;
            this.parent = parent;
            this.parent2 = parent2;
        }
        Cat(String name, Cat parent, Cat parent2, Cat parent3)
        {
            this.name = name;
            this.parent = parent;
            this.parent2 = parent2;
            this.parent3 = parent3;
        }
        @Override
        public String toString()
        {
           if (parent == null)
                return "Cat name is " + name + ", no mother ";
            else
               return "Cat name is " + name + ", mother is " + parent.name;}
    }

}
