package com.javarush.test.level07.lesson06.task01;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        list.add("Вася");
        list.add("ПЕтя");
        list.add("Жора");
        list.add("Маша");
        list.add("Саша");
        int s =list.size();
        for (int i = 0; i <s; i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println(s);


    }
}
