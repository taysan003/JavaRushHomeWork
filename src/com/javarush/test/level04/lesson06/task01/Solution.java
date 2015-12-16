package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String n = reader.readLine();
        int nAge = Integer.parseInt(n);
        String n2 = reader.readLine();
        int nAge2 = Integer.parseInt(n2);
        if(nAge < nAge2)
        {
            System.out.println(nAge);
        }
        else
        System.out.println(nAge2);

    }
}