package com.annagzowska.SprigngDependencyInjection.domain;

/**
 * Created by gzowska on 2017-03-03.
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
