package excercise.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankTest {

    Bank bank = new Bank();

    @BeforeEach
    void setUp() {
    }

    @Test
    void addAccount() {
        bank.addAccount("karel", 5000);
        assertEquals(5000, bank.getDepositForName("karel"));
    }

    @Test
    void transfer() {
        bank.addAccount("Karel", 4000);
        bank.addAccount("Jana", 4000);

        bank.transfer(bank.find("Karel"), bank.find("Jana"), 2000);
        assertEquals(6000, bank.find("Jana"));
        assertEquals(2000, bank.find("Karla"));
    }
}