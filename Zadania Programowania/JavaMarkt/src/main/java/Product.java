package main.java;

public class Product{
    private final String code;
    private final String name;
    private final double price;
    private double discountPrice;

    public Product(String code, String name, double price){
        this.code = code;
        this.name = name;
        this.price = price;
        this.discountPrice = price;
    }

    public void setDiscountPrice( double discountPrice ){
        this.discountPrice = discountPrice;
    }
    public double getDiscountPrice (){ return discountPrice; }
    public String getCode (){ return code;}
    public double getPrice(){
        return price;
    }
    public String getName(){ return name; }
}
