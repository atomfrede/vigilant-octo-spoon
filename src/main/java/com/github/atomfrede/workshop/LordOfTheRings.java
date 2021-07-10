package com.github.atomfrede.workshop;

import java.util.ArrayList;
import java.util.List;

public class LordOfTheRings {

    public List<TolkienCharacter> fellowshipOfTheRing() {

        return hobbits();
    }

    public List<TolkienCharacter> hobbits() {

        List<TolkienCharacter> hobbits = new ArrayList<>();

        Hobbit frodo = new Hobbit("Frodo");
        hobbits.add(frodo);
        return hobbits;
    }

    public List<TolkienCharacter> humans() {

        List<TolkienCharacter> humans = new ArrayList<>();

        Human boromir = new Human("Boromir");
        humans.add(boromir);
        return humans;

    }

}
