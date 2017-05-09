package com.github.atomfrede.workshop;

public abstract class AbstractTolkienCharacter implements TolkienCharacter {

    @Override
    public abstract String name();

    @Override
    public abstract Race race();

    @Override
    public boolean equals(Object other) {
        return other instanceof TolkienCharacter && ((TolkienCharacter) other).race().equals(race()) && ((TolkienCharacter) other).name().equals(name());

    }
}
