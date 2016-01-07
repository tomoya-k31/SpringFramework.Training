package me.tomo.chap2;

import me.tomo.chap2.config.AppConfig;
import me.tomo.chap2.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by usr0200379 on 15/12/10.
 */
public class AppMain {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ProductService service = context.getBean(ProductService.class);
        System.out.println(service.getProduct());
    }
}