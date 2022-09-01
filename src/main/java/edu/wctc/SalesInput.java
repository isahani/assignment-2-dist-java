package edu.wctc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SalesInput implements ISalesInput{
    private List<Sale> sale = new ArrayList<>();
    @Override
    public List<Sale> getSales() throws FileNotFoundException {
        String name;
        String country;
        Double total;
        Double tax;
        Double shipping;
        Scanner sc = new Scanner(new File("/Users/pritroshni/Documents/DistributedJava/week_2/Week_2_assign/src/main/java/edu/wctc/sales.txt"));
        while (sc.hasNextLine()) {
            String data = sc.nextLine();
            String[] tempArr;
            tempArr = data.split(",");
            name = tempArr[0];
            country = tempArr[1];
            total = Double.valueOf(tempArr[2]);
            tax = Double.valueOf(tempArr[3]);
            shipping = 0.0;
            sale.add(new Sale(name, country, total, tax, shipping));
        }
        sc.close();
        return sale;
    }
}
