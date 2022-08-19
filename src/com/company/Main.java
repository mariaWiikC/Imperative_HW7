package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int n = 1;
        boolean found = false;

        while (found == false)
        {
            int value = (n*n*n + 91) % 47;
            if (value == 0)
            {
                found = true;
                System.out.println(n);
            }
            else
                n++;
        }

    }
}
