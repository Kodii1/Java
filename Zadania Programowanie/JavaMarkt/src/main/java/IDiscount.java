package main.java;

public interface IDiscount {
    void apply();
    void unapply();
    boolean canExecute();
}
