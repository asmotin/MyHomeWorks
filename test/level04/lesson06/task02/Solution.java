package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a,b,c,d;
        a = reader.readLine();
        b = reader.readLine();
        c = reader.readLine();
        d = reader.readLine();
        int n1,n2,n3,n4,max;
        n1 = Integer.parseInt(a);
        n2 = Integer.parseInt(b);
        n3 = Integer.parseInt(c);
        n4 = Integer.parseInt(d);

        if (n1>n2 && n1>n3 && n1>n4)
            System.out.println(n1);
        else if (n2>n3 && n2>n4 && n2>n1)
            System.out.println(n2);
        else if (n3>n2 && n3>n4 && n3>n1)
            System.out.println(n3);
        else System.out.println(n4);

    }

}
