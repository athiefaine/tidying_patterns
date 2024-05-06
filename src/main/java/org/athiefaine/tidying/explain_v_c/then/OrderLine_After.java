package org.athiefaine.tidying.explain_v_c.then;

public class OrderLine_After {
    public static final double VAT_RATE = 0.2;
    private final int quantity;
    private final double itemPrice;

    public OrderLine_After(int quantity, double itemPrice) {
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }

    public double amount() {
        double amountExcludingTax = quantity * itemPrice;
        double amountIncludingTax = amountExcludingTax * (1 + VAT_RATE);
        return amountIncludingTax;
    }
}
