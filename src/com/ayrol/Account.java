package com.ayrol;

public abstract class Account
{
    public int accountNumber;
    public double balance;

    public Account(int acctNum)
    {
        accountNumber = acctNum;
        setBalance(100.0);
    }

    public void setBalance(double b)
    {
        balance = b;
    }

    public abstract int getAccountNumber();
    public abstract double getBalance();

    public abstract String getAccountInfo();
}