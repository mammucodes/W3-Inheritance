package com.w3.bankaccount;

public class SavingAccount extends BankAccount {
    public SavingAccount(String accountNumber, int balance) {
        super(accountNumber, balance);
    }

    @Override
    //THis method takes amount as input type and retruns the balance amount
    //This method returns -1 if balance is less than 100
    // 0r else returns remaning balance
    public int withdraw(int amount) {
        if ((getBalance() - amount) < 100) {
            System.out.println("minimum balance of 100$ required");
            return -1;
        } else {
            int reamingbalance = super.withdraw(amount); // using parent class bankAccount method

            return reamingbalance;
        }
    }
}


