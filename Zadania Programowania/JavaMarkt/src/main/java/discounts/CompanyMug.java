package main.java.discounts;

import main.java.IDiscount;
import main.java.Product;
import main.java.ProductSumPrice;
import main.java.ShoppingCart;

import java.util.List;

public final class CompanyMug implements IDiscount {
    private final List< Product > productsList;
    private final Product product = new Product("P000","Company mug",0);

    public CompanyMug( ShoppingCart shoppingCart ){
        this.productsList = shoppingCart.getProductsList();
    }
    @Override
    public void apply() {
        productsList.add(product);
    }

    @Override
    public void unapply() {
        productsList.remove(product);
    }

    @Override
    public boolean canExecute() {
        return ProductSumPrice.execute(productsList) >= 200;
    }
}
