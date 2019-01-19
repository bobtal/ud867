package com.example.android.clickcounter;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClickCounterTest {

    @Test
    public void incrementProperlyIncrementsCount() {
        // arrange
        ClickCounter counter = new ClickCounter();

        // act
        counter.increment();
        counter.increment();
        counter.increment();

        // assert
        assertEquals(3, counter.getCount());
    }

    @Test
    public void counterInitializesToZero() {
        // arrange
        ClickCounter counter = new ClickCounter();

        // act

        // assert
        assertEquals(0, counter.getCount());
    }
}