package com.javarush.test.level06.lesson08.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
void readLn() – ждет нажатия enter [использовать readString()]
*/

public class ConsoleReader
{
    public static String readString() throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         String str = reader.readLine();
        return str;

    }
    public static int readInt() throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        return num;

    }

    public static double readDouble() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double dr = Double.parseDouble(reader.readLine());
        return dr;

    }

    public static void readLn() throws Exception
    {
        //напишите тут ваш код
        ConsoleReader.readString();
        return;

    }
}
