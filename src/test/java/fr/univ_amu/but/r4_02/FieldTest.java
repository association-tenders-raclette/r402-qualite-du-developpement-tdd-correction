package fr.univ_amu.but.r4_02;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FieldTest {

    private Field field;

    @Before
    public void setUp() {
        field = new Field();
    }

    @Test
    public void testIsTickedTrueAfterTick() {
        field.tick(Tick.O);
        assertTrue(field.isTicked());
    }

    @Test
    public void testIsTickedFalseWhenWeInitObject() {
        assertFalse(field.isTicked());
    }

    @Test
    public void testGetTick() {
        field.tick(Tick.X);
        assertEquals(Tick.X, field.getTick());

    }

    @Test
    public void testTickX() {
        assertTrue(field.tick(Tick.X));
    }


    @Test
    public void testTickO() {
        assertTrue(field.tick(Tick.O));
    }


    @Test
    public void testTickXThenO() {
        assertTrue(field.tick(Tick.X));
        assertFalse(field.tick(Tick.O));
    }


    @Test
    public void testTickNull() {
        assertNull(field.getTick());
    }

}