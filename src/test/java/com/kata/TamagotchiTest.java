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
    public void eat_raises_energy_and_normal()
    {
        gochi.eat();
        gochi.eat();
        gochi.eat();
        gochi.eat();
        assertEquals(8, gochi.getEnergy());
        assertEquals("(:-|)", gochi.eat());
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
        gochi.sleep();
        gochi.sleep();
        gochi.play();
        gochi.play();
        gochi.eat();
        gochi.eat();
        gochi.play();
        gochi.play();
        assertEquals(9, gochi.getMood());
        assertEquals(":-)", gochi.play());
    }

    @Test
    public void play_low_energy()
    {
        gochi.play();
        gochi.play();
        assertEquals(2, gochi.getEnergy());
    }

}
