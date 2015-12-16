package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String n = reader.readLine();
        int n1 = Integer.parseInt(n);
        String m = reader.readLine();
        int m1 = Integer.parseInt(m);
        String d = reader.readLine();
        int d1 = Integer.parseInt(d);
        if(n1>m1&&n1<d1||n1<m1&&n1>d1)
            System.out.println(n1);
        if (m1>n1&&m1<d1||m1<n1&&m1>d1)
        {
            System.out.println(m1);
        }
        if (d1>n1&&d1<m1||d1<n1&&d1>m1)
            System.out.println(d1);

        }

    }

