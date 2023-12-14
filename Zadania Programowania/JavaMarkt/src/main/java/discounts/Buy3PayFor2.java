package main.java.discounts;

import main.java.IDiscount;
import main.java.Product;
import main.java.ShoppingCart;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class Buy3PayFor2 implements IDiscount {
    private final List < Product > productsList = new ArrayList<>();
    public Buy3PayFor2( ShoppingCart shoppingCart ){
        this.productsList.addAll(shoppingCart.getProductsList());
    }
    @Override
    public void apply() {
        this.productsList.sort(Comparator.comparingDouble(Product::getPrice));
        productsList.getFirst().setDiscountPrice(0);
    }

    @Override
    public void unapply() {
        this.productsList.sort(Comparator.comparingDouble(Product::getPrice).reversed());
        for( Product product : productsList ){
            if( product.getPrice() == 0 && product.getPrice() != product.getDiscountPrice()) {
                product.setDiscountPrice(product.getPrice());
                break;
            }
        }
    }

    @Override
    public boolean canExecute() {
        return this.productsList.size() >= 3;
    }
}
