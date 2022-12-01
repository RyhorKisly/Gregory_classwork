package com.lis.prodconsTwoAndTaskPlayer.player.model;

import java.io.Serializable;

public class Player implements Serializable {
    private final String name;
    private final int age;
    private final boolean active;

    public Player(String name, int age, boolean active) {
        this.name = name;
        this.age = age;
        this.active = active;
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public String toString() {
        return "Player{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", active=" + active +
            '}';
    }

    public int getAge() {
        return age;
    }
}
