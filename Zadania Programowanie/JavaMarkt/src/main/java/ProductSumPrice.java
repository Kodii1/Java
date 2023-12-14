package main.java;

import java.util.List;

public final class ProductSumPrice{

    public static double execute (List < Product > products){
        double sum = 0;
        for(Product product : products){
            if(product.getPrice() != product.getDiscountPrice()){
                sum += product.getDiscountPrice();
            }else{
                sum += product.getPrice();
            }
        }
        return sum;
    }
}
