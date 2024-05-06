package org.athiefaine.tidying.explain_v_c.now;

public class OrderLine {
    private int quantity;
    private double itemPrice;

    public OrderLine(int quantity, double itemPrice) {
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }


    public double amount() {
        return quantity * itemPrice * 1.2;
    }
}
