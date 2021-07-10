package com.github.atomfrede.workshop;

/**
 * Created by fred on 07.06.17.
 */
public class Human extends AbstractTolkienCharacter  {

    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public Race race() {
        return Race.HUMAN;
    }
}
