package me.tomo.conf;

import me.tomo.domain.User;
import me.tomo.domain.UserImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

@Configuration
public class AppConfig {

    @Bean
    @Description("Bean定義の説明")
    public User user() {
        return new UserImpl();
    }

    @Bean
    public User user1() {
        return new UserImpl();
    }

    @Bean(name = "user2")
    public User user2() {
        return new UserImpl();
    }
}
