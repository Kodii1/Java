package main.java.discounts;

import main.java.IDiscount;
import main.java.Product;

import java.util.Objects;

public final class ThirtyPercentDiscountForOneProduct implements IDiscount {
    private final Product product;
    private static final String discountCode = "code";
    private final String userCode;
    public ThirtyPercentDiscountForOneProduct( Product product , String discountCode ){
        this.product = product;
        this.userCode = discountCode;
    }
    @Override
    public void apply(){
        double currentPrice = product.getPrice();
        product.setDiscountPrice( currentPrice * 0.7 );
    }

    @Override
    public void unapply() {
        double currentPrice = product.getPrice();
        product.setDiscountPrice( currentPrice );
    }

    @Override
    public boolean canExecute() {
        return Objects.equals(discountCode, userCode);
    }
}
