package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;
import java.util.Collections;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        ArrayList<String> []lists = new ArrayList[3];
        lists[0] =new ArrayList<String>();
        lists[1] =new ArrayList<String>();
        lists[2] =new ArrayList<String>();
        Collections.addAll(lists[0],"asasas","asdasdasd");
        Collections.addAll(lists[1],"asasas","asdasdasd");
        Collections.addAll(lists[2],"asasas","asdasdasd");

        //напишите тут ваш код

        return lists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}