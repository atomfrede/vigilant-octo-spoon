package com.github.atomfrede.workshop;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LordOfTheRingsTest {

    private LordOfTheRings lordOfTheRings;
    private TolkienCharacter frodo;

    @Before
    public void setup() {

        lordOfTheRings = new LordOfTheRings();

        frodo = new Hobbit("Frodo");
    }


    @Test
    public void fellowship_should_be_complete() {

        assertThat(lordOfTheRings.fellowshipOfTheRing()).contains(frodo);
    }
}
