package main.java.searchFor;

import main.java.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class SearchForNTheMostExpensive {
    public static List<Product> search(List< Product > productsList , Integer n ){
        productsList.sort(Comparator.comparingDouble(Product::getPrice).reversed());
        List < Product > returnList = new ArrayList<>();
        for(int i = 0; i < n; i++){
            returnList.add(productsList.get(i));
        }
        return returnList;
    }
}
