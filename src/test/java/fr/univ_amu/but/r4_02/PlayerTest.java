package fr.univ_amu.but.r4_02;

import org.junit.Before;
import org.junit.Test;

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
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Test
    public void getName() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}