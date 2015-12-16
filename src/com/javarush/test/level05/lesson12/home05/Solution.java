package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово ?сумма?. Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        String s = null;
        int sum = 0;
        int n;
        do
        {
            s = reader.readLine();
           // if(!s.equals("сумма"))
            {
                n = Integer.parseInt(s);
                sum += n;
            }
        }
        while (!s.equals("сумма"));
        System.out.println(sum);
    }
}
