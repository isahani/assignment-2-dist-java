package edu.wctc;

import java.util.List;


public class Sale {
    String name;
    String country;
    Double total;
    Double tax;
    Double shipping;

    public Sale(String name, String country, Double total, Double tax, Double shipping){
        this.name = name;
        this.country = country;
        this.total=total;
        this.tax = tax;
        this.shipping = shipping;
    }

    public String toString(){
        return name + "   " + country + "   " + total + "   " + tax + "   " + shipping + "  ";
    }

}
