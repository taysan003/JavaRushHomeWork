package com.javarush.test.level11.lesson11.bonus03;

/* Задача по алгоритмам
Написать метод, который возвращает минимальное и максимальное числа в массиве.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("Minimum is " + result.x);
        System.out.println("Maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] array)
    {

        if (array == null || array.length == 0)
        {
            return new Pair<Integer, Integer>(null, null);
        }
        else
        {
            int max = 0;
            int min = 0;
            for (int i = 0; i < array.length; i++)
            {

                if (array[i + 1] > max || array[i + 1] < min)
                {
                    max = array[i + 1];
                    min = array[i + 1];
                }

            }


            //Напишите тут ваше решение

            return new Pair<Integer, Integer>(min, max);
        }
    }


    public static class Pair<X, Y>
    {
        public X x;
        public Y y;

        public Pair(X x, Y y)
        {
            this.x = x;
            this.y = y;
        }
    }
}
