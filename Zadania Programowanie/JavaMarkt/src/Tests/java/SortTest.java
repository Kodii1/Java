package Tests.java;


import main.java.Product;
import main.java.ShoppingCart;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortTest{
    private Product Apple;
    private Product Car;
    private Product Rabbit;
    private Product Rat;
    private Product Ratv2;
    private  List<Product> products;
    private ShoppingCart shoppingCart;

    @BeforeEach
    public void setUp(){

        Apple = new Product("P001","Apple", 50);
        Car = new Product("P002", "Car", 2500);
        Rabbit = new Product("P003", "Rabbit", 50);
        Rat = new Product("P004", "Rat", 50);
        Ratv2 = new Product("P005", "Rat", 40);

        products = new ArrayList<>();

        shoppingCart = new ShoppingCart();
        shoppingCart.addProductToCart(Apple);
        shoppingCart.addProductToCart(Car);
        shoppingCart.addProductToCart(Rabbit);
        shoppingCart.addProductToCart(Rat);
        shoppingCart.addProductToCart(Ratv2);
    }

    @Test
    public void testSortFromAtoZ() {
        products.add(Apple);
        products.add(Car);
        products.add(Rabbit);
        products.add(Rat);
        products.add(Ratv2);
        shoppingCart.sort(Comparator.comparing(Product::getName));
        Assertions.assertEquals(products, shoppingCart.getProductsList(), "Apple, Car, Rabbit, Rat");
    }
    @Test
    public void fromZtoA(){
        products.add(Rat);
        products.add(Ratv2);
        products.add(Rabbit);
        products.add(Car);
        products.add(Apple);

        shoppingCart.sort(Comparator.comparing(Product::getName).reversed());
        Assertions.assertEquals(products, shoppingCart.getProductsList(), "Rat, Rabbit, Car, Apple");
    }

    @Test
    public void fromCheapest(){
        products.add(Ratv2);
        products.add(Apple);
        products.add(Rabbit);
        products.add(Rat);
        products.add(Car);

        shoppingCart.sort(Comparator.comparingDouble(Product::getPrice));
        Assertions.assertEquals(products, shoppingCart.getProductsList(), "Apple, Car, Rabbit, Rat");
    }
    @Test
    public void fromMostExpensive(){
        products.add(Car);
        products.add(Apple);
        products.add(Rabbit);
        products.add(Rat);
        products.add(Ratv2);

        shoppingCart.sort(Comparator.comparingDouble(Product::getPrice).reversed());
        Assertions.assertEquals(products, shoppingCart.getProductsList(), "Apple, Car, Rabbit, Rat");
    }
}
