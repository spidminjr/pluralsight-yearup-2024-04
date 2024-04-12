package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // find all 7 questions in your workbook on page 
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();

    }

    // write ONLY code for QUESTION 1 in this function
    public static void question1() {
        // Question 1:
        // declare variables here
        int bobSalary;
        bobSalary = 50000;

        int garySalary;
        garySalary = 80000;

        int highestSalary;


        // code the logic to the problem here

        highestSalary = Math.max(bobSalary, garySalary);
        System.out.println(" The highest salary is " + highestSalary);


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
    }


    // write ONLY code for QUESTION 2 in this function
    public static void question2() {
        // Question 2:
        // declare variables here
        int carPrice = 25000;
        int truckPrice = 53000;
        int lowestPrice;

        // code the logic to the problem here
        lowestPrice = Math.min(truckPrice, carPrice);
        System.out.println(" The lowest price is " + lowestPrice);

        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
    }


    // write ONLY code for QUESTION 3 in this function
    public static void question3() {
        // Question 3:
        // declare variables here
        double radius = 7.25;
        double areaOfCircle = Math.PI * Math.pow(radius, 2);

        // code the logic to the problem here
        System.out.println(areaOfCircle);

        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
    }


    // write ONLY code for QUESTION 4 in this function
    public static void question4() {
        // Question 4:
        // declare variables here
        double squaredRoot = 5.0;
        double squareRoot = Math.sqrt(squaredRoot);

        // code the logic to the problem here
        System.out.println(" The Square Root of 5.0 is " + squareRoot);

        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
    }


    // write ONLY code for QUESTION 5 in this function
    public static void question5() {
        // Question 5:
        // declare variables here
        int pointX1 = 5;
        int pointY1 = 10;
        int pointX2 = 85;
        int pointY2 = 50;

        // code the logic to the problem here
        double finalCordX = Math.pow((pointX1 - pointX2), 2);
        double finalCordY = Math.pow((pointY1 - pointY2), 2);
        double finalDistance = Math.sqrt(finalCordX + finalCordY);

        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("Distance is " + finalDistance);

    }


    // write ONLY code for QUESTION 6 in this function
    public static void question6() {
        // Question 6:
        // declare variables here
        double x = -3.8;
        double absoluteValue;

        // code the logic to the problem here
        absoluteValue = Math.abs(x);

        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("The absolute value of -3.8 is " + absoluteValue);
    }


    // write ONLY code for QUESTION 7 in this function
    public static void question7() {
        // Question 7:
        // declare variables here
        double randomNum = Math.random();

        // code the logic to the problem here
        System.out.println("Random number between 0 and 1 is " + randomNum);


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
    }
}