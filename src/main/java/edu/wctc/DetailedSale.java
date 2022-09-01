package edu.wctc;

import java.util.List;

public class DetailedSale implements SalesReport{
    @Override
    public void generateReport(List<Sale> salesList) {
        System.out.println("SALES DETAIL REPORT");
        System.out.println("Customer       Country      Amount      Tax      Shipping");
        for(Sale aSale : salesList)
            System.out.println(aSale.toString());
    }

}
