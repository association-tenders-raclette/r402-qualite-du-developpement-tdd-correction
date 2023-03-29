package fr.univ_amu.but.r4_02;

import fr.univ_amu.but.r4_02.exception.TooManyTickOnConsecutiveFields;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class WinningValidatorTest {

    private WinningValidator winningValidator;

    @Before
    public void setUp() {
        winningValidator = new WinningValidator();
    }

    @Test
    public void testValidateWhenAllFieldHaveXTick() throws TooManyTickOnConsecutiveFields {
        List<Field> fields = new ArrayList<>();
        Field f1 = new Field();
        Field f2 = new Field();
        Field f3 = new Field();
        f1.tick(Tick.X);
        f2.tick(Tick.X);
        f3.tick(Tick.X);
        fields.add(f1);
        fields.add(f2);
        fields.add(f3);

        assertEquals(Tick.X, winningValidator.validate(fields));
    }

    @Test
    public void testValidateWhenAllFieldHaveOTick() throws TooManyTickOnConsecutiveFields {
        List<Field> fields = new ArrayList<>();
        Field f1 = new Field();
        Field f2 = new Field();
        Field f3 = new Field();
        f1.tick(Tick.O);
        f2.tick(Tick.O);
        f3.tick(Tick.O);
        fields.add(f1);
        fields.add(f2);
        fields.add(f3);

        assertEquals(Tick.O, winningValidator.validate(fields));
    }

    @Test
    public void testValidateWhenAllFieldHaveXTickOrOTick() {
        List<Field> fields = new ArrayList<>();
        Field f1 = new Field();
        Field f2 = new Field();
        Field f3 = new Field();
        f1.tick(Tick.X);
        f2.tick(Tick.O);
        f3.tick(Tick.X);
        fields.add(f1);
        fields.add(f2);
        fields.add(f3);

        assertThrows(TooManyTickOnConsecutiveFields.class, () -> winningValidator.validate(fields));
    }
    @Test
    public void testValidateWhenWeHaveOnlyOneField() throws TooManyTickOnConsecutiveFields {
        List<Field> fields = new ArrayList<>();
        Field f1 = new Field();
        f1.tick(Tick.O);
        fields.add(f1);

        assertEquals(Tick.O, winningValidator.validate(fields));
    }

}