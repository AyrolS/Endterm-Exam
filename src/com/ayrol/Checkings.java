package com.ayrol;

public class Checkings extends Account {

    public Checkings(int accountNumber)
    {
        super(accountNumber);
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public double getBalance()
    {
        return balance;
    }

    public String getAccountInfo()
    {
        return("Checking Account Information\nAcct Num: " + getAccountNumber() + "\nBalance: " + getBalance());
    }
}
