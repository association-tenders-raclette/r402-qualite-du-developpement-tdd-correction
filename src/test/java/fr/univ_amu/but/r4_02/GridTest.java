package fr.univ_amu.but.r4_02;

import fr.univ_amu.but.r4_02.exception.AlreadyTickedField;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GridTest {

    private Grid grid;

    @Before
    public void setUp() {
        grid = new Grid(3);
    }

    @Test
    public void testTickAnEmptyField() throws AlreadyTickedField {
        Position p = new Position(0,0);
        try {
            grid.tick(p, Tick.X);
        } catch (AlreadyTickedField e) {
            Assert.fail();
        }
    }

    @Test
    public void testTickANonEmptyField() throws AlreadyTickedField {
        Position p = new Position(0,0);
        grid.tick(p, Tick.X);

        Assert.assertThrows(AlreadyTickedField.class, () ->grid.tick(p, Tick.O));
    }

    @Test
    public void testIsFull() {
        Assert.assertFalse(grid.isFull());

    }

    @Test
    public void testIsFullWhenFull() throws AlreadyTickedField {
        tickAllFields();
        Assert.assertTrue(grid.isFull());
    }

    @Test
    public void testIsFullWhenNotFull() throws AlreadyTickedField {
        tickALotOfFields();
        Assert.assertFalse(grid.isFull());
    }

    private void tickAllFields() throws AlreadyTickedField {
        // | O | X | X |
        // | X | O | O |
        // | O | O | X |
        grid.tick(new Position(0, 0), Tick.O);
        grid.tick(new Position(0, 1), Tick.X);
        grid.tick(new Position(0, 2), Tick.X);

        grid.tick(new Position(1, 0), Tick.X);
        grid.tick(new Position(1, 1), Tick.O);
        grid.tick(new Position(1, 2), Tick.O);

        grid.tick(new Position(2, 0), Tick.O);
        grid.tick(new Position(2, 1), Tick.O);
        grid.tick(new Position(2, 2), Tick.X);
    }

    private void tickALotOfFields() throws AlreadyTickedField {
        grid.tick(new Position(0, 0), Tick.O);
        grid.tick(new Position(0, 1), Tick.X);
        grid.tick(new Position(1, 0), Tick.X);
        grid.tick(new Position(1, 1), Tick.O);
        grid.tick(new Position(2, 1), Tick.O);
        grid.tick(new Position(2, 2), Tick.X);
    }

    @Test
    public void lines() throws AlreadyTickedField {
        tickAllFields();
        Assert.assertEquals(3, grid.lines().size());
        Assert.assertEquals(3, grid.lines().get(0).size());
        Assert.assertEquals(3, grid.lines().get(1).size());
        Assert.assertEquals(3, grid.lines().get(2).size());

        Assert.assertEquals(Tick.O, grid.lines().get(0).get(0).getTick());
        Assert.assertEquals(Tick.X, grid.lines().get(0).get(1).getTick());
        Assert.assertEquals(Tick.X, grid.lines().get(0).get(2).getTick());

        Assert.assertEquals(Tick.X, grid.lines().get(1).get(0).getTick());
        Assert.assertEquals(Tick.O, grid.lines().get(1).get(1).getTick());
        Assert.assertEquals(Tick.O, grid.lines().get(1).get(2).getTick());

        Assert.assertEquals(Tick.O, grid.lines().get(2).get(0).getTick());
        Assert.assertEquals(Tick.O, grid.lines().get(2).get(1).getTick());
        Assert.assertEquals(Tick.X, grid.lines().get(2).get(2).getTick());
    }

    @Test
    public void columns() throws AlreadyTickedField {
        tickAllFields();

        Assert.assertEquals(3, grid.columns().size());
        Assert.assertEquals(3, grid.columns().get(0).size());
        Assert.assertEquals(3, grid.columns().get(1).size());
        Assert.assertEquals(3, grid.columns().get(2).size());

        Assert.assertEquals(Tick.O, grid.columns().get(0).get(0).getTick());
        Assert.assertEquals(Tick.X, grid.columns().get(0).get(1).getTick());
        Assert.assertEquals(Tick.O, grid.columns().get(0).get(2).getTick());

        Assert.assertEquals(Tick.X, grid.columns().get(1).get(0).getTick());
        Assert.assertEquals(Tick.O, grid.columns().get(1).get(1).getTick());
        Assert.assertEquals(Tick.O, grid.columns().get(1).get(2).getTick());

        Assert.assertEquals(Tick.X, grid.columns().get(2).get(0).getTick());
        Assert.assertEquals(Tick.O, grid.columns().get(2).get(1).getTick());
        Assert.assertEquals(Tick.X, grid.columns().get(2).get(2).getTick());
    }

    @Test
    public void diagonals() throws AlreadyTickedField {
        tickAllFields();

        Assert.assertEquals(2, grid.diagonals().size());
        Assert.assertEquals(3, grid.diagonals().get(0).size());
        Assert.assertEquals(3, grid.diagonals().get(1).size());

        Assert.assertEquals(Tick.O, grid.diagonals().get(0).get(0).getTick());
        Assert.assertEquals(Tick.O, grid.diagonals().get(0).get(1).getTick());
        Assert.assertEquals(Tick.X, grid.diagonals().get(0).get(2).getTick());

        Assert.assertEquals(Tick.X, grid.diagonals().get(1).get(0).getTick());
        Assert.assertEquals(Tick.O, grid.diagonals().get(1).get(1).getTick());
        Assert.assertEquals(Tick.O, grid.diagonals().get(1).get(2).getTick());
    }
}