package fr.univ_amu.but.r4_02;

import org.junit.Assert;
import org.junit.Test;

public class TickTest {

    @Test
    public void testValues() {
        Assert.assertEquals(2, Tick.values().length);
        Assert.assertEquals(Tick.X, Tick.valueOf("X"));
        Assert.assertEquals(Tick.O, Tick.valueOf("O"));
    }
}