package fr.univ_amu.but.r4_02;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    public static final String PLAYER_NAME = "Player";

    public static final Tick PLAYER_TICK = Tick.X;


    private Player player;

    @Before
    public void setUp() {
        player = new Player(PLAYER_TICK, PLAYER_NAME);
    }

    @Test
    public void getTick() {
        assertEquals(PLAYER_TICK, player.getTick());
    }

    @Test
    public void getName() {
        assertEquals(PLAYER_NAME, player.getName());
    }
}