package edu.wctc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.FileNotFoundException;

public class Myapp {
    public static void main(String[] args) throws FileNotFoundException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        ((GenSalesReport)context.getBean("genSalesReport")).makeReport();
    }
}
