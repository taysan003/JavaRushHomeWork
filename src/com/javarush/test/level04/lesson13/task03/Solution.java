package com.javarush.test.level04.lesson13.task03;

import java.io.*;

/* Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

        int i=0;
        for(i=1; i<=10; i++)
        {
            int j=0;
            for (j=1; j<i+1; j++)
            {

                System.out.print(8);

            }
            System.out.println();
        }

    }
}
