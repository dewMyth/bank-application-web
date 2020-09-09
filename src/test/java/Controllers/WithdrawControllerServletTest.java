package Controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithdrawControllerServletTest {

    @Test
    void withdraw() {
        WithdrawControllerServlet w = new WithdrawControllerServlet();
        double actual = w.withdraw(1000,500);
        double expected = 500;
        assertEquals(expected, actual);
    }
}