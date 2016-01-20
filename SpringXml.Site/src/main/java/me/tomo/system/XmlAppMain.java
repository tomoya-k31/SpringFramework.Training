package me.tomo.system;

import me.tomo.config.AppConfig;
import me.tomo.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by usr0200379 on 15/12/10.
 */
public class XmlAppMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        ProductService service = context.getBean(ProductService.class);
        System.out.println(service.getProduct().toString());
    }
}