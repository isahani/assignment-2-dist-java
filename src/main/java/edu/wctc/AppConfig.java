package edu.wctc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.wctc")
public class AppConfig {
    @Bean
    public ISalesInput salesInput() {
        return new SalesInput();
    }

    @Bean
    public SalesReport salesReport() {
        return new DetailedSale();
    }

    @Bean
    public ShippingPolicy shippingPolicy(){
        return new FreeShipping();
    }
}