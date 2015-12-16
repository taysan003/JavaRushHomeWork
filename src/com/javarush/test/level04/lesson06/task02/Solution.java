package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String n = reader.readLine();
        int na1 = Integer.parseInt(n);
        String n2 = reader.readLine();
        int na2 = Integer.parseInt(n2);
        String n3 = reader.readLine();
        int na3 = Integer.parseInt(n3);
        String n4 = reader.readLine();
        int na4 = Integer.parseInt(n4);
        if(na1 > na2 && na1 > na3 && na1 > na4)
        {
            System.out.println(na1);
        }
        if(na2 > na1 && na2 > na3 && na2 > na4)
        {
            System.out.println(na2);
        }
        if(na3 > na1 && na3 > na2 && na3 > na4)
        {
            System.out.println(na3);
        }
        if(na4 > na1 && na4 > na2 && na4 > na3)
        {
            System.out.println(na4);
        }

    }
}
