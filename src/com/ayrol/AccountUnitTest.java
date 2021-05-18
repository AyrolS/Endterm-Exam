package com.ayrol;

import javax.swing.*;

public class AccountUnitTest {

    public static void main(String[] args) {

        Account[] accountArray = new Account[10];

        accountArray[0] = new Checkings(1);
        accountArray[1] = new Checkings(2);
        accountArray[2] = new Checkings(3);
        accountArray[3] = new Checkings(4);
        accountArray[4] = new Checkings(5);
        accountArray[5] = new Savings(11, 1.1);
        accountArray[6] = new Savings(22, 2.2);
        accountArray[7] = new Savings(33, 3.3);
        accountArray[8] = new Savings(44, 4.4);
        accountArray[9] = new Savings(55, 5.5);

        for(int i = 0; i < accountArray.length; ++i)
           /* JOptionPane.showMessageDialog(null, accountArray[i].getAccountInfo());
            */
            System.out.println(accountArray[i].getAccountInfo() + "\n");
    }
}
