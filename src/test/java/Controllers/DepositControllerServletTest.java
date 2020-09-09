package Controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepositControllerServletTest {

    @Test
    void deposit() {
            DepositControllerServlet d = new DepositControllerServlet();
            double actual = d.deposit(1000,200);
            double expected = 1200;
            assertEquals(expected,actual);
    }
}