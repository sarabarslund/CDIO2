package game_test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NegativeAccountTest {

    @Test
    void negativeBalance() {
        Account account = new Account();
        account.setBalance(-1);
        assertTrue(account.negativeBalance());
    }
}