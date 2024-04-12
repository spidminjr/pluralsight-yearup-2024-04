package com.pluralsight;
// ask user for their name
//display the product & price
// ask for the quantity
//calculate total and display
// ask for money
// give change back

public class Main {
    public static void main(String[] args)
    {
        System.in.

        // declare constants
        final String PRODUCT = "Milka Aplenmilch";
        final double PRICE = 2.99;

        //input variables
        String customerName;
        int quantity;
        double cashReceived;

        //calculated
        double totalPrice;
        double changeReturned;


        // get user input
        customerName = "Bob";
        quantity = 5;

        // calculations
        totalPrice = PRICE * quantity;
        cashReceived = 20;
        changeReturned = cashReceived - totalPrice;

        // display the receipt
        System.out.println();
        //option 1  for formatting
        // String message = String.format("Total: $ %.2f", totalPrice);
        // System.out.println(message);

        // option 2 for formatting
        System.out.printf("Total: $ %6.2f \n", totalPrice);
        //System.out.println("Total price: " + totalPrice);
        System.out.printf("Cash: $ %6.2f \n", cashReceived);
        System.out.printf("Change: $ %6.2f \n", changeReturned);
    }
}