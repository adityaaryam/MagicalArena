package com.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Before;
import org.junit.Test;

public class TestPlayer {
    private Player player;

    @Before
    public void setUp() throws Exception {
        player = new Player(100, 10, 5);
    }

    @Test
    public void testPlayerCreation() throws Exception {
        assertEquals(100, player.getHealth());
        assertEquals(10, player.getAttack());
        assertEquals(5, player.getStrength());
    }

    @Test
    public void testInvalidPlayerCreation() {
        assertThrows(Exception.class, () -> new Player(-1, 10, 5));
        assertThrows(Exception.class, () -> new Player(100, -10, 5));
        assertThrows(Exception.class, () -> new Player(100, 10, -5));
    }

    @Test
    public void testSetHealth() {
        player.setHealth(80);
        assertEquals(80, player.getHealth());
    }

    @Test
    public void testSetAttack() {
        player.setAttack(20);
        assertEquals(20, player.getAttack());
    }

    @Test
    public void testSetStrength() {
        player.setStrength(15);
        assertEquals(15, player.getStrength());
    }
}
