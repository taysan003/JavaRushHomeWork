package com.javarush.test.level04.lesson13.task02;

import java.io.*;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        int n1 = Integer.parseInt(n);
        String m = reader.readLine();
        int m2 = Integer.parseInt(m);
        int i=0;
        for(i=1; i<=n1; i++)
        {
            int j=0;
            for (j=1; j<=m2; j++)
            {
                System.out.print(8);

            }
            System.out.println();
        }

    }
}
