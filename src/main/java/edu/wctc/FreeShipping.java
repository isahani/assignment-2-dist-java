package edu.wctc;

public class FreeShipping implements ShippingPolicy{
    @Override
    public void applyShipping(Sale sale) {
        System.out.println("Shipping already set to 0.0");
    }
}
