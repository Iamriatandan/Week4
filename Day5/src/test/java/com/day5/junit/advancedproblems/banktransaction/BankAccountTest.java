package com.day5.junit.advancedproblems.banktransaction;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

        @Test
        public void testDeposit() {
            BankAccount account = new BankAccount(100);
            account.deposit(50);
            assertEquals(150, account.getBalance());
        }

        @Test
        public void testWithdraw() {
            BankAccount account = new BankAccount(100);
            account.withdraw(50);
            assertEquals(50, account.getBalance());
        }

        @Test
        public void testWithdrawInsufficientFunds() {
            BankAccount account = new BankAccount(100);
            assertThrows(IllegalArgumentException.class, () -> account.withdraw(150));
        }
    }
