package org.athiefaine.tidying.then.explain_v_c;

public class OrderLine {
    private int quantity;
    private double itemPrice;


    public double amount() {
        return quantity * itemPrice * 1.2;
    }
}
