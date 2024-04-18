package com.pluralsight;

public class Main
{
    public static void main(String[] args)
    {
       Dice dice = new Dice();

       int roll1;
       int roll2;

       int twoCounter = 0;
       int fourCounter = 0;
       int sixCounter = 0;
       int sevenCounter = 0;

       for(int i = 0; i < 20; i++)
       {
           roll1 = dice.roll();
           roll2 = dice.roll();
           int sum = roll1 + roll2;
           System.out.println("Roll 1: " + roll1 + " - " + roll2 + " Sum: " + sum);

           if(sum == 2) twoCounter++;

           //roll2 = dice.roll();
           //System.out.println("Roll 2: " + roll2);

           //int sum = roll1 + roll2;
           //System.out.println("Sum: " + sum);


       }
        System.out.println("-------------------");
        System.out.println("Count 2: " + twoCounter);
    }

}