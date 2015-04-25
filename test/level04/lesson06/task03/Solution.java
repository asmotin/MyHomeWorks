package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n1 = reader.readLine();
        String n2 = reader.readLine();
        String n3 = reader.readLine();
        int a = Integer.parseInt(n1);
        int b = Integer.parseInt(n2);
        int c = Integer.parseInt(n3);

        int m1,m2,m3;

       if (a>b && a>b)
           m1 = a;
        else if (b>c && b>a)
           m1 = b;
        else m1 = c;

        if (a<b && a<c)
            m3 = a;
        else if (b<a && b<c)
            m3 = b;
        else m3 = c;

        if (a>m3 && a<m1)
            m2 = a;
        else if (b>m3 && b<m1)
            m2 = b;
        else m2 = c;

        System.out.println(m1+" "+m2+" "+m3+" ");

    }
}
