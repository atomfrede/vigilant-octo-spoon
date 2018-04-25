package com.github.atomfrede.workshop;

public class Hobbit extends AbstractTolkienCharacter {

    private String name;

    public Hobbit(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        System.out.println("Hello");
        return this.name;
    }

    @Override
    public Race race() {
        return Race.HOBBIT;
    }
}
