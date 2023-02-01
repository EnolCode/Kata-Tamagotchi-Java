package com.kata;

import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TamagotchiTest {
    
    Tamagotchi gochi = new Tamagotchi();

    @Test
    public void eat_low_hunger()
    {
        gochi.eat();
        gochi.eat();
        gochi.eat();
        assertEquals(2, gochi.getHunger());
    }

    @Test
    public void eat_raises_energy()
    {
        gochi.eat();
        gochi.eat();
        gochi.eat();
        gochi.eat();
        assertEquals(8, gochi.getEnergy());
        assertEquals("(:-|)", gochi.eat());
    }

    @Test
    public void sleep_raises_energy()
    {
        gochi.sleep();
        gochi.sleep();
        assertEquals(8, gochi.getEnergy());
    }

    @Test
    public void play_raises_hunger()
    {
        gochi.play();
        gochi.play();
        assertEquals(10, gochi.getHunger());
    }

    @Test
    public void play_raises_mood()
    {
        gochi.play();
        gochi.play();
        assertEquals(6, gochi.getMood());
    }

    @Test
    public void play_low_energy()
    {
        gochi.play();
        gochi.play();
        assertEquals(2, gochi.getEnergy());
    }

}
