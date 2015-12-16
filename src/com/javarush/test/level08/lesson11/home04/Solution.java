package com.javarush.test.level08.lesson11.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class Solution
{
    public static void main(String[] args)
    {
        isDateOdd("MAY 1 2013");
    }
    public static boolean isDateOdd(String date)
    {
        Date date1 = new Date(date);
        Date date2 = new Date(date);
        date1.setHours(0);
        date1.setMinutes(0);
        date1.setSeconds(0);
        date1.setDate(1);
        date1.setMonth(0);
        long msTimeDistance = date2.getTime() - date1.getTime();
        long msDay = 24 * 60 * 60 * 1000;
        int y = (int)(msTimeDistance/msDay);
        if(y%2==0) return false;
        return true;
    }
}