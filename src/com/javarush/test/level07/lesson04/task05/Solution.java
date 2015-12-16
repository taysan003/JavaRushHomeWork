package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] list = new int [20];  int [] list2 = new int [10];  int [] list3 = new int [10];

        for (int i=0; i < list.length; i++)
        {

            list[i]= Integer.parseInt(reader.readLine());

        }
        for (int i=0; i < list.length-10; i++)
        {

                list2[i]=list[i];

        }
//        for (int i=0; i < list2.length; i++)
//        {
//
//            System.out.println(list2[i]);
//
//        }
        for (int i = list.length-10, j=0; i < list.length; i++, j++)
        {

                list3[j]=list[i];

        }

        for (int i=0; i < list3.length; i++)
        {

            System.out.println(list3[i]);

        }


    }
}
