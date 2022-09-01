package edu.wctc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
@Component
public class GenSalesReport {

    private ISalesInput inFile;
    private ShippingPolicy sPolicy;
    private SalesReport outReport;
    private List<Sale> sales = new ArrayList<>();

@Autowired
    public void generateReport(ISalesInput inFile, ShippingPolicy sPolicy, SalesReport outReport) {
    this.inFile = inFile;
    this.sPolicy = sPolicy;
    this.outReport = outReport;
}

    public void makeReport() throws FileNotFoundException {
        List<Sale> allSales = this.inFile.getSales();
        for(Sale aSale : allSales)
            this.sPolicy.applyShipping(aSale);
        this.outReport.generateReport(allSales);
    }
}
