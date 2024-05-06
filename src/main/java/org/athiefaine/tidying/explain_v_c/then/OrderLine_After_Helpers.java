package org.athiefaine.tidying.explain_v_c.then;

public class OrderLine_After_Helpers {
    public static final double VAT_RATE = 0.2;
    private int quantity;
    private double itemPrice;

    public OrderLine_After_Helpers(int quantity, double itemPrice) {
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }

    public double amount() {
        return applyTax(amountExcludingTax());
    }

    private double applyTax(double amountExcludingTax) {
        return amountExcludingTax * (1 + VAT_RATE);
    }

    private double amountExcludingTax() {
        return quantity * itemPrice;
    }
}
