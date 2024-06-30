package com.java;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import java.util.Random;

public class TestMatch {
    private Player playerA;
    private Player playerB;
    private Match match;
    private Random dice;

    @Before
    public void setUp() throws Exception {
        playerA = new Player(100, 10, 5);
        playerB = new Player(80, 8, 6);
        dice = new Random();
        match = new Match(playerA, playerB, dice);
    }

    @Test
    public void testMatchInitialization() {
        assertTrue(playerA.getHealth() > 0);
        assertTrue(playerB.getHealth() > 0);
    }

    @Test
    public void testStartMatch() {
        match.startMatch();
        assertTrue(playerA.getHealth() <= 0 || playerB.getHealth() <= 0);
    }
}
