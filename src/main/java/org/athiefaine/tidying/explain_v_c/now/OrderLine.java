package org.athiefaine.tidying.explain_v_c.now;

public class OrderLine {
    private final int quantity;
    private final double itemPrice;

    public OrderLine(int quantity, double itemPrice) {
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }


    public double amount() {
        return quantity * itemPrice * 1.2;
    }
}
