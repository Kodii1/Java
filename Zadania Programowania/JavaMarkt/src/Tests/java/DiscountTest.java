package Tests.java;

import main.java.Product;
import main.java.ProductSumPrice;
import main.java.ShoppingCart;
import main.java.discounts.Buy3PayFor2;
import main.java.discounts.CompanyMug;
import main.java.discounts.HighOrderValue;
import main.java.discounts.ThirtyPercentDiscountForOneProduct;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiscountTest {
    private final ShoppingCart shoppingCart = new ShoppingCart();
    private final Product apple = new Product("P000", "Apple", 150);
    private final Product orange = new Product("P001", "Orange", 305);
    private final Product banana = new Product("P002", "Banana", 550);

    @BeforeEach
    public void setUp(){
        shoppingCart.addProductToCart(apple);
        shoppingCart.addProductToCart(orange);
        shoppingCart.addProductToCart(banana);
    }

    @Test
    public void buy3PayFor2Test(){
        Buy3PayFor2 buy3PayFor2 = new Buy3PayFor2( shoppingCart );
        buy3PayFor2.apply();

        Assertions.assertEquals( 855 ,ProductSumPrice.execute(shoppingCart.getProductsList()) );
    }
    @Test
    public void companyMug(){
        CompanyMug companyMug = new CompanyMug( shoppingCart );
        companyMug.apply();
        String answer = "Company mug";

        Assertions.assertEquals( answer ,shoppingCart.getProductsList().getLast().getName() );
    }
    @Test
    public void highOrderValue(){
        HighOrderValue highOrderValue = new HighOrderValue( shoppingCart );
        highOrderValue.apply();

        Assertions.assertEquals(954.75 , ProductSumPrice.execute( shoppingCart.getProductsList() ) );
    }
    @Test
    public void thirtyPercentDiscountForOneProductTest(){
        ThirtyPercentDiscountForOneProduct thirtyPercentDiscountForOneProduct = new ThirtyPercentDiscountForOneProduct(apple,"code");
        thirtyPercentDiscountForOneProduct.apply();

        Assertions.assertEquals(960 , ProductSumPrice.execute( shoppingCart.getProductsList() ) );
    }
}
