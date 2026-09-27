package com.mycompany.scd_assignment_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DigitalWalletTest {

    @Test
    public void testSuccessfulWithdrawal() {
        DigitalWallet wallet = new DigitalWallet("John Doe", 500.0, "4321");
        boolean result = wallet.withdraw(100.0, "4321");
        assertTrue(result, "Withdrawal should succeed with correct PIN and sufficient balance");
        assertEquals(400.0, wallet.getBalance(), 0.001, "Balance should be reduced by 100");
    }

    @Test
    public void testFailedWithdrawalWrongPin() {
        DigitalWallet wallet = new DigitalWallet("John Doe", 500.0, "4321");
        boolean result = wallet.withdraw(100.0, "0000");
        assertFalse(result, "Withdrawal should fail with incorrect PIN");
        assertEquals(500.0, wallet.getBalance(), 0.001, "Balance should remain unchanged after failed attempt");
    }

    @Test
    public void testFailedWithdrawalInsufficientFunds() {
        DigitalWallet wallet = new DigitalWallet("John Doe", 500.0, "4321");
        boolean result = wallet.withdraw(1000.0, "4321");
        assertFalse(result, "Withdrawal should fail when amount exceeds balance");
        assertEquals(500.0, wallet.getBalance(), 0.001, "Balance should remain unchanged");
    }
}