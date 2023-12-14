package Tests.java;

import main.java.Product;
import main.java.ProductSumPrice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ProductSumPriceTest {
    @Test
    public void Test(){
        Product apple = new Product("P000","Apple",25);
        Product banana = new Product("P001", "Banana", 35);
        Product orange = new Product("P002", "Orange", 100);
        List< Product > productsList = new ArrayList<>();
        productsList.add(apple);
        productsList.add(banana);
        productsList.add(orange);

        Assertions.assertEquals(160, ProductSumPrice.execute(productsList) );

    }
}
