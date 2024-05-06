package org.athiefaine.tidying.explain_v_c.now;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class OrderLineTest {


    @ParameterizedTest(name ="{0} items at {1} should amount (tax included) to {2}")
    @CsvSource({
            "0, 10.00, 0.00",
            "2, 0.00, 0.00",
            "1, 10.00, 12.00",
            "5, 5.50, 33.00",
            "10, 2.00, 24.00"
    })
    void testAmount(int quantity, double itemPrice, double expectedAmount) {
        OrderLine orderLine = new OrderLine(quantity, itemPrice);
        assertEquals(expectedAmount, orderLine.amount(), 0.01);
    }

}