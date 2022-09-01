package edu.wctc;

import java.io.FileNotFoundException;
import java.util.List;

public interface ISalesInput {
    List<Sale> getSales() throws FileNotFoundException;
}
