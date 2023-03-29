package fr.univ_amu.but.r4_02;

import org.junit.Assert;
import org.junit.Test;

public class PositionTest {


    @Test
    public void testEquals() {
        Position p1 = new Position(0,0);
        Position p2 = new Position(0,1);
        Position p3 = new Position(0,0);

        Assert.assertEquals(p1, p1);
        Assert.assertEquals(p1, p3);
        Assert.assertNotEquals(p1, p2);
    }

    @Test
    public void testHashCode() {
        Position p1 = new Position(0,0);
        Position p2 = new Position(0,1);
        Position p3 = new Position(0,0);

        Assert.assertEquals(p1.hashCode(), p1.hashCode());
        Assert.assertEquals(p1.hashCode(), p3.hashCode());
        Assert.assertNotEquals(p1.hashCode(), p2.hashCode());
    }

    @Test
    public void testToString() {
        Position p1 = new Position(0,0);
        Assert.assertEquals("[0,0]", p1.toString());
    }
}