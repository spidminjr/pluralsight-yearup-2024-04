package com.pluralsight;

import java.util.Scanner;

public class Main
{
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)throws InterruptedException
    {
        whileLoop();
        doWhileLoop();
        forLoop();
    }

    public static void whileLoop()
    {
        int count = 0;

        while(count < 10)
        {
            System.out.println("I love Java");
            count++;
        }

    }

    public static void doWhileLoop()
    {
        int count = 0;

        do
        {
            System.out.println("I love Java!");
            count++;
        } while(count < 5);
    }

    public static void forLoop() throws InterruptedException {
        for(int i = 10; i >= 1; i--)
        {
            System.out.println(i);

            Thread.sleep(1000);
        }
        System.out.println("Launch!");
    }
}