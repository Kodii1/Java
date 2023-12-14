package main.java.searchFor;

import main.java.Product;

import java.util.Comparator;
import java.util.List;

public final class SearchForTheMostExpensive {
    public static Product search(List< Product > productsList){
        productsList.sort(Comparator.comparingDouble(Product::getPrice).reversed());
        return productsList.getFirst();
    }
}
