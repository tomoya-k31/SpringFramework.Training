package me.tomo;

import me.tomo.conf.AppConfig;
import me.tomo.domain.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        User user = context.getBean(User.class);
//        user.say("こんちゃ！");

        User user0 = (User) context.getBean("user");
        User user1 = (User) context.getBean("user1");
        User user2 = (User) context.getBean("user2");
        user0.say("0:こんちゃ！");
        user1.say("1:こんちゃ！");
        user2.say("2:こんちゃ！");
        context.close();
    }
}
