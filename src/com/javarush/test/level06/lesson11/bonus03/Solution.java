package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[5];
        int min = list[0];
        int g =0;
        for (int i = 0; i < list.length; i++)
        {
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);

        }
        for(int i = list.length-1 ; i > 0 ; i--)
        {    for (int j = 0; j < list.length-1; j++)
            {
                if (list[j] > list[j + 1])
            {
                g = list[j];
                list[j] = list[j + 1];
                list[j + 1] = g;
            }
        }   }

        for (int i = 0; i < list.length; i++)
            System.out.println(list[i]);


        //напишите тут ваш код
    }
}
