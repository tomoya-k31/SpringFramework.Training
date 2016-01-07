package me.tomo.domain;

public class UserImpl implements User {

    @Override
    public void say(String message) {
        System.out.printf("「" + message + "」");
    }
}
