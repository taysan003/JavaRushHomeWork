package com.javarush.test.level08.lesson08.task02;

import org.omg.CORBA.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        //напишите тут ваш код
        Set<Integer> setI = new HashSet<Integer>();
        for (int i = 0; i <20; i++)
        {
            setI.add(i);
        }
       return (HashSet<Integer>) setI;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        //напишите тут ваш код
        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext())
        {
            int s=iterator.next();

            if(s>10)
                iterator.remove();

        }
        return (HashSet<Integer>) set;

    }
}
