package Tests.java;

import main.java.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {
    private final  Product apple = new Product("P000","Apple",25);
    @Test
    public void getNameTest(){
         Assertions.assertEquals( "Apple", apple.getName() );
    }
    @Test
    public void getCodeTest(){
        Assertions.assertEquals( "P000", apple.getCode() );
    }
    @Test
    public void getPriceTest(){
        Assertions.assertEquals( 25, apple.getPrice() );

    }
    @Test
    public void discountTest(){
        apple.setDiscountPrice(5);
        Assertions.assertEquals( 5, apple.getDiscountPrice() );

    }
}