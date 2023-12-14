package Tests.java;

import main.java.Product;
import main.java.ProductSumPrice;
import main.java.ShoppingCart;
import main.java.discounts.HighOrderValue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

public class ShoppingCartTest {
    private final Product apple = new Product("P000","Apple",500);
    private final ShoppingCart shoppingCart = new ShoppingCart();

    @Test
    public void addProductTest(){
        shoppingCart.addProductToCart(apple);
        Assertions.assertEquals(List.of(apple) , shoppingCart.getProductsList() );

    }
    @Test
    public void deleteProductTest(){
        shoppingCart.addProductToCart(apple);
        shoppingCart.deleteProductFromCart(apple);
        Assertions.assertEquals(List.of() , shoppingCart.getProductsList() );
    }
    @Test
    public void addDiscountTest(){
        shoppingCart.addProductToCart(apple);
        HighOrderValue highOrderValue = new HighOrderValue(shoppingCart);
        shoppingCart.addDiscount(highOrderValue);

        Assertions.assertEquals( 475, ProductSumPrice.execute(shoppingCart.getProductsList()) );
    }
    @Test
    public void removeDiscountTest(){
        shoppingCart.addProductToCart(apple);
        HighOrderValue highOrderValue = new HighOrderValue(shoppingCart);
        shoppingCart.addDiscount(highOrderValue);

        shoppingCart.removeDiscount();
        Assertions.assertEquals(500 , ProductSumPrice.execute(shoppingCart.getProductsList()) );
    }
}
