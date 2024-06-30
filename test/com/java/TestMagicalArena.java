package com.java;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class TestMagicalArena {

    private Random dice;
    @Before
    public void setUp() throws Exception {
        dice = new Random();
    }

    @Test
    public void testPostProcessResult() throws Exception {
        Player playerA_tc1 = new Player(100, 10, 5);
        Player playerB_tc1 = new Player(50, 8, 6);
        Match match1 = new Match(playerA_tc1, playerB_tc1, this.dice);
        match1.startMatch();
        assertEquals(playerA_tc1.getHealth()<=0?"player B won the match":"player A won the match", MagicalArena.post_process_result(playerA_tc1, playerB_tc1));

        Player playerA_tc2 = new Player(50, 10, 5);
        Player playerB_tc2 = new Player(100, 8, 6);
        Match match2 = new Match(playerA_tc2, playerB_tc2, this.dice);
        match2.startMatch();
        assertEquals(playerA_tc2.getHealth()<=0?"player B won the match":"player A won the match", MagicalArena.post_process_result(playerA_tc2, playerB_tc2));
    }
}
