package me.tomo.chap2.config;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by usr0200379 on 15/12/10.
 */
@Configuration
@ComponentScan("me.tomo.chap2")
@EnableAspectJAutoProxy
@PropertySource(value = "classpath:/config/message.properties")
public class AppConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}