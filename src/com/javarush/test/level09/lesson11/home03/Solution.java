package com.javarush.test.level09.lesson11.home03;

/* Метод в try..catch
Вводить с клавиатуры числа. Код по чтению чисел с клавиатуры вынести в отдельный метод readData.
Обернуть все тело (весь код внутри readData, кроме объявления списка, где будут храниться числа и BufferedReader - а) этого метода в try..catch.
Если пользователь ввёл какой-то текст, вместо ввода числа, то метод должен перехватить исключение и вывести на экран все введенные числа в качестве результата.
Числа выводить с новой строки сохраняя порядок ввода.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) {
        readData();
    }


    public static void readData()
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();

            for (int i = 0; i < 4; i++)
            {
                int s = 0;
                try
                {
                    s = Integer.parseInt(reader.readLine());
                    list.add(s);
                }
                catch (Exception e)
                {


                }

            }
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }




        //напишите тут ваш код
    }
}
