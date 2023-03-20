package fr.univ_amu.but.r4_02;

import fr.univ_amu.but.r4_02.exception.TooManyTickOnConsecutiveFields;
import org.junit.Before;
import org.junit.Test;

public class WinningValidatorTest {

    private WinningValidator winningValidator;

    @Before
    public void setUp() {
        winningValidator = new WinningValidator();
    }

    @Test
    public void testValidateWhenAllFieldHaveXTick() throws TooManyTickOnConsecutiveFields {
        throw new UnsupportedOperationException("Not implemented yet");

    }

    @Test
    public void testValidateWhenAllFieldHaveOTick() throws TooManyTickOnConsecutiveFields {
        throw new UnsupportedOperationException("Not implemented yet");

    }

    @Test
    public void testValidateWhenAllFieldHaveXTickOrOTick() {
        throw new UnsupportedOperationException("Not implemented yet");

    }

}