package edu.wctc;

import java.util.List;

public class SummarySale implements SalesReport{
    @Override
    public void generateReport(List<Sale> salesList) {
        System.out.println("This is summary report");

    }
}
