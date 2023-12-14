package main.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class ShoppingCart{
    private final List < Product > productsList = new ArrayList<>();
    private final List < IDiscount > historyDiscountList = new ArrayList<>();
    public void addProductToCart(Product product){
        productsList.add(product);
    }
    public void deleteProductFromCart(Product product){ productsList.remove(product); }

    public void sort(Comparator <Product> comparator){
        Sort.execute(  productsList, comparator );
    }
    public void addDiscount( IDiscount iDiscount ){
        historyDiscountList.add(iDiscount);
        iDiscount.apply();
    }
    public void removeDiscount(){
        historyDiscountList.getLast().unapply();
        historyDiscountList.removeLast();
    }
    public List < Product > getProductsList(){
        return productsList;
    }
}
