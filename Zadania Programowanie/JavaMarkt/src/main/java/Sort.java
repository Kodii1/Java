package main.java;

import java.util.Comparator;
import java.util.List;

public final class Sort {
    public static void execute( List < Product > productsList , Comparator <Product> comparator){
        productsList.sort(comparator);
    }
}