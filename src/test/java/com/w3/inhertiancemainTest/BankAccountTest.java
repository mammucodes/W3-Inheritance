package com.w3.inhertiancemainTest;

import com.w3.bankaccount.BankAccount;
import com.w3.bankaccount.SavingAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
    @Test
    public  void withdrawTest(){
        int amount = 100;
        BankAccount b = new BankAccount("ABC12345",1000);
        int expected= 900;
        int result = b.withdraw(amount);
        Assertions.assertEquals(expected,result);
    }
    @Test
    public void withdrawTestSavings(){
        int amount  = 201;
        SavingAccount acc = new SavingAccount("CBX123", 300);
        int excepted = -1;
        int result = acc.withdraw(amount);
        Assertions.assertEquals(excepted,result);

    }
}
