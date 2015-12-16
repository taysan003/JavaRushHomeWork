package com.javarush.test.level08.lesson03.task02;

/* HashMap из 10 пар
Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
арбуз – ягода, банан – трава, вишня – ягода, груша – фрукт, дыня – овощ, ежевика – куст, жень-шень – корень, земляника – ягода, ирис – цветок, картофель – клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
картофель – клубень
*/

import java.util.HashMap;
import java.util.Map;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

        HashMap<String,String> key = new HashMap<String, String>();
        key.put("арбуз", "ягода");
        key.put("банан", "трава");
        key.put("вишня", "ягода");
        key.put("груша", "фрукт");
        key.put("дыня", "овощ");
        key.put("ежевика", "куст");
        key.put("жень-шень", "корень");
        key.put("земляника", "ягода");
        key.put("ирис", "цветок");
        key.put("картофель", "клубень");
        for (Map.Entry<String, String> pair : key.entrySet())
        {
            String k = pair.getKey();
            String v = pair.getValue();
            System.out.println(k+" - "+v );
        }

    }
}
