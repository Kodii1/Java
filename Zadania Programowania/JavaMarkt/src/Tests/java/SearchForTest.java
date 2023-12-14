package Tests.java;

import main.java.Product;
import main.java.searchFor.SearchForCheapest;
import main.java.searchFor.SearchForNCheapest;
import main.java.searchFor.SearchForNTheMostExpensive;
import main.java.searchFor.SearchForTheMostExpensive;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
public class SearchForTest {

    private final List < Product > productsList = new ArrayList<>();
    private final Product apple = new Product("P000","Apple",25);
    private final Product banana = new Product("P001", "Banana", 35);
    private final Product orange = new Product("P002", "Orange", 100);
    @BeforeEach
    public void setUp(){
        productsList.add(apple);
        productsList.add(banana);
        productsList.add(orange);
    }
    @Test
    public void forCheapestTest(){
        Assertions.assertEquals(SearchForCheapest.search(productsList), apple);
    }
    @Test
    public void forNCheapestTest(){
        List < Product > answer = new ArrayList<>();
        answer.add(apple);
        answer.add(banana);
        Assertions.assertEquals(SearchForNCheapest.search(productsList , 2), answer);
    }
    @Test
    public void forTheMostExpensiveTest(){
        Assertions.assertEquals(SearchForTheMostExpensive.search(productsList), orange);
    }
    @Test
    public void forNTheMostExpensiveTest(){
        List < Product > answer = new ArrayList<>();
        answer.add(orange);
        answer.add(banana);
        Assertions.assertEquals(SearchForNTheMostExpensive.search(productsList , 2), answer);
    }
}
