package org.athiefaine.tidying.explain_v_c.now;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class OrderLineTest {


    @ParameterizedTest
    @CsvSource({
            "0, 10, 0.0",
            "1, 10, 12.0",
            "5, 5, 30.0",
            "10, 2, 24.0"
    })
    void testAmount(int quantity, double itemPrice, double expectedAmount) {
        OrderLine orderLine = new OrderLine(quantity, itemPrice);
        assertEquals(expectedAmount, orderLine.amount(), 0.01);
    }

}