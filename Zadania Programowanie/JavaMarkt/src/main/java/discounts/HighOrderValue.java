package main.java.discounts;

import main.java.IDiscount;
import main.java.Product;
import main.java.ProductSumPrice;
import main.java.ShoppingCart;

import java.util.List;

public final class HighOrderValue implements IDiscount {
    public final List < Product > productsList;
    public HighOrderValue( ShoppingCart shoppingCart ){
        this.productsList = shoppingCart.getProductsList();
    }
    @Override
    public void apply() {
        for (Product product : productsList) {
            product.setDiscountPrice(product.getPrice() * 0.95);
        }
    }

    @Override
    public void unapply() {
        for (Product product : productsList) {
            product.setDiscountPrice(product.getPrice());
        }
    }

    @Override
    public boolean canExecute() {
        return ProductSumPrice.execute(productsList) >= 300;
    }
}
