
package main.java;
import main.java.discounts.ThirtyPercentDiscountForOneProduct;

import java.util.Comparator;


public class Main{
    public static void main ( String[] args ){
        ShoppingCart shoppingCart = new ShoppingCart();
        Product Apple = new Product("P001", "Apple1", 300);
        Product Apple2 = new Product("P002", "Apple2", 300);
        Product Apple3 = new Product("P003", "Apple3", 300);

        shoppingCart.addProductToCart(Apple);
        shoppingCart.addProductToCart(Apple2);
        shoppingCart.addProductToCart(Apple3);

        String code = "code";

        IDiscount iDiscount = new ThirtyPercentDiscountForOneProduct(Apple, code);
        if(iDiscount.canExecute()) {
            shoppingCart.addDiscount(iDiscount);
        }

        shoppingCart.sort(Comparator.comparing(Product::getName));

        for (Product product : shoppingCart.getProductsList()) {
            System.out.println(product.getName());
        }

        shoppingCart.removeDiscount();

    }
}