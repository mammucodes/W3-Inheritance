package com.w3.bankaccount;

public class BankAccount {
   // String name;
    String accountNumber;
    int balance;
   public  BankAccount(String accountNumer,int balance){
       this.accountNumber = accountNumer;
        this.balance = balance;
    }
    public  void deposit(int amount){
       this.balance+= amount;
    }
    //THis method takes amount as input returns the remaning amount after withdrawl from
    // main balance.
    //It withdraws only if amount passed is less than total balance
    public int withdraw(int amount){
       if(this.balance>amount)
       this.balance-= amount;
       return this.balance;
    }
public int getBalance(){
       return  this.balance;
}
}
