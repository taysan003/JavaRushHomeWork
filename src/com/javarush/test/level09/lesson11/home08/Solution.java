package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
       ArrayList<int[]> mass = new ArrayList<int[]>();
        int [] l1 ={1,2,3,4,5};
        mass.add(l1);
        int[] l2 ={1,2,};
        mass.add(l2);
        int[] l3 ={1,2,3,4};
        mass.add(l3);
        int[] l4 ={1,2,3,4,5,6,7};
        mass.add(l4);
        int[] l5 ={};
        mass.add(l5);

        //напишите тут ваш код
        return mass;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
