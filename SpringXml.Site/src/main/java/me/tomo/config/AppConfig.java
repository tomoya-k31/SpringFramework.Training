package me.tomo.config;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by usr0200379 on 15/12/10.
 */
@Configuration
@ComponentScan("me.tomo")
@EnableAspectJAutoProxy
@PropertySource(value = "classpath:/config/message.properties")
public class AppConfig {

    // message.propertiesを読み込むために必要
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}