package me.tomo.system;

import me.tomo.config.AppConfig;
import me.tomo.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by usr0200379 on 15/12/10.
 */
public class AnnotationAppMain {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ProductService service = context.getBean(ProductService.class);
        System.out.println(service.getProduct().toString());

        service.selectBookList().forEach(System.out::println);
    }
}