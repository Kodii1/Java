package main.java.searchFor;

import main.java.Product;

import java.util.Comparator;
import java.util.List;

public final class SearchForCheapest {
    public static Product search( List < Product > productsList){
        productsList.sort(Comparator.comparingDouble(Product::getPrice));
        return productsList.getFirst();
    }
}
