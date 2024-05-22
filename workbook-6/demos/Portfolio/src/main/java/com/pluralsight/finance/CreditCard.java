package com.pluralsight.finance;

public class CreditCard extends BankAccount implements Valuable
{

    public CreditCard(String name, String accountNumber, double balance)
    {
        super(name, accountNumber, balance);
    }


    @Override
    public double getValue()
    {
        System.out.println("credit card");
        return 0;
    }
}
